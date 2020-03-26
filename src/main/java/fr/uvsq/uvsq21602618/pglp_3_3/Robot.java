package fr.uvsq.uvsq21602618.pglp_3_3;
/**
 * Classe Robot qui hérite de RobotStatique.
 * @author Nathalie
 *
 */
public class Robot extends RobotStatique {
    /**
     * Position du Robot.
     */
    private Position position;
    /**
     * Direction du Robot.
     */
    private Direction direction;
	/**
	 * Constructeur du Robot.
	 * @param pos La position en x et y
	 * @param dir L'orientation du robot
	 */
	public Robot(final Position pos, final Direction dir) {
		super(pos, dir);
	}
	/**
	 * Méthode pour faire tourner le robot à 90 degres
	 * vers la droite.
	 */
	public void tourne() {
		if(this.direction.equals(Direction.NORD)) {
			this.direction = Direction.EST;
		} else if (this.direction.equals(Direction.EST)) {
			this.direction = Direction.SUD;
		} else if (this.direction.equals(Direction.SUD)) {
			this.direction = Direction.OUEST;
		} else {
			this.direction = Direction.NORD;
		}
	}
	/**
	 * Méthode pour faire avancer le robot d'une case
	 * en fonction de son orientation.
	 */
	public void avance() {
		if (this.direction.equals(Direction.NORD)) {
			this.position.deplaceY(1);
		} else if (this.direction.equals(Direction.EST)) {
			this.position.deplaceX(1);
		} else if (this.direction.equals(Direction.SUD)) {
			this.position.deplaceY(-1);
		} else {
			this.position.deplaceX(-1);
		}
	}
	
	   /**
     * Méthode pour récupérer la direction du robot.
     * @return la direction
     */
    public Direction getDirection() {
        return this.direction;
    }
    /**
     * Méthode pour définir la direction du robot.
     * @param dir L'orientation
     */
    public void setDirection(Direction dir) {
        this.direction = dir;
    }
    /**
     * Méthode pour récupérer la position du robot.
     * @return la position
     */
    public Position getPosition() {
        return this.position;
    }
    /**
     * Méthode pour définir la position du robot.
     * @param pos la position
     */
    public void setPosition(Position pos) {
        this.position = pos;
    }
}
