/** An expression evaluated by calling a named procedure.
 *  Limitations: the procedure must take one <code>int</code> argument and return an <code>int</code> value.
 */
import java.util.*;
public class CallExpr extends Expr {

	private String procName;
	private List<Expr> argument;

	/** Constructs a <code>CallExpr</code> with a given procedure name and argument.
	 *  @param procName the name of the procedure to call
	 *  @param argument the expression that computes the argument value
	 */

	public CallExpr(String procName, List<Expr> argument){
		this.procName = procName;
		this.argument = argument;
	}
 
	/** <code>LLVM</code> method is a <code>ValueAndCode</code> type that converts the
	 *  the given inputs into LLVM string that the compiler will understand. This 
	 *  includes sorting all the alloca's to the top of the compiler
	 */
	public ValueAndCode toLLVM(){
		String value = NameAllocator.getTempAllocator().next();
		StringBuilder start = new StringBuilder("");
		StringBuilder body = new StringBuilder("    ");
		body.append(value);
		body.append(" = call i32 @");
		body.append(procName);
		body.append("(");
		
		for (int i = 0; i < argument.size(); i++){
			Expr e = argument.get(i);
			ValueAndCode vc = e.toLLVM();
			start.append(vc.getCode());
			if (i > 0) {
				body.append(", ");
			}
			body.append("i32 ");
			body.append(vc.getValue());
		}
		body.append(")\n");

		StringBuilder total = new StringBuilder(start);
		total.append(body);
		return new ValueAndCode(value, total.toString());
	}
}
