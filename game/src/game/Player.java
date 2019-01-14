package game;

public class Player extends Person {

	private Type type;
	private int score;
	private final int ROCK = 1;
	private final int SCISSOR = 2;
	private final int PAPER = 3;

	public Player(String firstName, String lastName, int age, Type type) {
		super(firstName, lastName, age);
		this.type = type;
		score = 0;
	}

	public Player(String firstName, String lastName, int age) {
		super(firstName, lastName, age);
	}

	public void setType(int type) throws TypeException {
		switch (type) {
		case ROCK:
			this.setType(Type.ROCK);
			break;
		case SCISSOR:
			this.setType(Type.SCISSOR);
			break;
		case PAPER:
			this.setType(Type.PAPER);
			break;
		default:
			throw new TypeException("This type doesn't exist");
		}
	}

	public void win() {
		score++;
	}

	public Type getType() {
		return type;
	}

	private void setType(Type type) {
		this.type = type;
	}

	public int getScore() {
		return score;
	}

}
