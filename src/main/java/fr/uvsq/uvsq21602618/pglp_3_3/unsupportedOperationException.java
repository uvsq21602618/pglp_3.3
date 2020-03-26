package fr.uvsq.uvsq21602618.pglp_3_3;
/**
 * Classe pour une exception.
 * @author Nathalie
 *
 */
public class unsupportedOperationException extends Exception {
    /**
     * Pour la version initiale de l'énoncé.
     * Si le robot statique tente d'avancer
     * une erreur est envoyé.
     * @param message Le message d'erreur
     */
	public unsupportedOperationException (String message) {
		super(message);
	}
}
