
/** <code>EqEqExpr</code> is a subclass from <code>ComparisonExpr</code> that is called when the parser.cup is given "==" by the scanner
 */

public class EqEqExpr extends ComparisonExpr {

	/**	<code>EqEqExpr</code> constructor that takes two arguments, and then passes them to the superclass <code>ComparisonExpr</code>. 
	 */
	public EqEqExpr(Expr left_arg, Expr right_arg) {
		super(left_arg, right_arg);
		operator = "eq";
	}
}