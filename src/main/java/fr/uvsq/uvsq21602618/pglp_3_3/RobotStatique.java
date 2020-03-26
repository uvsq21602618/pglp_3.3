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
    private Position position;
    /**
     * Direction du Robot.
     */
    private Direction direction;
    /**
     * Constructeur du robot.
     * @param pos Coordonnées x et y
     * @param dir Orientation du robot
     */
    public RobotStatique(final Position pos, final Direction dir) {
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
     * Méthode pour définir la direction du robot.
     * @param dir L'orientation
     */
    public void setDirection(final Direction dir) {
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
    public void setPosition(final Position pos) {
        this.position = pos;
    }
}
