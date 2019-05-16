import java.util.*;


/** An Abstract Syntax Tree (AST) node representing a multi procedure. <code>SequenceProcedure</code>
 *  takes in a single procedure, adds it to a list of Procedures, converts it to its corresponding 
 *  LLVM code and then moves on. 
 */

public class SequenceProcedure{

	// Declaring variablse

	private static Map<String, Procedure> procList = new HashMap<String, Procedure>();
	private static Map<String, ProcedureDecl> declProcedure = new HashMap<String, ProcedureDecl>();



	/** Constructor for the class.
	 *  @param p takes a Procedure and adds it to the list of Procedures
	 */ 
	public SequenceProcedure(){
		declProcedure.clear();
		procList.clear();
	}


	public SequenceProcedure(Procedure procedure){
		this.add(procedure);
	}

	public SequenceProcedure(ProcedureDecl declPro){
		this.add(declPro);
	}



	public void add(Procedure p){
		String procedureName = p.getName();
		if (declProcedure.containsKey(procedureName)){
			declProcedure.remove(procedureName);
		}
		procList.put(procedureName, p);
	}

	/** <code>add</code> is a void method that adds the Procedure <code>p</code>
	 *  to our list of Procedures. It appends our Procedure to the empty String <code>name</code>
	 *  by converting it to LLVM code.
	 */
	public void add(ProcedureDecl p){
		String procedureName = p.getName();
		if (!declProcedure.containsKey(procedureName) && !procList.containsKey(procedureName)) {
			declProcedure.put(procedureName, p);
		}
	}

	/** <code>toLLVM</code> is a String method that returns the Procedures that were passed in
	 *  as an argument. The Procedures are converted to their accodring LLVM code before being 
	 *  sent in the String <code>name</code>
	 */
	public String toLLVM(){
		StringBuilder code = new StringBuilder("");
		for (ProcedureDecl decl : declProcedure.values()) {
			code.append(decl.toLLVM());
		}
		for (Procedure p : procList.values()) {
			code.append(p.toLLVM());
		}
		return code.toString();
	}
}