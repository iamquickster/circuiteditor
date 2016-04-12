/**
 */
package circuiteditor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see circuiteditor.CircuiteditorPackage#getElementFactory()
 * @model
 * @generated
 */
public interface ElementFactory extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ElementCircuit creerElement(ElementType type);

} // ElementFactory
