/**
 */
package circuiteditor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persistance Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see circuiteditor.CircuiteditorPackage#getPersistanceManager()
 * @model
 * @generated
 */
public interface PersistanceManager extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean sauvegardeXMI(Circuit circuit, String path);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void sauvegardeJPG(byte[] circuit, String path);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void sauvegardeTable(TableDeVerite table, String path);

} // PersistanceManager
