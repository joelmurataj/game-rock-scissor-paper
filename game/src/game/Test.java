package game;

public class Test {

	public static void main(String[] args) {

		Player playerWithOneType = new Player("ben", "lamaj", 30, Type.ROCK);
		Player playerWithRandomType = new Player("rocky", "balboa", 22);

		Game game = new Game(playerWithOneType, playerWithRandomType);
		game.plays(100);
		game.displayScores();
	}

}
