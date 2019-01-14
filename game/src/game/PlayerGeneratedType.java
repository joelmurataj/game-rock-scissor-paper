package game;

public class PlayerGeneratedType extends Player {

	private Type type;
	private final int ROCK = 1;
	private final int SCISSOR = 2;
	private final int PAPER = 3;

	public PlayerGeneratedType(String firstName, String lastName, int age) {
		super(firstName, lastName, age);
	}

	public void setType(int type) throws TypeException {
		if (type == ROCK) {
			this.setType(Type.ROCK);
		} else if (type == SCISSOR) {
			this.setType(Type.SCISSOR);
		} else if (type == PAPER) {
			this.setType(Type.PAPER);
		} else {
			throw new TypeException("This type doesnt exist");
		}
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

}
