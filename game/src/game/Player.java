package game;

public class Player {

	private String firstName;
	private String lastName;
	private int age;
	private Type type;
	private int score;
	
	public Player(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		score=0;
	}
	
	public Player(String firstName, String lastName, int age, Type type) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.type = type;
		score=0;
	}
	
	public void win() {
		score++;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAge() {
		return age;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public int getScore() {
		return score;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
}
