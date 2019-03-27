/** A <code>NameAllocator</code> provides a succession of names, all sharing an initial prefix. */

public class NameAllocator {

	private int numAllocated;
	private String prefix;

	private NameAllocator(String prefix){
		this.prefix = prefix;
		this.numAllocated = 0;
	}

	/** Provides the next name in this allocator's sequence.
	 * @return the next name
	 */

	public String next(){
		return prefix + numAllocated++;
	}

	private static NameAllocator tempAllocator = new NameAllocator("%t");
	private static NameAllocator labelAllocator = new NameAllocator("label_");

	/** Gets an allocator to be used for LLVM names of temporary values.
	 *  @return an allocator with prefix <code>%t</code>
	 */

	public static NameAllocator getTempAllocator(){
		return tempAllocator;
	}

	/** Gets an allocator to be used for LLVM names of labels.
	 *  (These are used for compiling <code>if</code> and <code>while</code>.)
	 *  @return an allocator with prefix <code>label_</code>
	 */

	public static NameAllocator getLabelAllocator(){
		return labelAllocator;
	}
}
