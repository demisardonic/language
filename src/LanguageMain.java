
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
				input = new ANTLRInputStream(new FileInputStream(path));
				ComS319LanguageLexer lexer = new ComS319LanguageLexer(input);
				CommonTokenStream tokens = new CommonTokenStream(lexer);
				ComS319LanguageParser parser = new ComS319LanguageParser(tokens);

				System.out.println("############Program Output############");

				long startTime = System.nanoTime();

				LanguageVisitor visit = new LanguageVisitor();
				Evaluator mainReturn = visit.visit(parser.program());

				long execTime = System.nanoTime() - startTime;
				System.out.println("######################################\n");
				if (mainReturn != null) {
					System.out.printf("Program Returned: " + mainReturn.getObject() + "\n");
				}
				System.out.printf("Program Execution Time: %.6fns\n", execTime * 0.000000001);
				System.out.printf("Program Instruction Count: %d\n", instCount);

			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Enter path to source file now. Enter \"exit\" to terminate.");
			path = scanner.nextLine();
			if (path.equals("exit")) {
				repeat = false;
			}
		}
		scanner.close();

	}
}
