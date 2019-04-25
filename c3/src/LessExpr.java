
/** <code>LessExpr</code> is a subclass from <code>ComparisonExpr</code> that is called when the parser.cup is given "<" by the scanner
 */

public class LessExpr extends ComparisonExpr {
	
	/**	<code>LessExpr</code> constructor that takes two <code>Expr</code> arguments, and then passes them to the superclass <code>ComparisonExpr</code>. 
	 */
	public LessExpr(Expr left_arg, Expr right_arg) {
		super(left_arg, right_arg);
		operator = "slt";
	}	
}