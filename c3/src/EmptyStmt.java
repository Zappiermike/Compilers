/** A <code>EmptyStmt</code> is called in the Parser.cup when no statement arguments are given. To reflect this, this class returns nothing
 */

public class EmptyStmt extends Stmt {

	/** Constructs a <code>SequenceStmt</code> from two smaller statements.
	 *  @param s1 the first statement to execute
	 *  @param s2 the second statement to execute
	 */
 
	/** Empty constructor that gets created when called
	 */
	public EmptyStmt(){
	}
	
	/** Sends an empty string to the LLVM as this class is only called when 
	 * Parser.cup has zero statements/arguments.
	 */
	public String toLLVM(){
		return "";
	}
}
