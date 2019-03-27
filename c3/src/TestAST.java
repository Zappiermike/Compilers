import java.io.FileWriter;
import java.io.IOException;

/** This class provides a <code>main</code> method that can be used to
 *  test the construction of an Abstract Syntax Tree (AST) and the
 *  generation of LLVM code from that AST.
 */

public class TestAST {

	/** Writes out the LLVM code for a test program into a file.
	 *  @param args command line arguments; should contain just one, the filename
	 */

	public static void main(String args[]){
		Procedure mainProc =
				new Procedure("main",
						new SequenceStmt(
								new ExprStmt(
										new CallExpr(
												"println",
												//multiply
												new ProductExpr(
														//add
														new SumExpr(
																//what's left over
																new RemainderExpr(
																		//how many times division can occur
																		new QuotientExpr(
																				//subtract
																				new DifferenceExpr(
																						new ConstExpr(12), new ConstExpr(6)),
																				new ConstExpr(2)),
																		new ConstExpr(2)),
																new ConstExpr(12)),
														new ConstExpr(1))
												)
										),
										new ReturnStmt(new ConstExpr(0))
								)
						);
		if(args.length != 1){
			System.err.println("Usage: java TestAST testProgram.ll");
			System.exit(1);
		} else {
			try {
				FileWriter output = new FileWriter(args[0]);
				output.write("target triple = \"" + Target.TRIPLE + "\"\n");
				output.write(LibraryDeclarations.get());
				output.write(mainProc.toLLVM());
				output.close();
			} catch(IOException e){
				System.err.println("I/O exception: " + e);
				System.exit(1);
			}
		}
	}

	private TestAST(){}  // purely static class; no public default constructor
}
