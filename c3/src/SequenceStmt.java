/** A <code>SequenceStmt</code> combines together two smaller statements.
 *  To execute the <code>SequenceStmt</code>, the two constituent statements
 *  are executed in sequence.
 */

public class SequenceStmt extends Stmt {

	private Stmt s1, s2;

	/** Constructs a <code>SequenceStmt</code> from two smaller statements.
	 *  @param s1 the first statement to execute
	 *  @param s2 the second statement to execute
	 */

	public SequenceStmt(Stmt s1, Stmt s2){
		this.s1 = s1;
		this.s2 = s2;
	}

	public String toLLVM(){
		return s1.toLLVM() + s2.toLLVM();
	}
}
