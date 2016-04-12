/**
 *
 * $Id$
 */
package circuiteditor.validation;

import circuiteditor.Circuit;

/**
 * A sample validator interface for {@link circuiteditor.GestionnaireHistorique}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface GestionnaireHistoriqueValidator {
	boolean validate();

	boolean validateActionCurseur(int value);
	boolean validateCircuit(Circuit value);
}