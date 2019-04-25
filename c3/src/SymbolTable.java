


public class SymbolTable{
	
	private static HashTable<String, String> hash_table = new HashTable<String, String>();
	
	public static HashTable<String, String> getTable(){
		return hash_table;
	}
	
	private SymbolTable() {
		
	}
	
	
}