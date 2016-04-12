/**
 */
package circuiteditor.util;

import circuiteditor.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see circuiteditor.CircuiteditorPackage
 * @generated
 */
public class CircuiteditorSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CircuiteditorPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircuiteditorSwitch() {
		if (modelPackage == null) {
			modelPackage = CircuiteditorPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CircuiteditorPackage.CIRCUIT_EDITOR: {
				CircuitEditor circuitEditor = (CircuitEditor)theEObject;
				T result = caseCircuitEditor(circuitEditor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CircuiteditorPackage.CIRCUIT: {
				Circuit circuit = (Circuit)theEObject;
				T result = caseCircuit(circuit);
				if (result == null) result = caseElementTableVerite(circuit);
				if (result == null) result = caseElementCircuit(circuit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CircuiteditorPackage.ELEMENT_CIRCUIT: {
				ElementCircuit elementCircuit = (ElementCircuit)theEObject;
				T result = caseElementCircuit(elementCircuit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CircuiteditorPackage.PORTE: {
				Porte porte = (Porte)theEObject;
				T result = casePorte(porte);
				if (result == null) result = caseElementTableVerite(porte);
				if (result == null) result = caseElementCircuit(porte);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CircuiteditorPackage.PORTE_STANDARD: {
				PorteStandard porteStandard = (PorteStandard)theEObject;
				T result = casePorteStandard(porteStandard);
				if (result == null) result = casePorte(porteStandard);
				if (result == null) result = caseElementTableVerite(porteStandard);
				if (result == null) result = caseElementCircuit(porteStandard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CircuiteditorPackage.PORTE_PERSONALISE: {
				PortePersonalise portePersonalise = (PortePersonalise)theEObject;
				T result = casePortePersonalise(portePersonalise);
				if (result == null) result = casePorte(portePersonalise);
				if (result == null) result = caseElementTableVerite(portePersonalise);
				if (result == null) result = caseElementCircuit(portePersonalise);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CircuiteditorPackage.PORTE_ET: {
				PorteET porteET = (PorteET)theEObject;
				T result = casePorteET(porteET);
				if (result == null) result = casePorteStandard(porteET);
				if (result == null) result = casePorte(porteET);
				if (result == null) result = caseElementTableVerite(porteET);
				if (result == null) result = caseElementCircuit(porteET);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CircuiteditorPackage.PORTE_OU: {
				PorteOU porteOU = (PorteOU)theEObject;
				T result = casePorteOU(porteOU);
				if (result == null) result = casePorteStandard(porteOU);
				if (result == null) result = casePorte(porteOU);
				if (result == null) result = caseElementTableVerite(porteOU);
				if (result == null) result = caseElementCircuit(porteOU);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CircuiteditorPackage.ENTREE: {
				Entree entree = (Entree)theEObject;
				T result = caseEntree(entree);
				if (result == null) result = caseElementTableVerite(entree);
				if (result == null) result = caseElementCircuit(entree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CircuiteditorPackage.SORTIE: {
				Sortie sortie = (Sortie)theEObject;
				T result = caseSortie(sortie);
				if (result == null) result = caseElementCircuit(sortie);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CircuiteditorPackage.TABLE_DE_VERITE: {
				TableDeVerite tableDeVerite = (TableDeVerite)theEObject;
				T result = caseTableDeVerite(tableDeVerite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CircuiteditorPackage.LIGNE_TABLE_DE_VERITE: {
				LigneTableDeVerite ligneTableDeVerite = (LigneTableDeVerite)theEObject;
				T result = caseLigneTableDeVerite(ligneTableDeVerite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CircuiteditorPackage.ELEMENT_TABLE_VERITE: {
				ElementTableVerite elementTableVerite = (ElementTableVerite)theEObject;
				T result = caseElementTableVerite(elementTableVerite);
				if (result == null) result = caseElementCircuit(elementTableVerite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CircuiteditorPackage.GESTIONNAIRE_HISTORIQUE: {
				GestionnaireHistorique gestionnaireHistorique = (GestionnaireHistorique)theEObject;
				T result = caseGestionnaireHistorique(gestionnaireHistorique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CircuiteditorPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CircuiteditorPackage.ACTION_ELEMENT_CIRCUIT: {
				ActionElementCircuit actionElementCircuit = (ActionElementCircuit)theEObject;
				T result = caseActionElementCircuit(actionElementCircuit);
				if (result == null) result = caseAction(actionElementCircuit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CircuiteditorPackage.ACTION_LIAISON: {
				ActionLiaison actionLiaison = (ActionLiaison)theEObject;
				T result = caseActionLiaison(actionLiaison);
				if (result == null) result = caseAction(actionLiaison);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CircuiteditorPackage.PERSISTANCE_MANAGER: {
				PersistanceManager persistanceManager = (PersistanceManager)theEObject;
				T result = casePersistanceManager(persistanceManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CircuiteditorPackage.PORTE_NOT: {
				PorteNOT porteNOT = (PorteNOT)theEObject;
				T result = casePorteNOT(porteNOT);
				if (result == null) result = casePorteStandard(porteNOT);
				if (result == null) result = casePorte(porteNOT);
				if (result == null) result = caseElementTableVerite(porteNOT);
				if (result == null) result = caseElementCircuit(porteNOT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CircuiteditorPackage.ACTION_DEPLACER_ELEMENT: {
				ActionDeplacerElement actionDeplacerElement = (ActionDeplacerElement)theEObject;
				T result = caseActionDeplacerElement(actionDeplacerElement);
				if (result == null) result = caseActionElementCircuit(actionDeplacerElement);
				if (result == null) result = caseAction(actionDeplacerElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Circuit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Circuit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCircuit(Circuit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Porte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Porte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePorte(Porte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Circuit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Circuit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementCircuit(ElementCircuit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntree(Entree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sortie</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sortie</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSortie(Sortie object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Porte Standard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Porte Standard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePorteStandard(PorteStandard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Porte Personalise</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Porte Personalise</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortePersonalise(PortePersonalise object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Porte ET</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Porte ET</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePorteET(PorteET object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Porte OU</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Porte OU</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePorteOU(PorteOU object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table De Verite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table De Verite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableDeVerite(TableDeVerite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ligne Table De Verite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ligne Table De Verite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLigneTableDeVerite(LigneTableDeVerite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Table Verite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Table Verite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementTableVerite(ElementTableVerite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gestionnaire Historique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gestionnaire Historique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGestionnaireHistorique(GestionnaireHistorique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Element Circuit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Element Circuit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionElementCircuit(ActionElementCircuit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Liaison</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Liaison</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionLiaison(ActionLiaison object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Circuit Editor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Circuit Editor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCircuitEditor(CircuitEditor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Persistance Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Persistance Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersistanceManager(PersistanceManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Porte NOT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Porte NOT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePorteNOT(PorteNOT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Deplacer Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Deplacer Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionDeplacerElement(ActionDeplacerElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CircuiteditorSwitch
