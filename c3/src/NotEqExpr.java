
/** An expression that takes in exactly two <code>expr</code> and returns the sum.
 */

public class NotEqExpr extends ComparisonExpr {

	public NotEqExpr(Expr left_arg, Expr right_arg) {
		super(left_arg, right_arg);
		operator = "ne";
	}
}