import java.util.*;


public class ProcedureDecl {
	private String proc;
	private List<String> parameters;

	public ProcedureDecl(String p, List<String> params){
		this.proc = p;
		this.parameters = params;
	}


	public String getName(){
		return proc;
	}

	public int getParamAmt() {
		return parameters.size();
	}

	public String toLLVM(){
		StringBuilder code = new StringBuilder("\ndeclare i32 @");
		code.append(proc);
		code.append("(");

		if(parameters.size() > 0){
			code.append("i32");
		}
		for (int i = 1; i < parameters.size(); i++){
			code.append(", i32");
		}
		code.append(")\n");

		return code.toString();
	}
}