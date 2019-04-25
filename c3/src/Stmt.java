/** An Abstract Syntax Tree (AST) node representing a statement.
 */

public abstract class Stmt {

	/** Generate the LLVM code that should be executed to execute this statement.
	 *  @return a string of LLVM code
	 */

	public abstract String toLLVM();

}
