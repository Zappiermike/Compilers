import java.util.Map;
import java.util.HashMap;


/** The <code>SymbolTable</code> class holds the information for our hash table that connects declared variables and their
 * according values, if they have any. Methods are given to support inserting, removing, and verifying that variables exist.
 */

public class SymbolTable {
	
	/** Initialize the <code>hash table</code> to be used in the class
	 */
	private static Map<String,String> table = new HashMap<String,String>();
	
	
	/** <code>setVal</code> is a static void method that puts a given key/value pair inside our hash table
	 */
	public static void setVal(String variable, String reg_location) {
		table.put(variable, reg_location);
	}
	
	/** <code>getVal</code> is a static string method that returns the value located in the hash table based
	 * on a given string variable name 
	 */
	public static String getVal(String variable_name) {
		return table.get(variable_name);
	}
	

	/**	<code>exists</code> is a static boolean method to check if a key exists in the hash table
	 */
	public static boolean exists(String key) {
		return table.containsKey(key);
	}

	
	
}