
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class LanguageMain {

	public static int instCount = 0;

	public static void main(String[] args) {
		String path;
		Scanner scanner = null;
		boolean repeat = true;
		System.out.println("Enter path to source file now. Enter \"exit\" to terminate.");
		scanner = new Scanner(System.in);
		path = scanner.nextLine();
		if (path.equals("exit")) {
			repeat = false;
		}
		ANTLRInputStream input;
		while (repeat) {
			try {
				instCount = 0;
				// Pulls file from given path.
				input = new ANTLRInputStream(new FileInputStream(path));
				ComS319LanguageLexer lexer = new ComS319LanguageLexer(input);
				CommonTokenStream tokens = new CommonTokenStream(lexer);
				ComS319LanguageParser parser = new ComS319LanguageParser(tokens);
				long startTime;
				Evaluator mainReturn = null;

				System.out.println("\n############Program Output############");
				startTime = System.currentTimeMillis();
				try {
					// Creates new visitor to walk through the program. Visitor
					// holds new empty program environment.
					LanguageVisitor visit = new LanguageVisitor();
					//Begins execution of the program and stores the result of the main function if applicable.
					mainReturn = visit.visit(parser.program());
				} catch (Exception e) {
					System.err.println(e.getMessage());
					System.out.println("######################################\n");
					System.out.printf("Program Returned: -1\n");
					System.out.printf("Program Execution Time: %.6fs\n", (System.currentTimeMillis() - startTime) * 0.001);
					System.out.printf("Program Instruction Count: %d\n", instCount);
				} finally {
					long execTime = System.currentTimeMillis() - startTime;
					System.out.println("######################################\n");
					if (mainReturn != null) {
						System.out.printf("Program Returned: " + (int) mainReturn.getNumber() + "\n");
					} else {
						System.out.printf("Program Returned: 0\n");
					}
					System.out.printf("Program Execution Time: %.6fs\n", execTime * 0.001);
					System.out.printf("Program Instruction Count: %d\n", instCount);
				}
			} catch (IOException e) {
				System.err.println("File \"" + path + "\" does not exist.");
			}
			System.out.println("\nEnter path to source file now. Enter \"exit\" to terminate.");
			path = scanner.nextLine();
			if (path.equals("exit")) {
				repeat = false;
			}
		}
		scanner.close();

	}
}
