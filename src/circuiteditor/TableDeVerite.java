/**
 */
package circuiteditor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table De Verite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link circuiteditor.TableDeVerite#getPossede <em>Possede</em>}</li>
 *   <li>{@link circuiteditor.TableDeVerite#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see circuiteditor.CircuiteditorPackage#getTableDeVerite()
 * @model
 * @generated
 */
public interface TableDeVerite extends EObject {
	/**
	 * Returns the value of the '<em><b>Possede</b></em>' containment reference list.
	 * The list contents are of type {@link circuiteditor.LigneTableDeVerite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Possede</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Possede</em>' containment reference list.
	 * @see circuiteditor.CircuiteditorPackage#getTableDeVerite_Possede()
	 * @model containment="true"
	 * @generated
	 */
	EList<LigneTableDeVerite> getPossede();

	/**
	 * Returns the value of the '<em><b>Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link circuiteditor.ElementTableVerite#getTableVerite <em>Table Verite</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' container reference.
	 * @see #setElement(ElementTableVerite)
	 * @see circuiteditor.CircuiteditorPackage#getTableDeVerite_Element()
	 * @see circuiteditor.ElementTableVerite#getTableVerite
	 * @model opposite="tableVerite" transient="false"
	 * @generated
	 */
	ElementTableVerite getElement();

	/**
	 * Sets the value of the '{@link circuiteditor.TableDeVerite#getElement <em>Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' container reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(ElementTableVerite value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void calculerTable();

} // TableDeVerite
