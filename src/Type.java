
public enum Type {
	NUMBER("number"), BOOL("boolean"), STRING("string");

	private final String n;

	private Type(String name) {
		this.n = name;
	}

	public String toString() {
		return this.n;
	}
}