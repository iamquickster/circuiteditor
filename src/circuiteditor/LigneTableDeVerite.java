/**
 */
package circuiteditor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ligne Table De Verite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link circuiteditor.LigneTableDeVerite#getEntrees <em>Entrees</em>}</li>
 *   <li>{@link circuiteditor.LigneTableDeVerite#getSorties <em>Sorties</em>}</li>
 * </ul>
 * </p>
 *
 * @see circuiteditor.CircuiteditorPackage#getLigneTableDeVerite()
 * @model
 * @generated
 */
public interface LigneTableDeVerite extends EObject {
	/**
	 * Returns the value of the '<em><b>Entrees</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entrees</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entrees</em>' attribute list.
	 * @see circuiteditor.CircuiteditorPackage#getLigneTableDeVerite_Entrees()
	 * @model unique="false"
	 * @generated
	 */
	EList<Boolean> getEntrees();

	/**
	 * Returns the value of the '<em><b>Sorties</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorties</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorties</em>' attribute list.
	 * @see circuiteditor.CircuiteditorPackage#getLigneTableDeVerite_Sorties()
	 * @model
	 * @generated
	 */
	EList<Boolean> getSorties();

} // LigneTableDeVerite
