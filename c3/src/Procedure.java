import java.util.ArrayList;
import java.util.List;

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
	private String param;
	private String llvmVal;

	/** Constructs a <code>Procedure</code> with specified name and body.
	 *  @param name the procedure's name
	 *  @param body the statement to execute when the procedure is called
	 *  @param param the parameter when handling a condition in the Procedure
	 *  <code>llvmVal</code> grabs the value of our <code>param</code>
	 */

	public Procedure(String name, String param, Stmt body){
		this.name = name;
		this.param = param;
		this.body = body;
		llvmVal = SymbolTable.getTable().getVal(param);
	}

	/** Generate the LLVM code that defines this procedure.
	 *  @return a string of LLVM code. To handle allocation issues
	 *  we pause the procedure, extract all instances where variables are being declared
	 *  and then reinsert them into the code at the beginning.
	 */

	public String toLLVM(){
		String bodyCode = body.toLLVM();
		List<String> allocas = new ArrayList<String>();				// Create a new array of strings that will hold all the "alloca" declarations
		String [] splitCode = bodyCode.split("\n");					// Split the string based on \n
		
		for (int line = 0; line < splitCode.length; line++) {		// For loop that'll run through the length of our entire code body
			if (splitCode[line].indexOf("alloca") != -1) {			// Find lines containing "alloca", add them to allocas array, remove it from bodyCode
				allocas.add(splitCode[line]);
				splitCode[line] = "";
			}
		}
		
		bodyCode = String.join("\n", splitCode);					// Rejoin bodyCode by \n
		String allocated = String.join("\n", allocas);				// Rejoin all the "alloca" declarations by \n
		String temp = NameAllocator.getTempAllocator().next();
		
		return "\ndefine i32 @" + name + "(i32 " + temp + ") {\n" + llvmVal 
			+ " = alloca i32 ; parameter " + param + "\n store i32 " 
			+ temp + ", i32* " + llvmVal + "\n" + allocated + bodyCode + "}\n";
	}
}
