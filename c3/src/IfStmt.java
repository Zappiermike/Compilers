

public class IfStmt extends Stmt{
	
	
	private Expr condition;
	private Stmt stmt;
	
	public IfStmt(Expr expression, Stmt statement) {
		this.stmt = statement;
		this.condition = expression;
	}
	
	
	public String toLLVM() {
		String first_label = NameAllocator.getLabelAllocator().next();
		String second_label = NameAllocator.getLabelAllocator().next();
		
		ValueAndCode obj = condition.toLLVM();
		String value = obj.getValue();
		String obj_code = obj.getCode();
		String tmp_reg = NameAllocator.getTempAllocator().next();
		return obj_code + "    " + tmp_reg + " = icmp ne i32 " + value + ", 0\n" 
				+ "    br i1 " + tmp_reg + ", label %" + first_label + ", label %"
				+ second_label + "\n" + first_label + ":\n" + stmt.toLLVM() 
				+ "    br label %" + second_label + "\n" + second_label + ":\n";
	}
	
	
	
	
	
}