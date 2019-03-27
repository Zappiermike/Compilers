/** An expression evaluated by calling a named procedure.
 *  Limitations: the procedure must take one <code>int</code> argument and return an <code>int</code> value.
 */

public class CallExpr extends Expr {

	private String procName;
	private Expr argument;

	/** Constructs a <code>CallExpr</code> with a given procedure name and argument.
	 *  @param procName the name of the procedure to call
	 *  @param argument the expression that computes the argument value
	 */

	public CallExpr(String procName, Expr argument){
		this.procName = procName;
		this.argument = argument;
	}

	public ValueAndCode toLLVM(){
		ValueAndCode argValAndCode = argument.toLLVM();
		String value = NameAllocator.getTempAllocator().next();
		String code = argValAndCode.getCode() +
				"    " + value + " = call i32 @" + procName + "(i32 " + argValAndCode.getValue() + ")\n";
		return new ValueAndCode(value, code);
	}
}
