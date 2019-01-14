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
		score=0;
	}
	
	public Player(String firstName, String lastName, int age) {
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
