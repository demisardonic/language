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

	public Type getType() {
		return type;
	}
}
