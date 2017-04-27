
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class LanguageMain {

	public static void main(String[] args) {
		String path;
		Scanner scanner = null;
		boolean repeat = false;
		if(args.length != 1){
			System.out.println("Please include path to source file as commandline argument or\nenter path to source file now.");
			scanner = new Scanner(System.in);
			path = scanner.nextLine();
			repeat = true;
		}else{
			path = args[0];
		}
		ANTLRInputStream input;
		do{
			try {
				input = new ANTLRInputStream(new FileInputStream(path));
				ComS319LanguageLexer lexer = new ComS319LanguageLexer(input);
				CommonTokenStream tokens = new CommonTokenStream(lexer);
				ComS319LanguageParser parser = new ComS319LanguageParser(tokens);
				
				LanguageVisitor visit = new LanguageVisitor();
				visit.visit(parser.program());
			} catch (IOException e) {
				e.printStackTrace();
			}
			if(repeat){
				System.out.println("Enter another source file path.");
				path = scanner.nextLine();
			}
		}while(repeat);
		
	}
}
