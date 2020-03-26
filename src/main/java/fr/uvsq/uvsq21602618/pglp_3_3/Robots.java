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
     * @param r le Robot à ajouter
     */
    public void addRobot(final RobotStatique r) {
        this.listeRobots.add(r);
    }
    /**
     * Méthode faisant avancer tous les robots de la liste.
     * @throws unsupportedOperationException
     */
    public void avancerTous() {
        if (!listeRobots.isEmpty()) {
            for (RobotStatique r: listeRobots) {
                if (r.getClass().equals(Robot.class)) {
                    ((Robot) r).avance();
                }
            }
        }
    }
}
