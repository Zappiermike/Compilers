


/** An expression that takes in exactly two <code>expr</code> and returns the sum.
 */

public class MoreExpr extends ComparisonExpr {

	public MoreExpr(Expr left_arg, Expr right_arg) {
		super(left_arg, right_arg);
		operator = "sgt";
	}	
}