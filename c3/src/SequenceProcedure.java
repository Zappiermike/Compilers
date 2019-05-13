import java.util.*;


/** An Abstract Syntax Tree (AST) node representing a multi procedure. <code>SequenceProcedure</code>
 *  takes in a single procedure, adds it to a list of Procedures, converts it to its corresponding 
 *  LLVM code and then moves on. 
 */

public class SequenceProcedure{

	// Declaring variablse

	private List<Procedure> procList = new ArrayList<Procedure>();
	private String name = "";





	/** Constructor for the class.
	 *  @param p takes a Procedure and adds it to the list of Procedures
	 */ 
	public SequenceProcedure(Procedure p){
		this.add(p);
	}

	/** <code>add</code> is a void method that adds the Procedure <code>p</code>
	 *  to our list of Procedures. It appends our Procedure to the empty String <code>name</code>
	 *  by converting it to LLVM code.
	 */
	public void add(Procedure p){
		procList.add(p);
		name += p.toLLVM();
	}

	/** <code>toLLVM</code> is a String method that returns the Procedures that were passed in
	 *  as an argument. The Procedures are converted to their accodring LLVM code before being 
	 *  sent in the String <code>name</code>
	 */
	public String toLLVM(){
		return name;
	}
}