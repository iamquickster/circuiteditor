/**
 */
package circuiteditor.util;

import circuiteditor.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see circuiteditor.CircuiteditorPackage
 * @generated
 */
public class CircuiteditorAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CircuiteditorPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircuiteditorAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CircuiteditorPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CircuiteditorSwitch<Adapter> modelSwitch =
		new CircuiteditorSwitch<Adapter>() {
			@Override
			public Adapter caseCircuitEditor(CircuitEditor object) {
				return createCircuitEditorAdapter();
			}
			@Override
			public Adapter caseCircuit(Circuit object) {
				return createCircuitAdapter();
			}
			@Override
			public Adapter caseElementCircuit(ElementCircuit object) {
				return createElementCircuitAdapter();
			}
			@Override
			public Adapter casePorte(Porte object) {
				return createPorteAdapter();
			}
			@Override
			public Adapter casePorteStandard(PorteStandard object) {
				return createPorteStandardAdapter();
			}
			@Override
			public Adapter casePortePersonalise(PortePersonalise object) {
				return createPortePersonaliseAdapter();
			}
			@Override
			public Adapter casePorteET(PorteET object) {
				return createPorteETAdapter();
			}
			@Override
			public Adapter casePorteOU(PorteOU object) {
				return createPorteOUAdapter();
			}
			@Override
			public Adapter caseEntree(Entree object) {
				return createEntreeAdapter();
			}
			@Override
			public Adapter caseSortie(Sortie object) {
				return createSortieAdapter();
			}
			@Override
			public Adapter caseTableDeVerite(TableDeVerite object) {
				return createTableDeVeriteAdapter();
			}
			@Override
			public Adapter caseLigneTableDeVerite(LigneTableDeVerite object) {
				return createLigneTableDeVeriteAdapter();
			}
			@Override
			public Adapter caseElementTableVerite(ElementTableVerite object) {
				return createElementTableVeriteAdapter();
			}
			@Override
			public Adapter caseGestionnaireHistorique(GestionnaireHistorique object) {
				return createGestionnaireHistoriqueAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseActionElementCircuit(ActionElementCircuit object) {
				return createActionElementCircuitAdapter();
			}
			@Override
			public Adapter caseActionLiaison(ActionLiaison object) {
				return createActionLiaisonAdapter();
			}
			@Override
			public Adapter casePersistanceManager(PersistanceManager object) {
				return createPersistanceManagerAdapter();
			}
			@Override
			public Adapter casePorteNOT(PorteNOT object) {
				return createPorteNOTAdapter();
			}
			@Override
			public Adapter caseActionDeplacerElement(ActionDeplacerElement object) {
				return createActionDeplacerElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link circuiteditor.Circuit <em>Circuit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circuiteditor.Circuit
	 * @generated
	 */
	public Adapter createCircuitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link circuiteditor.Porte <em>Porte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circuiteditor.Porte
	 * @generated
	 */
	public Adapter createPorteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link circuiteditor.ElementCircuit <em>Element Circuit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circuiteditor.ElementCircuit
	 * @generated
	 */
	public Adapter createElementCircuitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link circuiteditor.Entree <em>Entree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circuiteditor.Entree
	 * @generated
	 */
	public Adapter createEntreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link circuiteditor.Sortie <em>Sortie</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circuiteditor.Sortie
	 * @generated
	 */
	public Adapter createSortieAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link circuiteditor.PorteStandard <em>Porte Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circuiteditor.PorteStandard
	 * @generated
	 */
	public Adapter createPorteStandardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link circuiteditor.PortePersonalise <em>Porte Personalise</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circuiteditor.PortePersonalise
	 * @generated
	 */
	public Adapter createPortePersonaliseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link circuiteditor.PorteET <em>Porte ET</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circuiteditor.PorteET
	 * @generated
	 */
	public Adapter createPorteETAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link circuiteditor.PorteOU <em>Porte OU</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circuiteditor.PorteOU
	 * @generated
	 */
	public Adapter createPorteOUAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link circuiteditor.TableDeVerite <em>Table De Verite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circuiteditor.TableDeVerite
	 * @generated
	 */
	public Adapter createTableDeVeriteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link circuiteditor.LigneTableDeVerite <em>Ligne Table De Verite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circuiteditor.LigneTableDeVerite
	 * @generated
	 */
	public Adapter createLigneTableDeVeriteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link circuiteditor.ElementTableVerite <em>Element Table Verite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circuiteditor.ElementTableVerite
	 * @generated
	 */
	public Adapter createElementTableVeriteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link circuiteditor.GestionnaireHistorique <em>Gestionnaire Historique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circuiteditor.GestionnaireHistorique
	 * @generated
	 */
	public Adapter createGestionnaireHistoriqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link circuiteditor.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circuiteditor.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link circuiteditor.ActionElementCircuit <em>Action Element Circuit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circuiteditor.ActionElementCircuit
	 * @generated
	 */
	public Adapter createActionElementCircuitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link circuiteditor.ActionLiaison <em>Action Liaison</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circuiteditor.ActionLiaison
	 * @generated
	 */
	public Adapter createActionLiaisonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link circuiteditor.CircuitEditor <em>Circuit Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circuiteditor.CircuitEditor
	 * @generated
	 */
	public Adapter createCircuitEditorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link circuiteditor.PersistanceManager <em>Persistance Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circuiteditor.PersistanceManager
	 * @generated
	 */
	public Adapter createPersistanceManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link circuiteditor.PorteNOT <em>Porte NOT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circuiteditor.PorteNOT
	 * @generated
	 */
	public Adapter createPorteNOTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link circuiteditor.ActionDeplacerElement <em>Action Deplacer Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see circuiteditor.ActionDeplacerElement
	 * @generated
	 */
	public Adapter createActionDeplacerElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CircuiteditorAdapterFactory
