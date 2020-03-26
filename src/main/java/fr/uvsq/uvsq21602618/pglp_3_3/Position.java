package fr.uvsq.uvsq21602618.pglp_3_3;
/**
 * Classe pour la position du robot.
 * @author Nathalie
 *
 */
public class Position {
    /**
     * Coordonnée en x.
     */
    private int x;
    /**
     * Coordonnée en y.
     */
    private int y;
    /**
     * Constructeur pour la position.
     * @param x position en abscisse
     * @param y position en ordonnée.
     */
    public Position(final int x2, final int y2) {
        this.x = x2;
        this.y = y2;
    }
    /**
     * Méthode pour déplacer le robot abscisse.
     * @param nbCase nombre de cases parcouru
     * @return this la position
     */
    public Position deplaceX(final int nbCase) {
        this.x = this.x + nbCase;
        return this;
    }
    /**
     * Méthode pour déplacer le robot en ordonnée.
     * @param nbCase nombre de cases parcouru
     * @return this la position
     */
    public Position deplaceY(final int nbCase) {
        this.y = this.y + nbCase;
        return this;
    }
    /**
     * Méthode pour récupérer la coordonnée en x.
     * @return l'entier x
     */
    public int getX() {
        return this.x;
    }
    /**
     * Méthode pour récupérer la coordonnée en y.
     * @return l'entier y
     */
    public int getY() {
        return this.y;
    }
}
