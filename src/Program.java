import java.util.HashMap;

public class Program {
	private HashMap<String, Evaluator> vars;
	private HashMap<String, Function> func;
	private Function main;

	public Program() {
		vars = new HashMap<String, Evaluator>();
		func = new HashMap<String, Function>();
		main = null;
	}

	public Program(Program env) {
		vars = new HashMap<String, Evaluator>(env.vars);
		func = new HashMap<String, Function>(env.func);
	}

	public void setVar(String name, Evaluator val) {
		vars.put(name, val);
	}

	public Evaluator getVar(String name) {
		return vars.get(name);
	}

	public void defFunc(String name, Function f) {
		func.put(name, f);
	}

	public Function getFunc(String name) {
		return func.get(name);
	}

	public void setMain(Function main) {
		this.main = main;
	}

	public Function getMain() {
		return main;
	}

}
