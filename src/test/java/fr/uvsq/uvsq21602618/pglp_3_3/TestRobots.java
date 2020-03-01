package fr.uvsq.uvsq21602618.pglp_3_3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestRobots {

	@Test(expected=unsupportedOperationException.class)
	public void avancerTousTest() throws unsupportedOperationException {
		Position pos=new Position(2,3);
		Direction dir=Direction.NORD;
		Robot R=new Robot(pos,dir);
		Direction expected=Direction.EST;
		
		Position pos2=new Position(3,4);
		Direction dir2=Direction.OUEST;
		Robot RS=new RobotStatique(pos2,dir2);
		
		Robots LS=new Robots();
		LS.addRobot(R);
		LS.addRobot(RS);
		LS.avancerTous();
		
		assertEquals(expected,R.getDirection());
	}
}
