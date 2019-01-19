package game;

public class Game {

	private Player playerOne;
	private Player playerTwo;
	private int gamePlayed;
	
	public Game(Player playerWithOneType, Player playerWithRandomType) {
		this.playerOne = playerWithOneType;
		this.playerTwo = playerWithRandomType;
		gamePlayed=0;
	}
	
	public void plays(int numberOfMaxGames) throws TypeException {
		while (gamePlayed < numberOfMaxGames) {
			Type playerTwoType = playerTwo.getType();
			Type playerOneType = playerOne.getType();
			if (playerOneType.equals(playerTwoType)) {
				System.out.println("It's a tie!");
			} else if (playerOneType.beats(playerTwoType)) {
				System.out.println(
						playerOne.getLastName() + " wins! " + playerOne.getType() + " beats " + playerTwo.getType());
				playerOne.win();
			} else {
				System.out.println(
						playerTwo.getLastName() + " wins! " + playerOne.getType() + " beats " + playerTwo.getType());
				playerTwo.win();
			}
			gamePlayed++;
		}
	}
	
	public void displayScores() {
		System.out.println();
		System.out.println("Scores:");
		System.out.println(playerOne.getLastName() + ": " + playerOne.getScore());
		System.out.println(playerTwo.getLastName() + ": " + playerTwo.getScore());
	}
	
	public Player getPlayerOne() {
		return playerOne;
	}
	public Player getPlayerTwo() {
		return playerTwo;
	}
	
}
