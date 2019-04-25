

public class WhileStmt extends Stmt{
	
	private Expr condition;
	private Stmt stmt;
	
	public WhileStmt(Expr expression, Stmt statement) {
		this.condition = expression;
		this.stmt = statement;
	}
	
	
	public String toLLVM() {
		String first_label = NameAllocator.getLabelAllocator().next();
		String second_label = NameAllocator.getLabelAllocator().next();
		String third_label = NameAllocator.getLabelAllocator().next();
		ValueAndCode obj = condition.toLLVM();
		String value = obj.getValue();
		String obj_code = obj.getCode();
		String tmp_reg = NameAllocator.getTempAllocator().next();
		return "    br label %" + first_label + "\n" 
				+ first_label + ":\n" + obj_code + "    "
				+ tmp_reg + " = icmp ne i32 " + value + ", 0\n"
				+ "    br i1 " + tmp_reg + ", label %" + second_label 
				+ ", label %" +	third_label + "\n" + second_label + ":\n" 
				+ stmt.toLLVM() + "    br label %" + first_label + "\n" + third_label + ":\n";
	}
	
	
	
	
	
}