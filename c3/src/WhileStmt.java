/** A <code>WhileStmt</code> is called in the Parser.cup when the scanner finds the keyword "while". This means the scanner has found a 
 * conditional while statement that will have a condition and statements to follow if that condition is true. The two arguments are 
 * an <code>expression</code> and a <code>statement</code>. The <code>expression</code> is our condition that will determine if 
 * the <code>statement</code> is true.
 */

public class WhileStmt extends Stmt{
	
	/** Declaring the variables
	 */
	
	private Expr condition;
	private Stmt stmt;
	
	
	/** Constructor for the class
	 */
	public WhileStmt(Expr expression, Stmt statement) {
		this.condition = expression;
		this.stmt = statement;
	}
	
	/** The "meat" of this class. We first create three branches/labels that the compiler will jump to depending on
	 *  whether the condition evaluates to true. If the condition is true, we execute the statements contained within. Then we run the condition again,
	 *  and if it still evaluates to true then we re-run the same statements. This continues until the condition is no longer met. In that case, the 
	 *  compiler jumps past the while statement. Using all of this, we translate the code into LLVM code with the various branching
	 *  possibilities.
	 */
	public String toLLVM() {
		// Creating the labels
		String first_label = NameAllocator.getLabelAllocator().next();
		String second_label = NameAllocator.getLabelAllocator().next();
		String third_label = NameAllocator.getLabelAllocator().next();
		
		ValueAndCode obj = condition.toLLVM();
		String value = obj.getValue();
		String obj_code = obj.getCode();
		String tmp_reg = NameAllocator.getTempAllocator().next();
		
		// String code that gets translated into LLVM code
		return "    br label %" + first_label + "\n" 
				+ first_label + ":\n" + obj_code + "    "
				+ tmp_reg + " = icmp ne i32 " + value + ", 0\n"
				+ "    br i1 " + tmp_reg + ", label %" + second_label 
				+ ", label %" +	third_label + "\n" + second_label + ":\n" 
				+ stmt.toLLVM() + "    br label %" + first_label + "\n" + third_label + ":\n";
	}
	
	
	
	
	
}