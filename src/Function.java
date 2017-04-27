import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Stores the body of the function and a list of the parameters names.
 *
 */
public class Function {
	private ParseTree body;
	private ArrayList<String> params;

	public Function(ParseTree body, ArrayList<String> params) {
		this.body = body;
		this.params = params;
	}

	public Evaluator visit(LanguageVisitor visitor) {
		return visitor.visit(body);
	}

	public ArrayList<String> getParamNames() {
		return params;
	}
}
