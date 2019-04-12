/** A <code>DeclarationtStmt</code> is called in the Parser.cup when a variable is wanting to be created.
 *  <code>DeclarationStmt</code> takes in one <code>String</code> to reflect the variable name.
 * The class contains the <code>toLLVM</code> method to send the information correctly after 
 * the correct variable is given
 */

public class DeclarationStmt extends Stmt {

	/** Generate the LLVM code that should be executed to execute this statement.
	 *  @return a string of LLVM code
	 */
	
	
	/** String <code>var_name</code> to take place as the label for the declared variable
	 */	
	private String var_name;
	private int character_location;
	
	
	
	/** Constructor for the class
	 */	
	public DeclarationStmt(String variable, int cl) {
		this.var_name = variable;
		this.character_location = cl;
	}
	

	/** <code>toLLVM</code> method that first checks to make sure that the variable we are declaring 
	 * has not already been declared. If the variable is a duplicate, the code will stop and throw and error.
	 */	
	public String toLLVM() {
            Compiler.reportErrorDecl(var_name, character_location);
			String reg_location = NameAllocator.getTempAllocator().next();
			String code = "    " + reg_location + " = " + "alloca" + " i32 " + "\n";
			SymbolTable.setVal(var_name, reg_location);
			return code;
		}
	};
