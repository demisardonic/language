/**
 * Enum represents the different types of variables.
 *
 */
public enum Type {
	NUMBER("number"), BOOL("boolean"), STRING("string"), ARRAY("array");

	private final String n;

	private Type(String name) {
		this.n = name;
	}

	public String toString() {
		return this.n;
	}
}
