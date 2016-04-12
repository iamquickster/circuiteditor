/**
 */
package circuiteditor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Element Circuit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link circuiteditor.ActionElementCircuit#getLiaisonsModifiees <em>Liaisons Modifiees</em>}</li>
 *   <li>{@link circuiteditor.ActionElementCircuit#getElementModifie <em>Element Modifie</em>}</li>
 * </ul>
 * </p>
 *
 * @see circuiteditor.CircuiteditorPackage#getActionElementCircuit()
 * @model
 * @generated
 */
public interface ActionElementCircuit extends Action {
	/**
	 * Returns the value of the '<em><b>Liaisons Modifiees</b></em>' reference list.
	 * The list contents are of type {@link circuiteditor.ActionLiaison}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Liaisons Modifiees</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Liaisons Modifiees</em>' reference list.
	 * @see circuiteditor.CircuiteditorPackage#getActionElementCircuit_LiaisonsModifiees()
	 * @model
	 * @generated
	 */
	EList<ActionLiaison> getLiaisonsModifiees();

	/**
	 * Returns the value of the '<em><b>Element Modifie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Modifie</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Modifie</em>' reference.
	 * @see #setElementModifie(ElementCircuit)
	 * @see circuiteditor.CircuiteditorPackage#getActionElementCircuit_ElementModifie()
	 * @model required="true"
	 * @generated
	 */
	ElementCircuit getElementModifie();

	/**
	 * Sets the value of the '{@link circuiteditor.ActionElementCircuit#getElementModifie <em>Element Modifie</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Modifie</em>' reference.
	 * @see #getElementModifie()
	 * @generated
	 */
	void setElementModifie(ElementCircuit value);
	

} // ActionElementCircuit
