import java.util.*;

/** An Abstract Syntax Tree (AST) node representing a procedure.
 *  Limitations:
 *  <ol>
 *   <li>the procedure must not expect any arguments (the <code>main</code>
 *       procedure is actually passed arguments, but will ignore them)</li>
 *   <li>the procedure's return type must be <code>int</code></li>
 *   <li>there is currently no provision for allocating local variables</li>
 *  </ol>
 */

public class Procedure {

	private String name;
	private Stmt body;
	private List<String> params;
	private List<String> llvmp;
	//public List<String> nameCheck;

	/** Constructs a <code>Procedure</code> with specified name and body.
	 *  @param name the procedure's name
	 *  @param body the statement to execute when the procedure is called
	 *  @param param the parameter when handling a condition in the Procedure
	 *  <code>llvmVal</code> grabs the value of our <code>param</code>
	 */

	public Procedure(String name, List<String> params, Stmt body){
		this.name = name;
		this.params = params;
		this.body = body;
		llvmp = new ArrayList<String>();
		//nameCheck = new ArrayList<String>();
		for (String param: params) {
			llvmp.add(SymbolTable.getTable().getVal(param));
		}

	}

	public String getName(){
		return name;
	}

	public int getNameParams() {
		return params.size();
	}



	private String organize(String code){
		Scanner sc = new Scanner(code);
		StringBuilder alloca = new StringBuilder("");
		StringBuilder other = new StringBuilder("");
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			if (line.contains("alloca")) {
				alloca.append(line);
				alloca.append("\n");
			} else{
				other.append(line);
				other.append("\n");
			}
		}
		sc.close();
		return alloca.append(other).toString();
	}

	/** Generate the LLVM code that defines this procedure.
	 *  @return a string of LLVM code. To handle allocation issues
	 *  we pause the procedure, extract all instances where variables are being declared
	 *  and then reinsert them into the code at the beginning.
	 */

	public String toLLVM(){

		// if (nameCheck.contains(name)){
		// 	Compiler.error("The procedure name: " + name + " has already been defined");
		// }else{
		// 	nameCheck.add(name);
		// 	System.err.println("added " + name + "\n The list is now: " + nameCheck);
		// }
		StringBuilder start = new StringBuilder("");
		StringBuilder bodyCode = new StringBuilder("\ndefine i32 @");
		bodyCode.append(name);
		bodyCode.append("(");

		for (int i = 0; i < params.size(); i++) {
			String param = params.get(i);
			String llvmparam = llvmp.get(i);
			String temp_reg = NameAllocator.getTempAllocator().next();

			if (i > 0) {
				bodyCode.append(", ");
			}
			bodyCode.append("i32 ");
			bodyCode.append(temp_reg);

			start.append("    ");
			start.append(llvmparam);
			start.append(" = alloca i32");
			start.append("; parameter ");
			start.append(param);
			start.append("\n    store i32");
			start.append(temp_reg);
			start.append(", i32* ");
			start.append(llvmparam);
			start.append("\n");
		}
		bodyCode.append(") {\n");

		StringBuilder total = new StringBuilder(bodyCode);
		total.append(start);
		total.append(organize(body.toLLVM()));
		total.append("}\n");

		return total.toString();
	}
}
