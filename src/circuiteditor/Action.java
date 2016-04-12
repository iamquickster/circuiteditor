/**
 */
package circuiteditor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link circuiteditor.Action#getType <em>Type</em>}</li>
 *   <li>{@link circuiteditor.Action#getGestionnaireHistorique <em>Gestionnaire Historique</em>}</li>
 *   <li>{@link circuiteditor.Action#isDone <em>Done</em>}</li>
 * </ul>
 * </p>
 *
 * @see circuiteditor.CircuiteditorPackage#getAction()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Action extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"AJOUTER"</code>.
	 * The literals are from the enumeration {@link circuiteditor.TypeAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see circuiteditor.TypeAction
	 * @see #setType(TypeAction)
	 * @see circuiteditor.CircuiteditorPackage#getAction_Type()
	 * @model default="AJOUTER"
	 * @generated
	 */
	TypeAction getType();

	/**
	 * Sets the value of the '{@link circuiteditor.Action#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see circuiteditor.TypeAction
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeAction value);

	/**
	 * Returns the value of the '<em><b>Gestionnaire Historique</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link circuiteditor.GestionnaireHistorique#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gestionnaire Historique</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gestionnaire Historique</em>' container reference.
	 * @see #setGestionnaireHistorique(GestionnaireHistorique)
	 * @see circuiteditor.CircuiteditorPackage#getAction_GestionnaireHistorique()
	 * @see circuiteditor.GestionnaireHistorique#getActions
	 * @model opposite="actions" transient="false"
	 * @generated
	 */
	GestionnaireHistorique getGestionnaireHistorique();

	/**
	 * Sets the value of the '{@link circuiteditor.Action#getGestionnaireHistorique <em>Gestionnaire Historique</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gestionnaire Historique</em>' container reference.
	 * @see #getGestionnaireHistorique()
	 * @generated
	 */
	void setGestionnaireHistorique(GestionnaireHistorique value);

	/**
	 * Returns the value of the '<em><b>Done</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Done</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Done</em>' attribute.
	 * @see #setDone(boolean)
	 * @see circuiteditor.CircuiteditorPackage#getAction_Done()
	 * @model
	 * @generated
	 */
	boolean isDone();

	/**
	 * Sets the value of the '{@link circuiteditor.Action#isDone <em>Done</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Done</em>' attribute.
	 * @see #isDone()
	 * @generated
	 */
	void setDone(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void execute();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void rollback();

} // Action
