package fr.uvsq.uvsq21602618.pglp_3_3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
/**
 * Classe contenant les tests de Robot
 * @author Nathalie
 *
 */
public class TestRobot {
	/**
	 * Test de la méthode tourne.
	 */
	@Test
	public void tourneTest() {
		Position pos = new Position(2, 3);
		Direction dir = Direction.NORD;
		Robot R = new Robot(pos, dir);
		Direction expected = Direction.EST;
		R.tourne();
		
		assertEquals(expected, R.getDirection());
	}
	/**
	 * Test de la méthode avance.
	 * @throws unsupportedOperationException
	 */
	@Test
	public void avanceTest() throws unsupportedOperationException {
		Position pos = new Position(2, 3);
		Direction dir = Direction.NORD;
		Robot r = new Robot(pos, dir);
		Position expected = new Position(2, 4);
		r.avance();
		
		assertEquals(expected.getY(), r.getPosition().getY());
		assertEquals(expected.getX(), r.getPosition().getX());
	}
}
