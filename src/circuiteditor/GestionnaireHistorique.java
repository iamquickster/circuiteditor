/**
 */
package circuiteditor;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gestionnaire Historique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link circuiteditor.GestionnaireHistorique#getActionCurseur <em>Action Curseur</em>}</li>
 *   <li>{@link circuiteditor.GestionnaireHistorique#getCircuit <em>Circuit</em>}</li>
 *   <li>{@link circuiteditor.GestionnaireHistorique#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see circuiteditor.CircuiteditorPackage#getGestionnaireHistorique()
 * @model
 * @generated
 */
public interface GestionnaireHistorique extends EObject {
	/**
	 * Returns the value of the '<em><b>Action Curseur</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Curseur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Curseur</em>' attribute.
	 * @see #setActionCurseur(int)
	 * @see circuiteditor.CircuiteditorPackage#getGestionnaireHistorique_ActionCurseur()
	 * @model default="0"
	 * @generated
	 */
	int getActionCurseur();

	/**
	 * Sets the value of the '{@link circuiteditor.GestionnaireHistorique#getActionCurseur <em>Action Curseur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Curseur</em>' attribute.
	 * @see #getActionCurseur()
	 * @generated
	 */
	void setActionCurseur(int value);

	/**
	 * Returns the value of the '<em><b>Circuit</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link circuiteditor.Circuit#getHistorique <em>Historique</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Circuit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circuit</em>' container reference.
	 * @see #setCircuit(Circuit)
	 * @see circuiteditor.CircuiteditorPackage#getGestionnaireHistorique_Circuit()
	 * @see circuiteditor.Circuit#getHistorique
	 * @model opposite="historique" transient="false"
	 * @generated
	 */
	Circuit getCircuit();

	/**
	 * Sets the value of the '{@link circuiteditor.GestionnaireHistorique#getCircuit <em>Circuit</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Circuit</em>' container reference.
	 * @see #getCircuit()
	 * @generated
	 */
	void setCircuit(Circuit value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link circuiteditor.Action}.
	 * It is bidirectional and its opposite is '{@link circuiteditor.Action#getGestionnaireHistorique <em>Gestionnaire Historique</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see circuiteditor.CircuiteditorPackage#getGestionnaireHistorique_Actions()
	 * @see circuiteditor.Action#getGestionnaireHistorique
	 * @model opposite="gestionnaireHistorique" containment="true"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean enregistrerAction(Action action);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void undo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void redo();

} // GestionnaireHistorique
