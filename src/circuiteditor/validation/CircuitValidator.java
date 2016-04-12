/**
 *
 * $Id$
 */
package circuiteditor.validation;

import circuiteditor.ElementCircuit;
import circuiteditor.GestionnaireHistorique;
import circuiteditor.TableDeVerite;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link circuiteditor.Circuit}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CircuitValidator {
	boolean validate();

	boolean validateFichier(String value);
	boolean validateCircuitElements(EList<ElementCircuit> value);
	boolean validateMaxPorte(int value);
	boolean validateTabledeverite(TableDeVerite value);
	boolean validateHistorique(GestionnaireHistorique value);
	boolean validateMaxEntree(int value);
	boolean validateMaxSortie(int value);
}
