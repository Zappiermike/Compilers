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

	/** Constructs a <code>Procedure</code> with specified name and body.
	 *  @param name the procedure's name
	 *  @param body the statement to execute when the procedure is called
	 */

	public Procedure(String name, Stmt body){
		this.name = name;
		this.body = body;
	}

	/** Generate the LLVM code that defines this procedure.
	 *  @return a string of LLVM code
	 */

	public String toLLVM(){
		String bodyCode = body.toLLVM();
		return "\ndefine i32 @" + name + "() {\n" +
		bodyCode +
		"}\n";
	}
}
