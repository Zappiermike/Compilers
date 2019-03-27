

public class DeclarationStmt extends Stmt {

	/** Generate the LLVM code that should be executed to execute this statement.
	 *  @return a string of LLVM code
	 */
	
	// String to take place as the label for the declared variable
	public String var_name;
	
	// Constructor
	public DeclarationStmt(String variable) {
		this.var_name = variable;
	}
	

	// toLLVM() method that combines the information to create the necessary LLVM code. It also inserts the 
	public String toLLVM() {
		String reg_location = NameAllocator.getTempAllocator().next();
		String code = "    " + reg_location + " = " + "alloca" + " i32 " + "\n";
		SymbolTable.setVal(var_name, reg_location);
		return code;
	};

}
