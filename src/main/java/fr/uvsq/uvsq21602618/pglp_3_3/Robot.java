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
		if(super.getDirection().equals(Direction.NORD)) {
			super.setDirection(Direction.EST);
		} else if (super.getDirection().equals(Direction.EST)) {
			super.setDirection(Direction.SUD);
		} else if (super.getDirection().equals(Direction.SUD)) {
			super.setDirection(Direction.OUEST);
		} else {
			super.setDirection(Direction.NORD);
		}
	}
	/**
	 * Méthode pour faire avancer le robot d'une case
	 * en fonction de son orientation.
	 */
	public void avance() {
		if (super.getDirection().equals(Direction.NORD)) {
			super.setPosition(super.getPosition().deplaceY(1));
		} else if (super.getDirection().equals(Direction.EST)) {
			super.setPosition(super.getPosition().deplaceX(1));
		} else if (super.getDirection().equals(Direction.SUD)) {
		    super.setPosition(super.getPosition().deplaceY(-1));
		} else {
		    super.setPosition(super.getPosition().deplaceX(-1));
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
