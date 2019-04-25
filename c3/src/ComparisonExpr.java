


/** An expression that takes in exactly two <code>expr</code> and returns the sum.
 */

public abstract class ComparisonExpr extends Expr {

	protected String operator;
	protected Expr left_operand;
	protected Expr right_operand;
	
	/** Constructor for <code>Operator</code> from two <code>expr</code> arguments.
	 *  @param left the first expr argument
	 *  @param right the second expr argument
	 */
	public ComparisonExpr(Expr left, Expr right){
		this.left_operand = left;
		this.right_operand = right;
		operator = "";
	}
	
	/** Constructor for subclasses when initiated. Without this, there is a conflict 
	 * between this superclass' constructor and each subclass' constructor
	 */
	public ComparisonExpr() {
	}
	
	
	/** Generate the LLVM code that can be run to execute some mathematical operation.
	 *  @return a new string of LLVM code. This combines all the information that we've 
	 *  collected and puts it all into a string that the LLVM will be able to understand.
	 */
	public ValueAndCode toLLVM() {
		ValueAndCode argVal_left = left_operand.toLLVM();
		ValueAndCode argVal_right = right_operand.toLLVM();
		String first_value = NameAllocator.getTempAllocator().next();
		String second_value = NameAllocator.getTempAllocator().next();
		String code = argVal_left.getCode() + argVal_right.getCode() + "    " + first_value + " = icmp " + 
				operator + " i32 " + argVal_left.getValue() + ", " + argVal_right.getValue() + " \n    " + 
				second_value + " = zext i1 " + first_value + " to i32\n";
		return new ValueAndCode(second_value, code);
	}
	
		
	
	
}