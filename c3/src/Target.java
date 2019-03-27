/** This class defines the target architecture used for code generation.
 */

public class Target {
	/** The target triple to specify in the LLVM assembly language.
	 */
	public static final String TRIPLE = "x86_64-pc-linux-gnu";
	// If you need to change the above to work on a different machine, you can find the correct
	// target triple by running the following command on that machine:
	//     clang --version
	
	private Target(){}  // purely static class; no public default constructor
}
