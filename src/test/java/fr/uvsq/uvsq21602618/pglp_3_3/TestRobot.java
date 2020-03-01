package fr.uvsq.uvsq21602618.pglp_3_3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestRobot {
	
	@Test
	public void tourneTest() {
		Position pos=new Position(2,3);
		Direction dir=Direction.NORD;
		Robot R=new Robot(pos,dir);
		Direction expected=Direction.EST;
		R.tourne();
		
		assertEquals(expected,R.getDirection());
	}
}
