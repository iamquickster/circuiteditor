/**
 */
package circuiteditor;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see circuiteditor.CircuiteditorPackage
 * @generated
 */
public interface CircuiteditorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CircuiteditorFactory eINSTANCE = circuiteditor.impl.CircuiteditorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Circuit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Circuit</em>'.
	 * @generated
	 */
	Circuit createCircuit();

	/**
	 * Returns a new object of class '<em>Porte</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Porte</em>'.
	 * @generated
	 */
	Porte createPorte();

	/**
	 * Returns a new object of class '<em>Entree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entree</em>'.
	 * @generated
	 */
	Entree createEntree();

	/**
	 * Returns a new object of class '<em>Sortie</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sortie</em>'.
	 * @generated
	 */
	Sortie createSortie();

	/**
	 * Returns a new object of class '<em>Porte Standard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Porte Standard</em>'.
	 * @generated
	 */
	PorteStandard createPorteStandard();

	/**
	 * Returns a new object of class '<em>Porte Personalise</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Porte Personalise</em>'.
	 * @generated
	 */
	PortePersonalise createPortePersonalise();

	/**
	 * Returns a new object of class '<em>Porte ET</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Porte ET</em>'.
	 * @generated
	 */
	PorteET createPorteET();

	/**
	 * Returns a new object of class '<em>Porte OU</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Porte OU</em>'.
	 * @generated
	 */
	PorteOU createPorteOU();

	/**
	 * Returns a new object of class '<em>Table De Verite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table De Verite</em>'.
	 * @generated
	 */
	TableDeVerite createTableDeVerite();

	/**
	 * Returns a new object of class '<em>Ligne Table De Verite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ligne Table De Verite</em>'.
	 * @generated
	 */
	LigneTableDeVerite createLigneTableDeVerite();

	/**
	 * Returns a new object of class '<em>Gestionnaire Historique</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gestionnaire Historique</em>'.
	 * @generated
	 */
	GestionnaireHistorique createGestionnaireHistorique();

	/**
	 * Returns a new object of class '<em>Action Element Circuit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Element Circuit</em>'.
	 * @generated
	 */
	ActionElementCircuit createActionElementCircuit();

	/**
	 * Returns a new object of class '<em>Action Liaison</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Liaison</em>'.
	 * @generated
	 */
	ActionLiaison createActionLiaison();

	/**
	 * Returns a new object of class '<em>Circuit Editor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Circuit Editor</em>'.
	 * @generated
	 */
	CircuitEditor createCircuitEditor();

	/**
	 * Returns a new object of class '<em>Persistance Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Persistance Manager</em>'.
	 * @generated
	 */
	PersistanceManager createPersistanceManager();

	/**
	 * Returns a new object of class '<em>Porte NOT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Porte NOT</em>'.
	 * @generated
	 */
	PorteNOT createPorteNOT();

	/**
	 * Returns a new object of class '<em>Action Deplacer Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Deplacer Element</em>'.
	 * @generated
	 */
	ActionDeplacerElement createActionDeplacerElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CircuiteditorPackage getCircuiteditorPackage();

} //CircuiteditorFactory
