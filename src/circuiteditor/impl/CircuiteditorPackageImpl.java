/**
 */
package circuiteditor.impl;

import circuiteditor.Action;
import circuiteditor.ActionDeplacerElement;
import circuiteditor.ActionElementCircuit;
import circuiteditor.ActionLiaison;
import circuiteditor.Circuit;
import circuiteditor.CircuitEditor;
import circuiteditor.CircuiteditorFactory;
import circuiteditor.CircuiteditorPackage;
import circuiteditor.ElementCircuit;
import circuiteditor.ElementTableVerite;
import circuiteditor.ElementType;
import circuiteditor.Entree;
import circuiteditor.GestionnaireHistorique;
import circuiteditor.LigneTableDeVerite;
import circuiteditor.PersistanceManager;
import circuiteditor.Porte;
import circuiteditor.PorteET;
import circuiteditor.PorteNOT;
import circuiteditor.PorteOU;
import circuiteditor.PortePersonalise;
import circuiteditor.PorteStandard;
import circuiteditor.Sortie;
import circuiteditor.TableDeVerite;
import circuiteditor.TypeAction;
import circuiteditor.TypePorteStandard;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CircuiteditorPackageImpl extends EPackageImpl implements CircuiteditorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass circuitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass porteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementCircuitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sortieEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass porteStandardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portePersonaliseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass porteETEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass porteOUEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableDeVeriteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ligneTableDeVeriteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementTableVeriteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gestionnaireHistoriqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionElementCircuitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionLiaisonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass circuitEditorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persistanceManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass porteNOTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionDeplacerElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeActionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typePorteStandardEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum elementTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see circuiteditor.CircuiteditorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CircuiteditorPackageImpl() {
		super(eNS_URI, CircuiteditorFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CircuiteditorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CircuiteditorPackage init() {
		if (isInited) return (CircuiteditorPackage)EPackage.Registry.INSTANCE.getEPackage(CircuiteditorPackage.eNS_URI);

		// Obtain or create and register package
		CircuiteditorPackageImpl theCircuiteditorPackage = (CircuiteditorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CircuiteditorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CircuiteditorPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theCircuiteditorPackage.createPackageContents();

		// Initialize created meta-data
		theCircuiteditorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCircuiteditorPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CircuiteditorPackage.eNS_URI, theCircuiteditorPackage);
		return theCircuiteditorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCircuit() {
		return circuitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircuit_Fichier() {
		return (EAttribute)circuitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCircuit_CircuitElements() {
		return (EReference)circuitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircuit_MaxPorte() {
		return (EAttribute)circuitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCircuit_Tabledeverite() {
		return (EReference)circuitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCircuit_Historique() {
		return (EReference)circuitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircuit_MaxEntree() {
		return (EAttribute)circuitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircuit_MaxSortie() {
		return (EAttribute)circuitEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCircuit__Ajouter__ElementCircuit() {
		return circuitEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCircuit__Relier__ElementCircuit_ElementCircuit() {
		return circuitEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCircuit__Enlever__ElementCircuit() {
		return circuitEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCircuit__Valider() {
		return circuitEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCircuit__GetElement__String() {
		return circuitEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCircuit__Count__ElementType() {
		return circuitEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCircuit__GetMax__ElementType() {
		return circuitEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCircuit__SupprimerLiaison__ElementCircuit_ElementCircuit() {
		return circuitEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCircuit__Deplacer__ElementCircuit_int_int() {
		return circuitEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCircuit__Delier__ElementCircuit_ElementCircuit() {
		return circuitEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCircuit__CalculerListeSortie__EList_EList() {
		return circuitEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPorte() {
		return porteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementCircuit() {
		return elementCircuitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementCircuit_EmplacementX() {
		return (EAttribute)elementCircuitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementCircuit_EmplacementY() {
		return (EAttribute)elementCircuitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementCircuit_Name() {
		return (EAttribute)elementCircuitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementCircuit_Description() {
		return (EAttribute)elementCircuitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementCircuit_SourceMax() {
		return (EAttribute)elementCircuitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementCircuit_CibleMax() {
		return (EAttribute)elementCircuitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementCircuit_EstCircuitValide() {
		return (EAttribute)elementCircuitEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementCircuit_EstModifier() {
		return (EAttribute)elementCircuitEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementCircuit_Type() {
		return (EAttribute)elementCircuitEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementCircuit_Entree() {
		return (EReference)elementCircuitEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementCircuit_Sortie() {
		return (EReference)elementCircuitEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElementCircuit__Valider() {
		return elementCircuitEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElementCircuit__GetLiaisons() {
		return elementCircuitEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntree() {
		return entreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSortie() {
		return sortieEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPorteStandard() {
		return porteStandardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPorteStandard_TypePorte() {
		return (EAttribute)porteStandardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortePersonalise() {
		return portePersonaliseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortePersonalise_Circuit() {
		return (EReference)portePersonaliseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPorteET() {
		return porteETEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPorteOU() {
		return porteOUEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableDeVerite() {
		return tableDeVeriteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableDeVerite_Possede() {
		return (EReference)tableDeVeriteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableDeVerite_Element() {
		return (EReference)tableDeVeriteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTableDeVerite__CalculerTable() {
		return tableDeVeriteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLigneTableDeVerite() {
		return ligneTableDeVeriteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLigneTableDeVerite_Entrees() {
		return (EAttribute)ligneTableDeVeriteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLigneTableDeVerite_Sorties() {
		return (EAttribute)ligneTableDeVeriteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementTableVerite() {
		return elementTableVeriteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementTableVerite_TableVerite() {
		return (EReference)elementTableVeriteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElementTableVerite__Evaluer() {
		return elementTableVeriteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElementTableVerite__CalculListeEntreeBoolean__int_int() {
		return elementTableVeriteEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGestionnaireHistorique() {
		return gestionnaireHistoriqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGestionnaireHistorique_ActionCurseur() {
		return (EAttribute)gestionnaireHistoriqueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGestionnaireHistorique_Circuit() {
		return (EReference)gestionnaireHistoriqueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGestionnaireHistorique_Actions() {
		return (EReference)gestionnaireHistoriqueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGestionnaireHistorique__EnregistrerAction__Action() {
		return gestionnaireHistoriqueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGestionnaireHistorique__Undo() {
		return gestionnaireHistoriqueEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGestionnaireHistorique__Redo() {
		return gestionnaireHistoriqueEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_Type() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_GestionnaireHistorique() {
		return (EReference)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_Done() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAction__Execute() {
		return actionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAction__Rollback() {
		return actionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionElementCircuit() {
		return actionElementCircuitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionElementCircuit_LiaisonsModifiees() {
		return (EReference)actionElementCircuitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionElementCircuit_ElementModifie() {
		return (EReference)actionElementCircuitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionLiaison() {
		return actionLiaisonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionLiaison_Cible() {
		return (EReference)actionLiaisonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionLiaison_Source() {
		return (EReference)actionLiaisonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCircuitEditor() {
		return circuitEditorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCircuitEditor_MainCircuit() {
		return (EReference)circuitEditorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCircuitEditor_PersistanceManager() {
		return (EReference)circuitEditorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCircuitEditor__Sauvegarder__String() {
		return circuitEditorEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCircuitEditor__Ajouter__ElementType() {
		return circuitEditorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCircuitEditor__Enlever__String() {
		return circuitEditorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCircuitEditor__Nouveau() {
		return circuitEditorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCircuitEditor__Ouvrir__String() {
		return circuitEditorEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCircuitEditor__Delier__ElementCircuit_ElementCircuit() {
		return circuitEditorEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCircuitEditor__Deplacer__ElementCircuit_int_int() {
		return circuitEditorEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCircuitEditor__ExporterTable__String() {
		return circuitEditorEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCircuitEditor__ExporterCircuit__String_byte() {
		return circuitEditorEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCircuitEditor__Undo() {
		return circuitEditorEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCircuitEditor__Redo() {
		return circuitEditorEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCircuitEditor__Relier__ElementCircuit_ElementCircuit() {
		return circuitEditorEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersistanceManager() {
		return persistanceManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPersistanceManager__SauvegardeXMI__Circuit_String() {
		return persistanceManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPersistanceManager__SauvegardeJPG__byte_String() {
		return persistanceManagerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPersistanceManager__SauvegardeTable__TableDeVerite_String() {
		return persistanceManagerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPorteNOT() {
		return porteNOTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionDeplacerElement() {
		return actionDeplacerElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionDeplacerElement_X() {
		return (EAttribute)actionDeplacerElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionDeplacerElement_Y() {
		return (EAttribute)actionDeplacerElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeAction() {
		return typeActionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypePorteStandard() {
		return typePorteStandardEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getElementType() {
		return elementTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircuiteditorFactory getCircuiteditorFactory() {
		return (CircuiteditorFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		circuitEditorEClass = createEClass(CIRCUIT_EDITOR);
		createEReference(circuitEditorEClass, CIRCUIT_EDITOR__MAIN_CIRCUIT);
		createEReference(circuitEditorEClass, CIRCUIT_EDITOR__PERSISTANCE_MANAGER);
		createEOperation(circuitEditorEClass, CIRCUIT_EDITOR___AJOUTER__ELEMENTTYPE);
		createEOperation(circuitEditorEClass, CIRCUIT_EDITOR___ENLEVER__STRING);
		createEOperation(circuitEditorEClass, CIRCUIT_EDITOR___NOUVEAU);
		createEOperation(circuitEditorEClass, CIRCUIT_EDITOR___OUVRIR__STRING);
		createEOperation(circuitEditorEClass, CIRCUIT_EDITOR___DELIER__ELEMENTCIRCUIT_ELEMENTCIRCUIT);
		createEOperation(circuitEditorEClass, CIRCUIT_EDITOR___DEPLACER__ELEMENTCIRCUIT_INT_INT);
		createEOperation(circuitEditorEClass, CIRCUIT_EDITOR___SAUVEGARDER__STRING);
		createEOperation(circuitEditorEClass, CIRCUIT_EDITOR___EXPORTER_TABLE__STRING);
		createEOperation(circuitEditorEClass, CIRCUIT_EDITOR___EXPORTER_CIRCUIT__STRING_BYTE);
		createEOperation(circuitEditorEClass, CIRCUIT_EDITOR___UNDO);
		createEOperation(circuitEditorEClass, CIRCUIT_EDITOR___REDO);
		createEOperation(circuitEditorEClass, CIRCUIT_EDITOR___RELIER__ELEMENTCIRCUIT_ELEMENTCIRCUIT);

		circuitEClass = createEClass(CIRCUIT);
		createEAttribute(circuitEClass, CIRCUIT__FICHIER);
		createEReference(circuitEClass, CIRCUIT__CIRCUIT_ELEMENTS);
		createEAttribute(circuitEClass, CIRCUIT__MAX_PORTE);
		createEReference(circuitEClass, CIRCUIT__TABLEDEVERITE);
		createEReference(circuitEClass, CIRCUIT__HISTORIQUE);
		createEAttribute(circuitEClass, CIRCUIT__MAX_ENTREE);
		createEAttribute(circuitEClass, CIRCUIT__MAX_SORTIE);
		createEOperation(circuitEClass, CIRCUIT___AJOUTER__ELEMENTCIRCUIT);
		createEOperation(circuitEClass, CIRCUIT___RELIER__ELEMENTCIRCUIT_ELEMENTCIRCUIT);
		createEOperation(circuitEClass, CIRCUIT___ENLEVER__ELEMENTCIRCUIT);
		createEOperation(circuitEClass, CIRCUIT___VALIDER);
		createEOperation(circuitEClass, CIRCUIT___GET_ELEMENT__STRING);
		createEOperation(circuitEClass, CIRCUIT___COUNT__ELEMENTTYPE);
		createEOperation(circuitEClass, CIRCUIT___GET_MAX__ELEMENTTYPE);
		createEOperation(circuitEClass, CIRCUIT___SUPPRIMER_LIAISON__ELEMENTCIRCUIT_ELEMENTCIRCUIT);
		createEOperation(circuitEClass, CIRCUIT___DEPLACER__ELEMENTCIRCUIT_INT_INT);
		createEOperation(circuitEClass, CIRCUIT___DELIER__ELEMENTCIRCUIT_ELEMENTCIRCUIT);
		createEOperation(circuitEClass, CIRCUIT___CALCULER_LISTE_SORTIE__ELIST_ELIST);

		elementCircuitEClass = createEClass(ELEMENT_CIRCUIT);
		createEAttribute(elementCircuitEClass, ELEMENT_CIRCUIT__EMPLACEMENT_X);
		createEAttribute(elementCircuitEClass, ELEMENT_CIRCUIT__EMPLACEMENT_Y);
		createEAttribute(elementCircuitEClass, ELEMENT_CIRCUIT__NAME);
		createEAttribute(elementCircuitEClass, ELEMENT_CIRCUIT__DESCRIPTION);
		createEAttribute(elementCircuitEClass, ELEMENT_CIRCUIT__SOURCE_MAX);
		createEAttribute(elementCircuitEClass, ELEMENT_CIRCUIT__CIBLE_MAX);
		createEAttribute(elementCircuitEClass, ELEMENT_CIRCUIT__EST_CIRCUIT_VALIDE);
		createEAttribute(elementCircuitEClass, ELEMENT_CIRCUIT__EST_MODIFIER);
		createEAttribute(elementCircuitEClass, ELEMENT_CIRCUIT__TYPE);
		createEReference(elementCircuitEClass, ELEMENT_CIRCUIT__ENTREE);
		createEReference(elementCircuitEClass, ELEMENT_CIRCUIT__SORTIE);
		createEOperation(elementCircuitEClass, ELEMENT_CIRCUIT___VALIDER);
		createEOperation(elementCircuitEClass, ELEMENT_CIRCUIT___GET_LIAISONS);

		porteEClass = createEClass(PORTE);

		porteStandardEClass = createEClass(PORTE_STANDARD);
		createEAttribute(porteStandardEClass, PORTE_STANDARD__TYPE_PORTE);

		portePersonaliseEClass = createEClass(PORTE_PERSONALISE);
		createEReference(portePersonaliseEClass, PORTE_PERSONALISE__CIRCUIT);

		porteETEClass = createEClass(PORTE_ET);

		porteOUEClass = createEClass(PORTE_OU);

		entreeEClass = createEClass(ENTREE);

		sortieEClass = createEClass(SORTIE);

		tableDeVeriteEClass = createEClass(TABLE_DE_VERITE);
		createEReference(tableDeVeriteEClass, TABLE_DE_VERITE__POSSEDE);
		createEReference(tableDeVeriteEClass, TABLE_DE_VERITE__ELEMENT);
		createEOperation(tableDeVeriteEClass, TABLE_DE_VERITE___CALCULER_TABLE);

		ligneTableDeVeriteEClass = createEClass(LIGNE_TABLE_DE_VERITE);
		createEAttribute(ligneTableDeVeriteEClass, LIGNE_TABLE_DE_VERITE__ENTREES);
		createEAttribute(ligneTableDeVeriteEClass, LIGNE_TABLE_DE_VERITE__SORTIES);

		elementTableVeriteEClass = createEClass(ELEMENT_TABLE_VERITE);
		createEReference(elementTableVeriteEClass, ELEMENT_TABLE_VERITE__TABLE_VERITE);
		createEOperation(elementTableVeriteEClass, ELEMENT_TABLE_VERITE___EVALUER);
		createEOperation(elementTableVeriteEClass, ELEMENT_TABLE_VERITE___CALCUL_LISTE_ENTREE_BOOLEAN__INT_INT);

		gestionnaireHistoriqueEClass = createEClass(GESTIONNAIRE_HISTORIQUE);
		createEAttribute(gestionnaireHistoriqueEClass, GESTIONNAIRE_HISTORIQUE__ACTION_CURSEUR);
		createEReference(gestionnaireHistoriqueEClass, GESTIONNAIRE_HISTORIQUE__CIRCUIT);
		createEReference(gestionnaireHistoriqueEClass, GESTIONNAIRE_HISTORIQUE__ACTIONS);
		createEOperation(gestionnaireHistoriqueEClass, GESTIONNAIRE_HISTORIQUE___ENREGISTRER_ACTION__ACTION);
		createEOperation(gestionnaireHistoriqueEClass, GESTIONNAIRE_HISTORIQUE___UNDO);
		createEOperation(gestionnaireHistoriqueEClass, GESTIONNAIRE_HISTORIQUE___REDO);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__TYPE);
		createEReference(actionEClass, ACTION__GESTIONNAIRE_HISTORIQUE);
		createEAttribute(actionEClass, ACTION__DONE);
		createEOperation(actionEClass, ACTION___EXECUTE);
		createEOperation(actionEClass, ACTION___ROLLBACK);

		actionElementCircuitEClass = createEClass(ACTION_ELEMENT_CIRCUIT);
		createEReference(actionElementCircuitEClass, ACTION_ELEMENT_CIRCUIT__LIAISONS_MODIFIEES);
		createEReference(actionElementCircuitEClass, ACTION_ELEMENT_CIRCUIT__ELEMENT_MODIFIE);

		actionLiaisonEClass = createEClass(ACTION_LIAISON);
		createEReference(actionLiaisonEClass, ACTION_LIAISON__CIBLE);
		createEReference(actionLiaisonEClass, ACTION_LIAISON__SOURCE);

		persistanceManagerEClass = createEClass(PERSISTANCE_MANAGER);
		createEOperation(persistanceManagerEClass, PERSISTANCE_MANAGER___SAUVEGARDE_XMI__CIRCUIT_STRING);
		createEOperation(persistanceManagerEClass, PERSISTANCE_MANAGER___SAUVEGARDE_JPG__BYTE_STRING);
		createEOperation(persistanceManagerEClass, PERSISTANCE_MANAGER___SAUVEGARDE_TABLE__TABLEDEVERITE_STRING);

		porteNOTEClass = createEClass(PORTE_NOT);

		actionDeplacerElementEClass = createEClass(ACTION_DEPLACER_ELEMENT);
		createEAttribute(actionDeplacerElementEClass, ACTION_DEPLACER_ELEMENT__X);
		createEAttribute(actionDeplacerElementEClass, ACTION_DEPLACER_ELEMENT__Y);

		// Create enums
		typeActionEEnum = createEEnum(TYPE_ACTION);
		typePorteStandardEEnum = createEEnum(TYPE_PORTE_STANDARD);
		elementTypeEEnum = createEEnum(ELEMENT_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		circuitEClass.getESuperTypes().add(this.getElementTableVerite());
		porteEClass.getESuperTypes().add(this.getElementTableVerite());
		porteStandardEClass.getESuperTypes().add(this.getPorte());
		portePersonaliseEClass.getESuperTypes().add(this.getPorte());
		porteETEClass.getESuperTypes().add(this.getPorteStandard());
		porteOUEClass.getESuperTypes().add(this.getPorteStandard());
		entreeEClass.getESuperTypes().add(this.getElementTableVerite());
		sortieEClass.getESuperTypes().add(this.getElementCircuit());
		elementTableVeriteEClass.getESuperTypes().add(this.getElementCircuit());
		actionElementCircuitEClass.getESuperTypes().add(this.getAction());
		actionLiaisonEClass.getESuperTypes().add(this.getAction());
		porteNOTEClass.getESuperTypes().add(this.getPorteStandard());
		actionDeplacerElementEClass.getESuperTypes().add(this.getActionElementCircuit());

		// Initialize classes, features, and operations; add parameters
		initEClass(circuitEditorEClass, CircuitEditor.class, "CircuitEditor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCircuitEditor_MainCircuit(), this.getCircuit(), null, "mainCircuit", null, 1, 1, CircuitEditor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCircuitEditor_PersistanceManager(), this.getPersistanceManager(), null, "persistanceManager", null, 1, 1, CircuitEditor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getCircuitEditor__Ajouter__ElementType(), null, "ajouter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getElementType(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCircuitEditor__Enlever__String(), ecorePackage.getEBoolean(), "enlever", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "nomElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCircuitEditor__Nouveau(), ecorePackage.getEBoolean(), "nouveau", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCircuitEditor__Ouvrir__String(), null, "ouvrir", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "path", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCircuitEditor__Delier__ElementCircuit_ElementCircuit(), ecorePackage.getEBoolean(), "delier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getElementCircuit(), "elementSource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getElementCircuit(), "elementCible", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCircuitEditor__Deplacer__ElementCircuit_int_int(), null, "deplacer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getElementCircuit(), "element", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "x", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "y", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCircuitEditor__Sauvegarder__String(), ecorePackage.getEBoolean(), "sauvegarder", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "filePath", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCircuitEditor__ExporterTable__String(), null, "exporterTable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "path", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCircuitEditor__ExporterCircuit__String_byte(), null, "exporterCircuit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "path", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByteArray(), "circuit", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCircuitEditor__Undo(), null, "undo", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCircuitEditor__Redo(), null, "redo", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCircuitEditor__Relier__ElementCircuit_ElementCircuit(), ecorePackage.getEBoolean(), "relier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getElementCircuit(), "elementSource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getElementCircuit(), "elementCible", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(circuitEClass, Circuit.class, "Circuit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCircuit_Fichier(), ecorePackage.getEString(), "fichier", null, 0, 1, Circuit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCircuit_CircuitElements(), this.getElementCircuit(), null, "circuitElements", null, 0, -1, Circuit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCircuit_MaxPorte(), ecorePackage.getEInt(), "maxPorte", "50", 0, 1, Circuit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCircuit_Tabledeverite(), this.getTableDeVerite(), null, "tabledeverite", null, 1, 1, Circuit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCircuit_Historique(), this.getGestionnaireHistorique(), this.getGestionnaireHistorique_Circuit(), "historique", null, 1, 1, Circuit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCircuit_MaxEntree(), ecorePackage.getEInt(), "maxEntree", "5", 0, 1, Circuit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCircuit_MaxSortie(), ecorePackage.getEInt(), "maxSortie", "5", 0, 1, Circuit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getCircuit__Ajouter__ElementCircuit(), ecorePackage.getEBoolean(), "ajouter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getElementCircuit(), "elementCircuit", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCircuit__Relier__ElementCircuit_ElementCircuit(), ecorePackage.getEBoolean(), "relier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getElementCircuit(), "elementSource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getElementCircuit(), "elementCible", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCircuit__Enlever__ElementCircuit(), ecorePackage.getEBoolean(), "enlever", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getElementCircuit(), "elementCircuit", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCircuit__Valider(), ecorePackage.getEBoolean(), "valider", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCircuit__GetElement__String(), this.getElementCircuit(), "getElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "nomElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCircuit__Count__ElementType(), ecorePackage.getEInt(), "count", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getElementType(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCircuit__GetMax__ElementType(), ecorePackage.getEInt(), "getMax", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getElementType(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCircuit__SupprimerLiaison__ElementCircuit_ElementCircuit(), null, "supprimerLiaison", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getElementCircuit(), "e1", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getElementCircuit(), "e2", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCircuit__Deplacer__ElementCircuit_int_int(), null, "deplacer", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getElementCircuit(), "element", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "x", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "y", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCircuit__Delier__ElementCircuit_ElementCircuit(), ecorePackage.getEBoolean(), "delier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getElementCircuit(), "elementSource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getElementCircuit(), "elementCible", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCircuit__CalculerListeSortie__EList_EList(), this.getElementCircuit(), "calculerListeSortie", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getElementCircuit(), "listePorte", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getElementCircuit(), "listeResultat", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(elementCircuitEClass, ElementCircuit.class, "ElementCircuit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementCircuit_EmplacementX(), ecorePackage.getEInt(), "emplacementX", null, 0, 1, ElementCircuit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementCircuit_EmplacementY(), ecorePackage.getEInt(), "emplacementY", null, 0, 1, ElementCircuit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementCircuit_Name(), ecorePackage.getEString(), "name", null, 0, 1, ElementCircuit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementCircuit_Description(), ecorePackage.getEString(), "description", null, 0, 1, ElementCircuit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementCircuit_SourceMax(), ecorePackage.getEInt(), "sourceMax", "0", 0, 1, ElementCircuit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementCircuit_CibleMax(), ecorePackage.getEInt(), "cibleMax", "0", 0, 1, ElementCircuit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementCircuit_EstCircuitValide(), ecorePackage.getEBoolean(), "estCircuitValide", null, 0, 1, ElementCircuit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementCircuit_EstModifier(), ecorePackage.getEBoolean(), "estModifier", null, 0, 1, ElementCircuit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementCircuit_Type(), this.getElementType(), "type", null, 0, 1, ElementCircuit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementCircuit_Entree(), this.getElementCircuit(), this.getElementCircuit_Sortie(), "entree", null, 0, -1, ElementCircuit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementCircuit_Sortie(), this.getElementCircuit(), this.getElementCircuit_Entree(), "sortie", null, 0, -1, ElementCircuit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getElementCircuit__Valider(), ecorePackage.getEBoolean(), "valider", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElementCircuit__GetLiaisons(), null, "getLiaisons", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEEList());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(porteEClass, Porte.class, "Porte", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(porteStandardEClass, PorteStandard.class, "PorteStandard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPorteStandard_TypePorte(), this.getTypePorteStandard(), "typePorte", "AND", 0, 1, PorteStandard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portePersonaliseEClass, PortePersonalise.class, "PortePersonalise", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortePersonalise_Circuit(), this.getCircuit(), null, "circuit", null, 1, 1, PortePersonalise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(porteETEClass, PorteET.class, "PorteET", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(porteOUEClass, PorteOU.class, "PorteOU", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entreeEClass, Entree.class, "Entree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sortieEClass, Sortie.class, "Sortie", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tableDeVeriteEClass, TableDeVerite.class, "TableDeVerite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableDeVerite_Possede(), this.getLigneTableDeVerite(), null, "possede", null, 0, -1, TableDeVerite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableDeVerite_Element(), this.getElementTableVerite(), this.getElementTableVerite_TableVerite(), "element", null, 0, 1, TableDeVerite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTableDeVerite__CalculerTable(), null, "calculerTable", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ligneTableDeVeriteEClass, LigneTableDeVerite.class, "LigneTableDeVerite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLigneTableDeVerite_Entrees(), ecorePackage.getEBoolean(), "entrees", null, 0, -1, LigneTableDeVerite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLigneTableDeVerite_Sorties(), ecorePackage.getEBoolean(), "sorties", null, 0, -1, LigneTableDeVerite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementTableVeriteEClass, ElementTableVerite.class, "ElementTableVerite", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementTableVerite_TableVerite(), this.getTableDeVerite(), this.getTableDeVerite_Element(), "tableVerite", null, 0, 1, ElementTableVerite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getElementTableVerite__Evaluer(), this.getLigneTableDeVerite(), "evaluer", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElementTableVerite__CalculListeEntreeBoolean__int_int(), ecorePackage.getEBoolean(), "calculListeEntreeBoolean", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "longueurListe", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "valeur", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(gestionnaireHistoriqueEClass, GestionnaireHistorique.class, "GestionnaireHistorique", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGestionnaireHistorique_ActionCurseur(), ecorePackage.getEInt(), "actionCurseur", "0", 0, 1, GestionnaireHistorique.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGestionnaireHistorique_Circuit(), this.getCircuit(), this.getCircuit_Historique(), "circuit", null, 0, 1, GestionnaireHistorique.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGestionnaireHistorique_Actions(), this.getAction(), this.getAction_GestionnaireHistorique(), "actions", null, 0, -1, GestionnaireHistorique.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getGestionnaireHistorique__EnregistrerAction__Action(), ecorePackage.getEBoolean(), "enregistrerAction", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAction(), "action", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGestionnaireHistorique__Undo(), null, "undo", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGestionnaireHistorique__Redo(), null, "redo", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_Type(), this.getTypeAction(), "type", "AJOUTER", 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_GestionnaireHistorique(), this.getGestionnaireHistorique(), this.getGestionnaireHistorique_Actions(), "gestionnaireHistorique", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_Done(), ecorePackage.getEBoolean(), "done", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAction__Execute(), null, "execute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAction__Rollback(), null, "rollback", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionElementCircuitEClass, ActionElementCircuit.class, "ActionElementCircuit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionElementCircuit_LiaisonsModifiees(), this.getActionLiaison(), null, "liaisonsModifiees", null, 0, -1, ActionElementCircuit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionElementCircuit_ElementModifie(), this.getElementCircuit(), null, "elementModifie", null, 1, 1, ActionElementCircuit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionLiaisonEClass, ActionLiaison.class, "ActionLiaison", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionLiaison_Cible(), this.getElementCircuit(), null, "cible", null, 1, 1, ActionLiaison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionLiaison_Source(), this.getElementCircuit(), null, "source", null, 1, 1, ActionLiaison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(persistanceManagerEClass, PersistanceManager.class, "PersistanceManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getPersistanceManager__SauvegardeXMI__Circuit_String(), ecorePackage.getEBoolean(), "sauvegardeXMI", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCircuit(), "circuit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "path", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPersistanceManager__SauvegardeJPG__byte_String(), null, "sauvegardeJPG", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEByteArray(), "circuit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "path", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPersistanceManager__SauvegardeTable__TableDeVerite_String(), null, "sauvegardeTable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTableDeVerite(), "table", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "path", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(porteNOTEClass, PorteNOT.class, "PorteNOT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionDeplacerElementEClass, ActionDeplacerElement.class, "ActionDeplacerElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionDeplacerElement_X(), ecorePackage.getEInt(), "x", null, 0, 1, ActionDeplacerElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionDeplacerElement_Y(), ecorePackage.getEInt(), "y", null, 0, 1, ActionDeplacerElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typeActionEEnum, TypeAction.class, "TypeAction");
		addEEnumLiteral(typeActionEEnum, TypeAction.AJOUTER);
		addEEnumLiteral(typeActionEEnum, TypeAction.SUPPRIMER);
		addEEnumLiteral(typeActionEEnum, TypeAction.DEPLACER);

		initEEnum(typePorteStandardEEnum, TypePorteStandard.class, "TypePorteStandard");
		addEEnumLiteral(typePorteStandardEEnum, TypePorteStandard.AND);
		addEEnumLiteral(typePorteStandardEEnum, TypePorteStandard.OR);
		addEEnumLiteral(typePorteStandardEEnum, TypePorteStandard.NOT);

		initEEnum(elementTypeEEnum, ElementType.class, "ElementType");
		addEEnumLiteral(elementTypeEEnum, ElementType.SORTIE);
		addEEnumLiteral(elementTypeEEnum, ElementType.ENTREE);
		addEEnumLiteral(elementTypeEEnum, ElementType.PORTE_STANDARD);
		addEEnumLiteral(elementTypeEEnum, ElementType.PORTE_PERSONALISE);
		addEEnumLiteral(elementTypeEEnum, ElementType.PORTE_ET);
		addEEnumLiteral(elementTypeEEnum, ElementType.PORTE_OU);
		addEEnumLiteral(elementTypeEEnum, ElementType.PORTE_NOT);

		// Create resource
		createResource(eNS_URI);
	}

} //CircuiteditorPackageImpl
