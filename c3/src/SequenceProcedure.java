import java.util.*;


/** An Abstract Syntax Tree (AST) node representing a multi procedure. <code>SequenceProcedure</code>
 *  takes in a single procedure, adds it to a list of Procedures, converts it to its corresponding 
 *  LLVM code and then moves on. 
 */

public class SequenceProcedure{

	// Declaring variables, both are HashMaps that are either of type Procedure or ProcedureDecl

	private static Map<String, Procedure> procList = new HashMap<String, Procedure>();
	private static Map<String, ProcedureDecl> declProcedure = new HashMap<String, ProcedureDecl>();



	/** Constructor for the class.
	 *  @param p takes a Procedure and adds it to the list of Procedures
	 */ 
	public SequenceProcedure(){
		declProcedure.clear();
		procList.clear();
	}

	/** Constructor for the class.
	 *  @param procedure takes a Procedure and adds it to the list of Procedures
	 */ 
	public SequenceProcedure(Procedure procedure){
		this.add(procedure);
	}

	/** Constructor for the class.
	 *  @param declPro takes a ProcedureDecl and adds it to the list of ProcedureDecls
	 */ 
	public SequenceProcedure(ProcedureDecl declPro){
		this.add(declPro);
	}


	/** <code>add</code> is a void method that adds the Procedure <code>p</code>
	 *  to our list of Procedures. It appends our Procedure to the empty String <code>name</code>
	 *  by converting it to LLVM code. It also updates if there already exists a key in the
	 *  declared procedures
	 */
	public void add(Procedure p){
		String procedureName = p.getName();
		if (declProcedure.containsKey(procedureName)){
			declProcedure.remove(procedureName);
		}
		procList.put(procedureName, p);
	}

	/** <code>add</code> is a void method that adds the ProcedureDecl <code>p</code>
	 *  to our list of Declared Procedures. It appends our Procedure to the empty String <code>name</code>
	 *  by converting it to LLVM code. It also ensures that the keys does not exist in either of our
	 *  declared HashMaps.
	 */
	public void add(ProcedureDecl p){
		String procedureName = p.getName();
		if (!declProcedure.containsKey(procedureName) && !procList.containsKey(procedureName)) {
			declProcedure.put(procedureName, p);
		}
	}

	/** <code>declareCheck</code> is a boolean type that takes in two parameters
	 *  @param procedureName is the name of the Procedure
	 *  @param parameterAmt is the number of parameters with that Procedure
	 *  and evaluates whether the number of parameters line up with the correct 
	 *  Procedure being declared
	 */
	public static boolean declareCheck(String procedureName, int parameterAmt){
		ProcedureDecl procedureD = declProcedure.get(procedureName);
		return ((procedureD != null) && (parameterAmt == procedureD.getParamAmt()));
	}

	/** <code>declareCheck</code> is a boolean type that takes in two parameters
	 *  @param procedureName is the name of the Procedure
	 *  @param parameterAmt is the number of parameters with that Procedure
	 *  and evaluates whether the number of parameters line up with the correct 
	 *  Procedure being defined
	 */
	public static boolean defineCheck(String procedureName, int parameterAmt){
		Procedure procedure = procList.get(procedureName);
		return ((procedure != null) && (parameterAmt == procedure.getNameParams()));
	}

	/** <code>isDefined</code> is a boolean type that takes in one parameter
	 *  @param p is a String type as a Procedure name
	 *  that checks to see if our Procedure list contains that Procedure name.
	 *  If so, it will return true, otherwise false
	 */
	public static boolean isDefined(String p){
		return (procList.get(p) != null);
	}

	/** <code>contains</code> is a boolean type that takes in two parameters
	 *  @param procedureName is a String type as a Procedure name
	 *  @param parameterAmt is an int type that describes how many parameters there are.
	 *  The method checks to make sure that both the Procedure and ProcedureDecl match up
	 *  with the correct name as well as the correct number of parameters
	 */
	public static boolean contains(String procedureName, int parameterAmt){
		Procedure procedure = procList.get(procedureName);
		ProcedureDecl procedureD = declProcedure.get(procedureName);

		return ((procedureD != null) && (parameterAmt == procedureD.getParamAmt()) 
			|| (procedure != null) && (parameterAmt == procedure.getNameParams()));
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