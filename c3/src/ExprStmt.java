/** A statement that evaluates its body expression
 *  and then ignores the resulting value.  This only is useful
 *  if evaluating the expression has some side effect.
 */

public class ExprStmt extends Stmt {

	private Expr body;

	/** Construct an <code>ExprStmt</code> which evaluates the body expression.
	 *  @param body the expression to evalute (for its side effects)
	 */

	public ExprStmt(Expr body){
		this.body = body;
	}

	public String toLLVM(){
		return body.toLLVM().getCode();
	}
}
