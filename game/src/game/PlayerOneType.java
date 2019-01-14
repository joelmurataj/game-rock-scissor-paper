package game;

public class PlayerOneType extends Player {

	private Type type;

	public PlayerOneType(String firstName, String lastName, int age, Type type) {
		super(firstName, lastName, age);
		this.type = type;
	}

	public Type getType() {
		return type;
	}

}
