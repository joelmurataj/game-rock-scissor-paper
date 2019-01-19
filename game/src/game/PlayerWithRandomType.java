package game;

import java.util.Random;

public class PlayerWithRandomType extends Player{
	
	public PlayerWithRandomType(String firstName, String lastName, int age) throws TypeException {
		super(firstName, lastName, age, Type.PAPER);
		
	}
	
	public void changeType() throws TypeException {
		Random generator = new Random();
		
		Type[] types=Type.values();
		int type = generator.nextInt(3);
		
		this.setType(types[type]);
		
	}
	@Override
	public Type getType() throws TypeException {
		changeType();
		return super.getType();
	} 
}
