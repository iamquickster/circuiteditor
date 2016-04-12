/**
 */
package circuiteditor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Porte Personalise</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link circuiteditor.PortePersonalise#getCircuit <em>Circuit</em>}</li>
 * </ul>
 * </p>
 *
 * @see circuiteditor.CircuiteditorPackage#getPortePersonalise()
 * @model
 * @generated
 */
public interface PortePersonalise extends Porte {
	/**
	 * Returns the value of the '<em><b>Circuit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Circuit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circuit</em>' reference.
	 * @see #setCircuit(Circuit)
	 * @see circuiteditor.CircuiteditorPackage#getPortePersonalise_Circuit()
	 * @model required="true"
	 * @generated
	 */
	Circuit getCircuit();

	/**
	 * Sets the value of the '{@link circuiteditor.PortePersonalise#getCircuit <em>Circuit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Circuit</em>' reference.
	 * @see #getCircuit()
	 * @generated
	 */
	void setCircuit(Circuit value);

} // PortePersonalise
