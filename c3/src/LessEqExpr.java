
/** An expression that takes in exactly two <code>expr</code> and returns the sum.
 */

public class LessEqExpr extends ComparisonExpr {

	private Expr left_int;
	private Expr right_int;
	
	
	/** Constructs a <code>SumExpr</code> from two <code>expr</code> arguments.
	 *  @param left the first expr argument
	 *  @param right the second expr argument
	 */
	
	public LessEqExpr(Expr left, Expr right) {
		this.left_int = left;
		this.right_int = right;
		
	}

	/** Creates a new <code>Operator</code> object from the two constructor arguments, sets the operand using
	 * the <code>setOperand</code> method, and then uses that superclass's method <code>toLLVM()</code>
	 *  @param <code>left_int</code> is the first argument
	 *  @param <code>right_int</code> is the second argument
	 */
	public ValueAndCode toLLVM() {
		ComparisonExpr comparison = new ComparisonExpr(left_int, right_int);
		comparison.setComp("sle");
		return comparison.toLLVM();
	}	
}