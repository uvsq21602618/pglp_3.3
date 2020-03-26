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
	public Position(int x, int y) {
		this.x=x;
		this.y=y;
	}
	/**
	 * Méthode pour déplacer le robot abscisse.
	 * @param nbCase nombre de cases parcouru
	 */
	protected void deplaceX(int nbCase) {
		this.x=this.x+nbCase;
	}
	/**
	 * Méthode pour déplacer le robot en ordonnée.
	 * @param nbCase nombre de cases parcouru
	 */
	protected void deplaceY(int nbCase) {
		this.y=this.y+nbCase;
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
