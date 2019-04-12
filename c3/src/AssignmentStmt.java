/** A <code>AssignmentStmt</code> is called in the Parser.cup when a value is wanting to be assigned to a specific variable.
 *  <code>AssignmentStmt</code> takes in two arguments, one <code>Expression</code> and one <code>String</code> to reflect the key/value pair.
 * The class contains the <code>toLLVM</code> method to send the information correctly after the correct <code>key</code> and 
 * <code>value</code> have been given.
 */

public class AssignmentStmt extends Stmt {
	
	
	/** Declaring the key and value pair
	 */
	private Expr value;
	private String key;
	private int characterLocation;
	
	/** Constructor for the class
	 */	
	public AssignmentStmt(String k, Expr v, int cl) {
		this.key = k;
		this.value = v;
		this.characterLocation = cl;
	}
	
	/** <code>toLLVM</code> method that first checks to make sure that the variable we are assigning has been
	 * declared already. If it has not, the code will stop and throw an error.
	 */
	public String toLLVM() {
		// Error needs to be thrown if trying to assign something that has not been declared
		Compiler.reportErrorAssign(key, characterLocation);
		ValueAndCode llvm = value.toLLVM();
		return llvm.getCode() + "   " + " store" + " i32 " + llvm.getValue() + ", " + "i32* " + SymbolTable.getVal(key) + "\n";
	};
}