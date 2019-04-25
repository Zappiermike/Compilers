import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/** The <code>SymbolTable</code> class holds the information for our hash table that connects declared variables and their
 * according values, if they have any. Methods are given to support inserting, removing, and verifying that variables exist.
 */

public class HashTable<K,V> {
	
	private List<Map<K,V>> map;
	private int nestLevel;
	
	
	/** Initialize the <code>hash table</code> to be used in the class
	 */
	public HashTable(){
    	map = new ArrayList<Map<K,V>>();
    	map.add(new HashMap<K,V>());
    	nestLevel = 0;
    }
	
	
	/** <code>setVal</code> is a static void method that puts a given key/value pair inside our hash table
	 */
	public void setVal(K variable, V reg_location) {
		if (variable == null || reg_location == null) {
			throw new NullPointerException();
		}
		map.get(nestLevel).put(variable, reg_location);
	}
	
	/** <code>getVal</code> is a static string method that returns the value located in the hash table based
	 * on a given string variable name 
	 */
	public V getVal(K key) {
		V value;
		for (int i = nestLevel; i>=0; i--) {
			value = map.get(i).get(key);
			if (value != null) {
				return value;
			}
		}
		return null;
	}
	

	/**	<code>exists</code> is a static boolean method to check if a key exists in the hash table
	 */
	public boolean isLocal(K key) {
		return map.get(nestLevel).containsKey(key);
	}
	
	public V getLocal(K key) {
		if (isLocal(key))
			return getVal(key);
		return null;
	}
	
	public void enterScope() {
		map.add(new HashMap<K,V>());
		nestLevel++;
	}
	
	public void exitScope() {
		map.remove(nestLevel--);
	}
	
	public int nestingLevel() {
		return nestLevel;
	}

	
	
}