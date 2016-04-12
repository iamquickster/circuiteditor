/**
 */
package circuiteditor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Porte Standard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link circuiteditor.PorteStandard#getTypePorte <em>Type Porte</em>}</li>
 * </ul>
 * </p>
 *
 * @see circuiteditor.CircuiteditorPackage#getPorteStandard()
 * @model
 * @generated
 */
public interface PorteStandard extends Porte {
	/**
	 * Returns the value of the '<em><b>Type Porte</b></em>' attribute.
	 * The default value is <code>"AND"</code>.
	 * The literals are from the enumeration {@link circuiteditor.TypePorteStandard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Porte</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Porte</em>' attribute.
	 * @see circuiteditor.TypePorteStandard
	 * @see #setTypePorte(TypePorteStandard)
	 * @see circuiteditor.CircuiteditorPackage#getPorteStandard_TypePorte()
	 * @model default="AND"
	 * @generated
	 */
	TypePorteStandard getTypePorte();

	/**
	 * Sets the value of the '{@link circuiteditor.PorteStandard#getTypePorte <em>Type Porte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Porte</em>' attribute.
	 * @see circuiteditor.TypePorteStandard
	 * @see #getTypePorte()
	 * @generated
	 */
	void setTypePorte(TypePorteStandard value);

} // PorteStandard
