/**
 */
package circuiteditor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Table Verite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link circuiteditor.ElementTableVerite#getTableVerite <em>Table Verite</em>}</li>
 * </ul>
 * </p>
 *
 * @see circuiteditor.CircuiteditorPackage#getElementTableVerite()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ElementTableVerite extends ElementCircuit {
	/**
	 * Returns the value of the '<em><b>Table Verite</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link circuiteditor.TableDeVerite#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Verite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Verite</em>' containment reference.
	 * @see #setTableVerite(TableDeVerite)
	 * @see circuiteditor.CircuiteditorPackage#getElementTableVerite_TableVerite()
	 * @see circuiteditor.TableDeVerite#getElement
	 * @model opposite="element" containment="true"
	 * @generated
	 */
	TableDeVerite getTableVerite();

	/**
	 * Sets the value of the '{@link circuiteditor.ElementTableVerite#getTableVerite <em>Table Verite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Verite</em>' containment reference.
	 * @see #getTableVerite()
	 * @generated
	 */
	void setTableVerite(TableDeVerite value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<LigneTableDeVerite> evaluer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<Boolean> calculListeEntreeBoolean(int longueurListe, int valeur);

} // ElementTableVerite
