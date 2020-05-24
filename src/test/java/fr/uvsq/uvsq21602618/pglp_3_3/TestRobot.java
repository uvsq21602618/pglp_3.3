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
	public void tourneTestEst() {
		Position pos = new Position(2, 3);
		Direction dir = Direction.NORD;
		Robot R = new Robot(pos, dir);
		Direction expected = Direction.EST;
		R.tourne();
		
		assertEquals(expected, R.getDirection());
	}
	/**
     * Test de la méthode tourne.
     */
    @Test
    public void tourneTestSud() {
        Position pos = new Position(2, 3);
        Direction dir = Direction.EST;
        Robot R = new Robot(pos, dir);
        Direction expected = Direction.SUD;
        R.tourne();
        
        assertEquals(expected, R.getDirection());
    }
    /**
     * Test de la méthode tourne.
     */
    @Test
    public void tourneTestOuest() {
        Position pos = new Position(2, 3);
        Direction dir = Direction.SUD;
        Robot R = new Robot(pos, dir);
        Direction expected = Direction.OUEST;
        R.tourne();
        
        assertEquals(expected, R.getDirection());
    }
    /**
     * Test de la méthode tourne.
     */
    @Test
    public void tourneTestNord() {
        Position pos = new Position(2, 3);
        Direction dir = Direction.OUEST;
        Robot R = new Robot(pos, dir);
        Direction expected = Direction.NORD;
        R.tourne();
        
        assertEquals(expected, R.getDirection());
    }
	/**
	 * Test de la méthode avance.
	 * @throws unsupportedOperationException
	 */
	@Test
	public void avanceTestNord() /*throws unsupportedOperationException*/ {
		Position pos = new Position(2, 3);
		Direction dir = Direction.NORD;
		Robot r = new Robot(pos, dir);
		Position expected = new Position(2, 4);
		r.avance();
		
		assertEquals(expected.getY(), r.getPosition().getY());
		assertEquals(expected.getX(), r.getPosition().getX());
	}
	/**
     * Test de la méthode avance.
     * @throws unsupportedOperationException
     */
    @Test
    public void avanceTestEst() /*throws unsupportedOperationException*/ {
        Position pos = new Position(2, 3);
        Direction dir = Direction.EST;
        Robot r = new Robot(pos, dir);
        Position expected = new Position(3, 3);
        r.avance();
        
        assertEquals(expected.getY(), r.getPosition().getY());
        assertEquals(expected.getX(), r.getPosition().getX());
    }
    /**
     * Test de la méthode avance.
     * @throws unsupportedOperationException
     */
    @Test
    public void avanceTestSud() /*throws unsupportedOperationException*/ {
        Position pos = new Position(2, 3);
        Direction dir = Direction.SUD;
        Robot r = new Robot(pos, dir);
        Position expected = new Position(2, 2);
        r.avance();
        
        assertEquals(expected.getY(), r.getPosition().getY());
        assertEquals(expected.getX(), r.getPosition().getX());
    }
    /**
     * Test de la méthode avance.
     * @throws unsupportedOperationException
     */
    @Test
    public void avanceTestOuest() /*throws unsupportedOperationException*/ {
        Position pos = new Position(2, 3);
        Direction dir = Direction.OUEST;
        Robot r = new Robot(pos, dir);
        Position expected = new Position(1, 3);
        r.avance();
        
        assertEquals(expected.getY(), r.getPosition().getY());
        assertEquals(expected.getX(), r.getPosition().getX());
    }

}
