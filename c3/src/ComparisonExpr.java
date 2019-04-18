


/** An expression that takes in exactly two <code>expr</code> and returns the sum.
 */

public class ComparisonExpr extends Expr {

		
	private String operator;
	private Expr left_operand;
	private Expr right_operand;
	
	/** Constructor for <code>Operator</code> from two <code>expr</code> arguments.
	 *  @param left the first expr argument
	 *  @param right the second expr argument
	 */
	public ComparisonExpr(Expr left, Expr right){
		this.left_operand = left;
		this.right_operand = right;
	}
	
	/** Constructor for subclasses when initiated. Without this, there is a conflict 
	 * between this superclass' constructor and each subclass' constructor
	 */
	public ComparisonExpr() {
	}
	
	/** Method that takes in one <code>string</code> argument to set the operator when 
	 * executing other commands like <code>SumSxpr</code> etc.
	 * @param string set to be the operator
	 * 
	 */
	public void setComp(String c) {
		operator = c;
	}
	
	/** Generate the LLVM code that can be run to execute some mathematical operation.
	 *  @return a new string of LLVM code
	 */
	public ValueAndCode toLLVM() {
		ValueAndCode argVal_left = left_operand.toLLVM();
		ValueAndCode argVal_right = right_operand.toLLVM();
		String leftChunk = argVal_left.getCode() + argVal_left.getValue();
		String rightChunk = argVal_right.getCode() + argVal_right.getValue();
		String value = NameAllocator.getTempAllocator().next();
		String code = "   " + value + " = zext i1 icmp " + operator + " (i32 " + leftChunk + ", i32 " + rightChunk + ") to i32 \n";
		return new ValueAndCode(value, code);
	}
	
		
	
	
}