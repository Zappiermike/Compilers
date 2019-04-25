/** A <code>IfElseStmt</code> is called in the Parser.cup when the scanner finds the keyword "if" and "else". This means the scanner has found a conditional 
 * if statement as well as an else statement. The if statement will have a condition and statements to follow if it evaluates to true. If it evaluates
 * to false, then the program jumps to the else statement and executes those statements. The three arguments are an <code>expression</code> and two
 *  <code>statements</code>.The <code>expression</code> is our condition that will determine which statement to execute.
 */

public class IfElseStmt extends Stmt{
	
	/** Declaration of our variables
	 */
	private Expr condition;
	private Stmt stmt;
	private Stmt second_stmt;
	
	
	/** Constructor for the class
	 */
	public IfElseStmt(Expr expression, Stmt statement, Stmt secondStatement) {
		this.condition = expression;
		this.stmt = statement;
		this.second_stmt= secondStatement;
	}
	
	
	/** The "meat" of this class. We first create three branches/labels that the compiler will jump to depending on
	 *  whether the condition evaluates to true or false. We get the necessary information from the expression that was 
	 *  passed in the beginning. Using all of this, we translate the code into LLVM code with the various branching
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
		
		// Returning LLVM string that will be evaluated.
		return obj_code + "   " + tmp_reg + " = icmp ne i32 " + value + ", 0\n" 
				+ "    br i1 " + tmp_reg + ", label %" + first_label + ", label %" 
				+ second_label + "\n" + first_label + ":\n" + stmt.toLLVM() 
				+ "    br label %" + third_label + "\n" + second_label + ":\n" 
				+ second_stmt.toLLVM() + "    br label %" + third_label + "\n" + third_label + ":\n";
	}
	
	
	
	
	
}