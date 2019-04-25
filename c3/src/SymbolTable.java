/** <code>SymbolTable</code> is a class that creates a new HashTable that will hold our information regarding keys and values. It's basically the
 *  backbone for the real Hash Table that holds all our defined variables etc.
 */


public class SymbolTable{
	
	/** Creating a new instance of <code>HashTable</code> that will hold all of our keys/values
	 */
	private static HashTable<String, String> hash_table = new HashTable<String, String>();
	
	
	/** The <code>getTable()</code> method returns our full Hash Table that we have already created.
	 */
	public static HashTable<String, String> getTable(){
		return hash_table;
	}
	
	
	/** Constructor for the class
	 */
	private SymbolTable() {
		
	}
	
	
}