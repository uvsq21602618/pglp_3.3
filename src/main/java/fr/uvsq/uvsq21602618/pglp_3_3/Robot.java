package fr.uvsq.uvsq21602618.pglp_3_3;
/**
 * Classe Robot qui hérite de RobotStatique.
 * @author Nathalie
 *
 */
public class Robot extends RobotStatique {
	/**
	 * Constructeur du Robot.
	 * @param pos La position en x et y
	 * @param dir L'orientation du robot
	 */
	public Robot(Position pos, Direction dir) {
		super(pos, dir);
	}
	/**
	 * Méthode pour faire tourner le robit à 90 degres
	 * vers la droite.
	 */
	public void tourne() {
		if(direction.equals(Direction.NORD)) {
			this.direction=Direction.EST;
		}
		else if(direction.equals(Direction.EST)) {
			this.direction=Direction.SUD;
		}
		else if(direction.equals(Direction.SUD)) {
			this.direction=Direction.OUEST;
		}
		else {
			this.direction=Direction.NORD;
		}
	}
	/**
	 * Méthode pour faire avancer le robot d'une case
	 * en fonction de son orientation.
	 */
	@Override
	public void avance(){
		if(direction.equals(Direction.NORD)) {
			this.position.deplaceY(1);
		}
		else if(direction.equals(Direction.EST)) {
			this.position.deplaceX(1);
		}
		else if(direction.equals(Direction.SUD)) {
			this.position.deplaceY(-1);
		}
		else {
			this.position.deplaceX(-1);
		}
	}
}
