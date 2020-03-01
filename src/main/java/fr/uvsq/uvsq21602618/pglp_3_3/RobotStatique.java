package fr.uvsq.uvsq21602618.pglp_3_3;

public class RobotStatique extends Robot {

	public RobotStatique(Position pos, Direction dir) {
		super(pos, dir);
	}
	
	@Override
	public void avance() throws unsupportedOperationException {
		throw new unsupportedOperationException("Cette action ne peut être réaliser par le robot statique");
	}

}
