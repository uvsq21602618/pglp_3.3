package fr.uvsq.uvsq21602618.pglp_3_3;

import java.util.ArrayList;
/**
 * Classe contenant la liste des robots.
 * @author Nathalie
 *
 */
public class Robots {
    /**
     * Liste des robots.
     */
	private ArrayList<RobotStatique> listeRobots;
	/**
	 * Constructeur.
	 */
	public Robots() {
		listeRobots = new ArrayList<RobotStatique>();
	}
	/**
	 * Méthode pour rajouter un robot à la liste.
	 * @param R le Robot à ajouter
	 */
	public void addRobot(RobotStatique R) {
		this.listeRobots.add(R);
	}
	/**
	 * Méthode faisant avancer tous les robots de la liste.
	 * @throws unsupportedOperationException
	 */
	public void avancerTous() throws unsupportedOperationException {
		if(!listeRobots.isEmpty()) {
			for(RobotStatique R: listeRobots) {
				R.avance();
			}
		}
	}
}
