/** An Abstract Syntax Tree (AST) node representing an expression.
 */

public abstract class Expr {

	/** Generate the LLVM code that should be executed to evaluate this expression.
	 *  @return a {@link ValueAndCode} object packaging together two facts:
	 *  <ol>
	 *   <li>the name that the LLVM code will compute the value into</li>
	 *   <li>the LLVM code itself</li>
	 *  </ol>
	 */

	public abstract ValueAndCode toLLVM();

}
