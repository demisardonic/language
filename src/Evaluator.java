
public class Evaluator {
	private Object var;
	private Type type;
	private boolean isReturn;

	public Evaluator(Object var) {
		this.var = var;
		if (var instanceof Boolean) {
			type = Type.BOOL;
		} else if (var instanceof Double) {
			type = Type.NUMBER;
		} else if (var instanceof String) {
			type = Type.STRING;
		}
		isReturn = false;
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

	public boolean isReturn() {
		return isReturn;
	}

	public void setReturn(boolean isReturn) {
		this.isReturn = isReturn;
	}
}
