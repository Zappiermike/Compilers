import java.util.Map;
import java.util.HashMap;


public class SymbolTable {
	
	// Initialize the table to be used within this class
	private static Map<String,String> table = new HashMap<String,String>();
	
	
	// Void method that puts a key/value pair inside our hash table
	public static void setVal(String variable, String reg_location) {
		table.put(variable, reg_location);
	}
	
	// Method to retrieve the value information using the key
	public static String getVal(String variable_name) {
		return table.get(variable_name);
	}
	
	// Method to return the table in toString format
	public String toString() {
		return table.toString();
	}

	
	
}