package game;

import java.util.Random;

public class Game {

	private Player playerOne;
	private Player playerTwo;
	private int gamePlayed;
	
	public Game(Player playerWithOneType, Player playerWithRandomType) {
		this.playerOne = playerWithOneType;
		this.playerTwo = playerWithRandomType;
		gamePlayed=0;
	}
	
	public void plays(int numberOfMaxGames) {
		while (gamePlayed < numberOfMaxGames) {
			try {
				Random generator = new Random();
				int type = generator.nextInt(3) + 1;

				playerTwo.setType(type);

				if (playerOne.getType().equals(playerTwo.getType())) {
					System.out.println("It's a tie!");
				} else if (playerOne.getType().beats(playerTwo.getType())) {
					System.out.println(
							playerOne.getLastName() + " win! " + playerOne.getType() + " beats " + playerTwo.getType());
					playerOne.win();
				} else {
					System.out.println(
							playerTwo.getLastName() + " win! " + playerOne.getType() + " beats " + playerTwo.getType());
					playerTwo.win();
				}
			} catch (TypeException e) {
				e.printStackTrace();
			}
			gamePlayed++;
		}
	}
	
	public Player getPlayerOne() {
		return playerOne;
	}
	public Player getPlayerTwo() {
		return playerTwo;
	}
	
}
