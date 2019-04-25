/** A <code>IfStmt</code> is called in the Parser.cup when the scanner finds the keyword "if". This means the scanner has found a conditional if statement
 * that will have a condition and statements to follow if that condition is true. The two arguments are an <code>expression</code> and a <code>statement</code>.
 * The <code>expression</code> is our condition that will determine if the <code>statement</code> is true.
 */

public class IfStmt extends Stmt{

	
	/** Declaration of our variables
	 */
	
	private Expr condition;
	private Stmt stmt;
	
	
	/** Constructor for the class
	 */
	public IfStmt(Expr expression, Stmt statement) {
		this.stmt = statement;
		this.condition = expression;
	}
	
	
	/** The "meat" of this class. We first create two branches/labels that the compiler will jump to depending on
	 *  whether the condition evaluates to true. We get the necessary information from the expression that was 
	 *  passed in the beginning. Using all of this, we translate the code into LLVM code with the various branching
	 *  possibilities.
	 */
	public String toLLVM() {
		// Creating labels
		String first_label = NameAllocator.getLabelAllocator().next();
		String second_label = NameAllocator.getLabelAllocator().next();
		
		ValueAndCode obj = condition.toLLVM();
		String value = obj.getValue();
		String obj_code = obj.getCode();
		String tmp_reg = NameAllocator.getTempAllocator().next();
		
		// Returning LLVM string that will be evaluated.
		return obj_code + "    " + tmp_reg + " = icmp ne i32 " + value + ", 0\n" 
				+ "    br i1 " + tmp_reg + ", label %" + first_label + ", label %"
				+ second_label + "\n" + first_label + ":\n" + stmt.toLLVM() 
				+ "    br label %" + second_label + "\n" + second_label + ":\n";
	}
	
	
	
	
	
}