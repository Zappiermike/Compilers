/** Provides the LLVM declarations for library procedures,
 *  which the compiler should include in its output.
 *  After the compiled language gets rich enough to
 *  include procedure declarations, this won't be
 *  necessary any more.  At the moment, three library
 *  procedures are declared:
 *  <ul>
 *    <li><code>int putchar(int c)</code> outputs a single character, specified by its numerical code, <code>c</code>;
 *      also returns <code>c</code>, except in case of error, when it returns -1</li>
 *    <li><code>int print(int n)</code> outputs the integer <code>n</code> in signed decimal form and then returns 0</li>
 *    <li><code>int println(int n)</code> does the same as <code>print</code> and then outputs a newline character</li>
 *  </ul>
 *  Of these, the first is part of the standard C library, whereas the other two are defined in the <code>library.c</code> file
 *  included with this compiler.
 */

public class LibraryDeclarations {

	/** Provides the library declarations.
	 *  @return the LLVM declarations
	 */

	public static String get(){
		return "declare i32 @putchar(i32)\n"
				+  "declare i32 @print(i32)\n"
				+  "declare i32 @println(i32)\n";
	}

	private LibraryDeclarations(){}  // purely static class; no public default constructor
}