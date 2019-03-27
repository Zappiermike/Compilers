

public class AssignmentStmt extends Stmt {
	
	public Expr value;
	public String key;
	
	
	public AssignmentStmt(String k, Expr v) {
		this.key = k;
		this.value = v;
	}
	

	public String toLLVM() {
		// Storing value at symboltable.getval(key)'s value location
		ValueAndCode llvm = value.toLLVM();
		
		return llvm.getCode() + "   " + " store" + " i32 " + llvm.getValue() + ", " + "i32* " + SymbolTable.getVal(key) + "\n";
	};
}