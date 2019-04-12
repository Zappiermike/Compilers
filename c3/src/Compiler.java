import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/** This class provides a <code>main</code> method for a compiler,
 *  which reads in a source program from a file and writes out
 *  LLVM assembly code to another file.
 */

public class Compiler {

	/** Compiles a source file, writing out the LLVM code into another file.
	 *  @param args command line arguments; should contain two: the source and assembly filenames
	 */
	
	/** Declaration of our <code>counter</code>
	 */
	private static int counter = 0;
	
	static public void main(String[] args) throws Exception{

		String inputFileName = null;
		String outputFileName = null;
		boolean isDebugOn = false;

		if(args.length == 2){
			inputFileName = args[0];
			outputFileName = args[1];
		} else if(args.length == 3 && args[0].equals("-debug")){
			inputFileName = args[1];
			outputFileName = args[2];
			isDebugOn = true;
		} else {
			System.err.println("Usage: java Compiler [-debug] inputfile outputfile");
			System.exit(1);
		}

		Parser parser = new Parser(new Yylex(new FileReader(inputFileName)));

		java_cup.runtime.Symbol parseTree;

		if(isDebugOn)
			parseTree = parser.debug_parse();
		else
			parseTree = parser.parse();

		Procedure mainProc = (Procedure) parseTree.value;
		String mainCode = mainProc.toLLVM();
		
		// After running the main in LLVM, we want to see if any errors were thrown 
		// by checking our <code>counter</code>. If some are found, exit immediately.
		if (counter > 0)
			System.exit(1);

		try {
			FileWriter output = new FileWriter(outputFileName);
			output.write("target triple = \"" + Target.TRIPLE + "\"\n");
			output.write(LibraryDeclarations.get());
			output.write(mainCode);
			output.close();
		} catch(IOException e){
			System.err.println("I/O exception: " + e);
			System.exit(1);
		}
	}
	
	
	/** Method <code>reportErrorDecl</code> to handle errors when attempting to declare the same variable more than once
	 */
	public static void reportErrorDecl(String key, int characterLocation) {
		if (SymbolTable.exists(key)) {
			System.err.println("Error, variable " + "\"" + key + "\"" + " already exists. Character Number: " + characterLocation);
			counter++;
			// If the total number of errors is 5, we need to exit immediately
			if (counter == 5) {
				System.exit(1);
			}
		}
	}
	
	/** Method <code>reportErrorAssign</code> to handle errors when attempting to assign some value to 
	 * some variable that has not been defined.
	 */
	public static void reportErrorAssign(String key, int characterLocation) {
		if (SymbolTable.exists(key) == false) {
			System.err.println("Error, variable " + "\"" + key + "\"" + " does not exist. Character Number: " + characterLocation);
			counter++;
			SymbolTable.setVal(key, null);
			// If the total number of errors is 5, we need to exit immediately
			if (counter == 5) {
				System.exit(1);
			}
		}
	}

	private Compiler(){}  // purely static class; no public default constructor

}
