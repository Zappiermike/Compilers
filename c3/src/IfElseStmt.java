

public class IfElseStmt extends Stmt{
	
	
	private Expr condition;
	private Stmt stmt;
	private Stmt second_stmt;
	
	public IfElseStmt(Expr expression, Stmt statement, Stmt secondStatement) {
		this.condition = expression;
		this.stmt = statement;
		this.second_stmt= secondStatement;
	}
	
	
	public String toLLVM() {
		String first_label = NameAllocator.getLabelAllocator().next();
		String second_label = NameAllocator.getLabelAllocator().next();
		String third_label = NameAllocator.getLabelAllocator().next();
		ValueAndCode obj = condition.toLLVM();
		String value = obj.getValue();
		String obj_code = obj.getCode();
		String tmp_reg = NameAllocator.getTempAllocator().next();
		return obj_code + "   " + tmp_reg + " = icmp ne i32 " + value + ", 0\n" 
				+ "    br i1 " + tmp_reg + ", label %" + first_label + ", label %" 
				+ second_label + "\n" + first_label + ":\n" + stmt.toLLVM() 
				+ "    br label %" + second_label + "\n" + second_label + ":\n" 
				+ second_stmt.toLLVM() + "    br label %" + third_label + "\n" + third_label + ":\n";
	}
	
	
	
	
	
}