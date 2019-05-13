/** A <code>LoadExpr</code> is called in the Parser.cup when an expression is attempting to grab a value from the hash table. <code>LoadExpr</code>
 * takes in one <code>String</code> variable that is used to grab it's value from the hash table.
 */

public class LoadExpr extends Expr{
	
	/** Declaring the String variable to load, the character location for the String variable, and the pointer
	 *  that references the String variable's location 
	 */
	private String variable;
	private int characterLocation;
	private String pointer;
	
	
	/** Constructor for the load class
	 */
	public LoadExpr(String v, int cl, String pointer) {
		assert pointer != null;
		this.variable = v;
		this.characterLocation = cl;
		this.pointer = pointer;
	}
	
	
	/** <code>toLLVM()</code> method that combines the information to create the necessary LLVM code. Before
	 * doing that, we test to make sure that the variable has already been declared.
	 */
	public ValueAndCode toLLVM() {
		if (pointer == null) {
			Compiler.error("Error at " + characterLocation + ". There is no value assigned to this variable!");
		}
		String reg_location = NameAllocator.getTempAllocator().next();
		String code = "    " + reg_location + " = " + "load" + " i32, i32* " + pointer + "\n";
		return new ValueAndCode(reg_location, code);
	}
	
}