package fr.uvsq.uvsq21602618.pglp_3_3;
/**
 * Classe correspondant au robot statique.
 * @author Nathalie
 *
 */
public class RobotStatique {
    /**
     * Position du Robot.
     */
	protected Position position;
	/**
	 * Direction du Robot.
	 */
	protected Direction direction;
	/**
	 * Constructeur du robot.
	 * @param pos Coordonnées x et y
	 * @param dir Orientation du robot
	 */
	public RobotStatique(Position pos, Direction dir) {
		this.position = pos;
		this.direction = dir;
	}
	/**
	 * Méthode pour récupérer la direction du robot.
	 * @return la direction
	 */
	public Direction getDirection() {
		return this.direction;
	}
	/**
	 * Méthode pour récupérer la position du robot.
	 * @return la position
	 */
	public Position getPosition() {
		return this.position;
	}
	/**
	 * Méthode pour faire avancer le robot.
	 * Le robot statique ne l'utilise pas.
	 */
	public void avance() {
		;
	}

}
