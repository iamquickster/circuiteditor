/**
 */
package circuiteditor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Circuit Editor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link circuiteditor.CircuitEditor#getMainCircuit <em>Main Circuit</em>}</li>
 *   <li>{@link circuiteditor.CircuitEditor#getPersistanceManager <em>Persistance Manager</em>}</li>
 * </ul>
 * </p>
 *
 * @see circuiteditor.CircuiteditorPackage#getCircuitEditor()
 * @model
 * @generated
 */
public interface CircuitEditor extends EObject {
	/**
	 * Returns the value of the '<em><b>Main Circuit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Circuit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Circuit</em>' containment reference.
	 * @see #setMainCircuit(Circuit)
	 * @see circuiteditor.CircuiteditorPackage#getCircuitEditor_MainCircuit()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Circuit getMainCircuit();

	/**
	 * Sets the value of the '{@link circuiteditor.CircuitEditor#getMainCircuit <em>Main Circuit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Circuit</em>' containment reference.
	 * @see #getMainCircuit()
	 * @generated
	 */
	void setMainCircuit(Circuit value);

	/**
	 * Returns the value of the '<em><b>Persistance Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistance Manager</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistance Manager</em>' reference.
	 * @see #setPersistanceManager(PersistanceManager)
	 * @see circuiteditor.CircuiteditorPackage#getCircuitEditor_PersistanceManager()
	 * @model required="true"
	 * @generated
	 */
	PersistanceManager getPersistanceManager();

	/**
	 * Sets the value of the '{@link circuiteditor.CircuitEditor#getPersistanceManager <em>Persistance Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistance Manager</em>' reference.
	 * @see #getPersistanceManager()
	 * @generated
	 */
	void setPersistanceManager(PersistanceManager value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean sauvegarder(String filePath);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void ajouter(ElementType type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean enlever(String nomElement);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean nouveau();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void ouvrir(String path);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean delier(ElementCircuit elementSource, ElementCircuit elementCible);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void deplacer(ElementCircuit element, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void exporterTable(String path);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void exporterCircuit(String path, byte[] circuit);

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean relier(ElementCircuit elementSource, ElementCircuit elementCible);

} // CircuitEditor
