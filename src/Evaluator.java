import java.util.ArrayList;

/**
 * Stores the values of Language statments. types include booleans, numbers, and
 * strings.
 *
 */
public class Evaluator {
	private Object var;
	private Type type;

	public Evaluator(Object var) {
		this.var = var;
		if (var instanceof Boolean) {
			type = Type.BOOL;
		} else if (var instanceof Double) {
			type = Type.NUMBER;
		} else if (var instanceof String) {
			type = Type.STRING;
		} else if (var instanceof ArrayList) {
			type = Type.ARRAY;
		}
	}

	public boolean getBool() {
		return (boolean) var;
	}

	public double getNumber() {
		return (double) var;

	}

	public String getString() {
		return (String) var;
	}

	public ArrayList<Evaluator> getArray() {
		return (ArrayList<Evaluator>) var;
	}

	public Evaluator getArrayIndex(int i) {
		return ((ArrayList<Evaluator>) var).get(i);
	}

	public Object getObject() {
		return var;
	}

	public boolean isBool() {
		return type == Type.BOOL;
	}

	public boolean isNumber() {
		return type == Type.NUMBER;
	}

	public boolean isString() {
		return type == Type.STRING;
	}

	public boolean isArray() {
		return type == Type.ARRAY;
	}

	public Type getType() {
		return type;
	}
}
