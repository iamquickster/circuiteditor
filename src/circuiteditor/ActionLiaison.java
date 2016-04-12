/**
 */
package circuiteditor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Liaison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link circuiteditor.ActionLiaison#getCible <em>Cible</em>}</li>
 *   <li>{@link circuiteditor.ActionLiaison#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see circuiteditor.CircuiteditorPackage#getActionLiaison()
 * @model
 * @generated
 */
public interface ActionLiaison extends Action {
	/**
	 * Returns the value of the '<em><b>Cible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cible</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cible</em>' reference.
	 * @see #setCible(ElementCircuit)
	 * @see circuiteditor.CircuiteditorPackage#getActionLiaison_Cible()
	 * @model required="true"
	 * @generated
	 */
	ElementCircuit getCible();

	/**
	 * Sets the value of the '{@link circuiteditor.ActionLiaison#getCible <em>Cible</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cible</em>' reference.
	 * @see #getCible()
	 * @generated
	 */
	void setCible(ElementCircuit value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ElementCircuit)
	 * @see circuiteditor.CircuiteditorPackage#getActionLiaison_Source()
	 * @model required="true"
	 * @generated
	 */
	ElementCircuit getSource();

	/**
	 * Sets the value of the '{@link circuiteditor.ActionLiaison#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ElementCircuit value);

} // ActionLiaison
