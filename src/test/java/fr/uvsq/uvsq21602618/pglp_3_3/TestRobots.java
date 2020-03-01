package fr.uvsq.uvsq21602618.pglp_3_3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestRobots {

	/*@Test(expected=unsupportedOperationException.class)
	public void avancerTousTest() throws unsupportedOperationException {
		Position pos=new Position(2,3);
		Direction dir=Direction.NORD;
		Robot R=new Robot(pos,dir);
		Position expected=new Position(2,4);
		
		Position pos2=new Position(3,4);
		Direction dir2=Direction.OUEST;
		Robot RS=new RobotStatique(pos2,dir2);
		
		Robots LS=new Robots();
		LS.addRobot(R);
		LS.addRobot(RS);
		LS.avancerTous();
		
		assertEquals(expected.getX(),R.getPosition().getX());
		assertEquals(expected.getY(),R.getPosition().getY());
	}*/
	
	@Test
	public void avancerTousTest() throws unsupportedOperationException {
		Position pos=new Position(2,3);
		Direction dir=Direction.NORD;
		RobotStatique R=new Robot(pos,dir);
		Position expected=new Position(2,4);
		
		Position pos2=new Position(3,4);
		Direction dir2=Direction.OUEST;
		RobotStatique RS=new RobotStatique(pos2,dir2);
		Position expected2=new Position(3,4);
		
		Robots LS=new Robots();
		LS.addRobot(R);
		LS.addRobot(RS);
		LS.avancerTous();
		
		assertEquals(expected.getX(),R.getPosition().getX());
		assertEquals(expected.getY(),R.getPosition().getY());
		assertEquals(expected2.getX(),RS.getPosition().getX());
		assertEquals(expected2.getY(),RS.getPosition().getY());
	}
}
