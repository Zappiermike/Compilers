/** A <code>LoadExpr</code> is called in the Parser.cup when an expression is attempting to grab a value from the hash table. <code>LoadExpr</code>
 * takes in one <code>String</code> variable that is used to grab it's value from the hash table.
 */

public class LoadExpr extends Expr{
	
	/** Declaring the String variable
	 */
	private String variable;
	private int characterLocation;
	
	
	/** Constructor for the load class
	 */
	public LoadExpr(String v, int cl) {
		this.variable = v;
		this.characterLocation = cl;
	}
	
	
	/** <code>toLLVM()</code> method that combines the information to create the necessary LLVM code. Before
	 * doing that, we test to make sure that the variable has already been declared.
	 */
	public ValueAndCode toLLVM() {
		if (SymbolTable.getTable().getVal(variable) == null) {
			Compiler.error("Error at " + characterLocation + ". There is no value assigned to this variable!");
		}
		String reg_location = NameAllocator.getTempAllocator().next();
		String code = "    " + reg_location + " = " + "load" + " i32, i32* " + SymbolTable.getTable().getVal(variable) + "\n";
		return new ValueAndCode(reg_location, code);
	}
	
}