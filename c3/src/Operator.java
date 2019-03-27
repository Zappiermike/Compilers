/** An class extending Expr to act as a superclass for all mathematical operations done. 
 * It takes in two <code>expr</code> and can set the operand if the <cdoe>setOperand</code> method is called.
 */

public class Operator extends Expr {
	
	private String operator;
	private Expr left_operand;
	private Expr right_operand;
	
	/** Constructor for <code>Operator</code> from two <code>expr</code> arguments.
	 *  @param left the first expr argument
	 *  @param right the second expr argument
	 */
	public Operator(Expr left, Expr right){
		this.left_operand = left;
		this.right_operand = right;
	}
	
	/** Constructor for subclasses when initiated. Without this, there is a conflict 
	 * between this superclass' constructor and each subclass' constructor
	 */
	public Operator() {
	}
	
	/** Method that takes in one <code>string</code> argument to set the operator when 
	 * executing other commands like <code>SumSxpr</code> etc.
	 * @param string set to be the operator
	 * 
	 */
	public void setOperand(String op) {
		operator = op;
	}
	
	/** Generate the LLVM code that can be run to execute some mathematical operation.
	 *  @return a new string of LLVM code
	 */
	public ValueAndCode toLLVM() {
		ValueAndCode argVal_left = left_operand.toLLVM();
		ValueAndCode argVal_right = right_operand.toLLVM();
		String value = NameAllocator.getTempAllocator().next();
		String code = argVal_left.getCode() + argVal_right.getCode() + "    " + value + " = " + operator + " i32 "
				+ argVal_left.getValue() + ", " + argVal_right.getValue() + "\n";
		return new ValueAndCode(value, code);
	}
	
	
}