import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/** The <code>HashTable</code> class holds the information for our hash table that connects declared variables and their
 * according values, if they have any. Various methods have been implemented to help assist in ease of access to the table.
 */

public class HashTable<K,V> {
	
	/** Declaring variables
	 */
	private List<Map<K,V>> map;
	private int nestLevel;
	
	
	/** Initialize the <code>hash table</code> and the <code>Nest Level</code> to be used in the class
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
	

	/**	<code>isLocal</code> is a static boolean method to check if a key exists in the hash table
	 */
	public boolean isLocal(K key) {
		return map.get(nestLevel).containsKey(key);
	}
	
	
	/**	<code>getLocal</code> is public method that takes in a 
	 * key and returns the value when looking in the table. The 
	 * method returns null if there is no value with the given key.
	 */
	public V getLocal(K key) {
		if (isLocal(key))
			return getVal(key);
		return null;
	}
	
	/**	<code>enterScope</code> is a void method that increases the nesting level. 
	 * This is used to assist in keeping track in things like loops.
	 */
	public void enterScope() {
		map.add(new HashMap<K,V>());
		nestLevel++;
	}
	
	/**	<code>exitScope</code> is a void method that decreases the nesting level. 
	 * This is used to assist in keeping track in things like loops.
	 */
	public void exitScope() {
		map.remove(nestLevel--);
	}
	
	/**	<code>nestingLevel</code> is a method that returns an 
	 * integer indicating what nesting level the compiler is at. 
	 */
	public int nestingLevel() {
		return nestLevel;
	}

	
	
}