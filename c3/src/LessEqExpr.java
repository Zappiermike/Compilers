
/** <code>LessEqExpr</code> is a subclass from <code>ComparisonExpr</code> that is called when the parser.cup is given "<=" by the scanner
 */

public class LessEqExpr extends ComparisonExpr {

	/**	<code>LessEqExpr</code> constructor that takes two <code>Expr</code> arguments, and then passes them to the superclass <code>ComparisonExpr</code>. 
	 */
	public LessEqExpr(Expr left_arg, Expr right_arg) {
		super(left_arg, right_arg);
		operator = "sle";
	}
}