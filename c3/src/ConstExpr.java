/** An expression that is a constant (necessarily an integer, at least for now).
 */

public class ConstExpr extends Expr {

	private int value;

	/** Constructs an <code>ConstExpr</code> with the specified value.
	 *  @param value the specific integer constant
	 */

	public ConstExpr(int value){
		this.value = value;
	}

	/** Generate the LLVM code that should be executed to evaluate this expression.
	 *  @return a {@link ValueAndCode} object packaging together two facts:
	 *  <ol>
	 *   <li>the constant itself (which in LLVM can serve in place of a name)</li>
	 *   <li>an empty string of LLVM code, since no code must be executed to produce the value</li>
	 *  </ol>
	 */

	public ValueAndCode toLLVM(){
		return new ValueAndCode("" + value, "");
	}
}
