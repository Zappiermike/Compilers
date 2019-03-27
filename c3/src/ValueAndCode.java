/** A <code>ValueAndCode</code> object packages together the two results of translating an expression into LLVM.
 *  The value component is either a constant or an LLVM name.
 *  The code component is the LLVM code that needs to be executed in order to evaluate the expression.  If the
 *  value component is a constant, then the code component will presumably be an empty string.  But if the value
 *  component is a name, then the code component provides the definition of that name.
 */

public class ValueAndCode {

	private String value;
	private String code;

	/** Construct a <code>ValueAndCode</code> object.
	 *  @param value the constant or LLVM name
	 *  @param code  the LLVM code (possibly empty)
	 */

	public ValueAndCode(String value, String code){
		this.value = value;
		this.code = code;
	}

	/** Retrieves the constant or the name that will, at run time, hold the value.
	 *  @return the value component
	 */

	public String getValue(){
		return value;
	}

	/** Retrieves the LLVM code that will, at runtime, cause the name to hold the value.
	 *  @return the code compoent.
	 */

	public String getCode(){
		return code;
	}
}
