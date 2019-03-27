/** A statement that evaluates an expression and returns the
 *  resulting value from the procedure in which the statement
 *  appears.
 */

public class ReturnStmt extends Stmt {

	private Expr toReturn;

	/** Construct a <code>ReturnStmt</code> which returns the value of the specified expression.
	 *  @param toReturn the expression to evaluate to produce the return value
	 */

	public ReturnStmt(Expr toReturn){
		this.toReturn = toReturn;
	}

	public String toLLVM(){
		ValueAndCode valAndCode = toReturn.toLLVM();
		String value = valAndCode.getValue();
		String valueCode = valAndCode.getCode();
		return valueCode +
				"    ret i32 " + value + "\n";
	}
}
