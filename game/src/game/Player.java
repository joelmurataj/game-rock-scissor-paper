package game;

public class Player extends Person {

	private Type type;
	private int score;
	

	public Player(String firstName, String lastName, int age, Type type) {
		super(firstName, lastName, age);
		this.type = type;
		score = 0;
	}

	public void win() {
		score++;
	}

	public Type getType() throws TypeException{
		return type;
	}

	protected void setType(Type type) {
		this.type = type;
	}

	public int getScore() {
		return score;
	}

}
