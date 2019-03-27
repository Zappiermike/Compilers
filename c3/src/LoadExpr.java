

public class LoadExpr extends Expr{
	
	private String variable;
	
	public LoadExpr(String v) {
		this.variable = v;
	}
	
	
	// toLLVM() method that combines the information to create the necessary LLVM code. It also inserts the 
	public ValueAndCode toLLVM() {
		String reg_location = NameAllocator.getTempAllocator().next();
		String code = "    " + reg_location + " = " + "load" + " i32, i32* " + SymbolTable.getVal(variable) + "\n";
		return new ValueAndCode(reg_location, code);
	}
	
}