package game;

import java.util.Random;

public class Test {

	public static void main(String[] args) throws TypeException {

		final int playingGames = 100;
		int count = 0;
		PlayerOneType player1 = new PlayerOneType("ben", "lamaj", 30, Type.ROCK);
		PlayerGeneratedType player2 = new PlayerGeneratedType("joel", "murataj", 22);

		while (count < playingGames) {
			try {
				Random generator = new Random();
				int type = generator.nextInt(3) + 1;

				player2.setType(type);

				if (player1.getType().equals(player2.getType())) {
					System.out.println("It's a tie!");
				} else if (player1.getType().beats(player2.getType())) {
					System.out.println(
							player1.getLastName() + " win! " + player1.getType() + " beats " + player2.getType());
					player1.win();
				} else {
					System.out.println(
							player2.getLastName() + " win! " + player1.getType() + " beats " + player2.getType());
					player2.win();
				}
			} catch (TypeException e) {
				e.printStackTrace();
			}
			count++;
		}
		System.out.println();
		System.out.println("Scores:");
		System.out.println(player1.getLastName() + ": " + player1.getScore());
		System.out.println(player2.getLastName() + ": " + player2.getScore());
	}

}
