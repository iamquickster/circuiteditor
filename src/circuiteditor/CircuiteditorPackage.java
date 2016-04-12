/**
 */
package circuiteditor;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see circuiteditor.CircuiteditorFactory
 * @model kind="package"
 * @generated
 */
public interface CircuiteditorPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "circuiteditor";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/circuiteditor";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "circuiteditor";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CircuiteditorPackage eINSTANCE = circuiteditor.impl.CircuiteditorPackageImpl.init();

	/**
	 * The meta object id for the '{@link circuiteditor.impl.ElementCircuitImpl <em>Element Circuit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circuiteditor.impl.ElementCircuitImpl
	 * @see circuiteditor.impl.CircuiteditorPackageImpl#getElementCircuit()
	 * @generated
	 */
	int ELEMENT_CIRCUIT = 2;

	/**
	 * The meta object id for the '{@link circuiteditor.ElementTableVerite <em>Element Table Verite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circuiteditor.ElementTableVerite
	 * @see circuiteditor.impl.CircuiteditorPackageImpl#getElementTableVerite()
	 * @generated
	 */
	int ELEMENT_TABLE_VERITE = 12;

	/**
	 * The meta object id for the '{@link circuiteditor.impl.CircuitImpl <em>Circuit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circuiteditor.impl.CircuitImpl
	 * @see circuiteditor.impl.CircuiteditorPackageImpl#getCircuit()
	 * @generated
	 */
	int CIRCUIT = 1;

	/**
	 * The meta object id for the '{@link circuiteditor.impl.PorteImpl <em>Porte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circuiteditor.impl.PorteImpl
	 * @see circuiteditor.impl.CircuiteditorPackageImpl#getPorte()
	 * @generated
	 */
	int PORTE = 3;

	/**
	 * The meta object id for the '{@link circuiteditor.impl.EntreeImpl <em>Entree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circuiteditor.impl.EntreeImpl
	 * @see circuiteditor.impl.CircuiteditorPackageImpl#getEntree()
	 * @generated
	 */
	int ENTREE = 8;

	/**
	 * The meta object id for the '{@link circuiteditor.impl.SortieImpl <em>Sortie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circuiteditor.impl.SortieImpl
	 * @see circuiteditor.impl.CircuiteditorPackageImpl#getSortie()
	 * @generated
	 */
	int SORTIE = 9;

	/**
	 * The meta object id for the '{@link circuiteditor.impl.PorteStandardImpl <em>Porte Standard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circuiteditor.impl.PorteStandardImpl
	 * @see circuiteditor.impl.CircuiteditorPackageImpl#getPorteStandard()
	 * @generated
	 */
	int PORTE_STANDARD = 4;

	/**
	 * The meta object id for the '{@link circuiteditor.impl.PortePersonaliseImpl <em>Porte Personalise</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circuiteditor.impl.PortePersonaliseImpl
	 * @see circuiteditor.impl.CircuiteditorPackageImpl#getPortePersonalise()
	 * @generated
	 */
	int PORTE_PERSONALISE = 5;

	/**
	 * The meta object id for the '{@link circuiteditor.impl.PorteETImpl <em>Porte ET</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circuiteditor.impl.PorteETImpl
	 * @see circuiteditor.impl.CircuiteditorPackageImpl#getPorteET()
	 * @generated
	 */
	int PORTE_ET = 6;

	/**
	 * The meta object id for the '{@link circuiteditor.impl.PorteOUImpl <em>Porte OU</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circuiteditor.impl.PorteOUImpl
	 * @see circuiteditor.impl.CircuiteditorPackageImpl#getPorteOU()
	 * @generated
	 */
	int PORTE_OU = 7;

	/**
	 * The meta object id for the '{@link circuiteditor.impl.TableDeVeriteImpl <em>Table De Verite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circuiteditor.impl.TableDeVeriteImpl
	 * @see circuiteditor.impl.CircuiteditorPackageImpl#getTableDeVerite()
	 * @generated
	 */
	int TABLE_DE_VERITE = 10;

	/**
	 * The meta object id for the '{@link circuiteditor.impl.LigneTableDeVeriteImpl <em>Ligne Table De Verite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circuiteditor.impl.LigneTableDeVeriteImpl
	 * @see circuiteditor.impl.CircuiteditorPackageImpl#getLigneTableDeVerite()
	 * @generated
	 */
	int LIGNE_TABLE_DE_VERITE = 11;

	/**
	 * The meta object id for the '{@link circuiteditor.impl.GestionnaireHistoriqueImpl <em>Gestionnaire Historique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circuiteditor.impl.GestionnaireHistoriqueImpl
	 * @see circuiteditor.impl.CircuiteditorPackageImpl#getGestionnaireHistorique()
	 * @generated
	 */
	int GESTIONNAIRE_HISTORIQUE = 13;

	/**
	 * The meta object id for the '{@link circuiteditor.Action <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circuiteditor.Action
	 * @see circuiteditor.impl.CircuiteditorPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 14;

	/**
	 * The meta object id for the '{@link circuiteditor.impl.ActionElementCircuitImpl <em>Action Element Circuit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circuiteditor.impl.ActionElementCircuitImpl
	 * @see circuiteditor.impl.CircuiteditorPackageImpl#getActionElementCircuit()
	 * @generated
	 */
	int ACTION_ELEMENT_CIRCUIT = 15;

	/**
	 * The meta object id for the '{@link circuiteditor.impl.ActionLiaisonImpl <em>Action Liaison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circuiteditor.impl.ActionLiaisonImpl
	 * @see circuiteditor.impl.CircuiteditorPackageImpl#getActionLiaison()
	 * @generated
	 */
	int ACTION_LIAISON = 16;

	/**
	 * The meta object id for the '{@link circuiteditor.impl.CircuitEditorImpl <em>Circuit Editor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circuiteditor.impl.CircuitEditorImpl
	 * @see circuiteditor.impl.CircuiteditorPackageImpl#getCircuitEditor()
	 * @generated
	 */
	int CIRCUIT_EDITOR = 0;

	/**
	 * The feature id for the '<em><b>Main Circuit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_EDITOR__MAIN_CIRCUIT = 0;

	/**
	 * The feature id for the '<em><b>Persistance Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_EDITOR__PERSISTANCE_MANAGER = 1;

	/**
	 * The number of structural features of the '<em>Circuit Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_EDITOR_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Ajouter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_EDITOR___AJOUTER__ELEMENTTYPE = 0;

	/**
	 * The operation id for the '<em>Enlever</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_EDITOR___ENLEVER__STRING = 1;

	/**
	 * The operation id for the '<em>Nouveau</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_EDITOR___NOUVEAU = 2;

	/**
	 * The operation id for the '<em>Ouvrir</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_EDITOR___OUVRIR__STRING = 3;

	/**
	 * The operation id for the '<em>Delier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_EDITOR___DELIER__ELEMENTCIRCUIT_ELEMENTCIRCUIT = 4;

	/**
	 * The operation id for the '<em>Deplacer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_EDITOR___DEPLACER__ELEMENTCIRCUIT_INT_INT = 5;

	/**
	 * The operation id for the '<em>Sauvegarder</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_EDITOR___SAUVEGARDER__STRING = 6;

	/**
	 * The operation id for the '<em>Exporter Table</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_EDITOR___EXPORTER_TABLE__STRING = 7;

	/**
	 * The operation id for the '<em>Exporter Circuit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_EDITOR___EXPORTER_CIRCUIT__STRING_BYTE = 8;

	/**
	 * The operation id for the '<em>Undo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_EDITOR___UNDO = 9;

	/**
	 * The operation id for the '<em>Redo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_EDITOR___REDO = 10;

	/**
	 * The operation id for the '<em>Relier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_EDITOR___RELIER__ELEMENTCIRCUIT_ELEMENTCIRCUIT = 11;

	/**
	 * The number of operations of the '<em>Circuit Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_EDITOR_OPERATION_COUNT = 12;

	/**
	 * The feature id for the '<em><b>Emplacement X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CIRCUIT__EMPLACEMENT_X = 0;

	/**
	 * The feature id for the '<em><b>Emplacement Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CIRCUIT__EMPLACEMENT_Y = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CIRCUIT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CIRCUIT__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Source Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CIRCUIT__SOURCE_MAX = 4;

	/**
	 * The feature id for the '<em><b>Cible Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CIRCUIT__CIBLE_MAX = 5;

	/**
	 * The feature id for the '<em><b>Est Circuit Valide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CIRCUIT__EST_CIRCUIT_VALIDE = 6;

	/**
	 * The feature id for the '<em><b>Est Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CIRCUIT__EST_MODIFIER = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CIRCUIT__TYPE = 8;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CIRCUIT__ENTREE = 9;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CIRCUIT__SORTIE = 10;

	/**
	 * The number of structural features of the '<em>Element Circuit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CIRCUIT_FEATURE_COUNT = 11;

	/**
	 * The operation id for the '<em>Valider</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CIRCUIT___VALIDER = 0;

	/**
	 * The operation id for the '<em>Get Liaisons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CIRCUIT___GET_LIAISONS = 1;

	/**
	 * The number of operations of the '<em>Element Circuit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_CIRCUIT_OPERATION_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Emplacement X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TABLE_VERITE__EMPLACEMENT_X = ELEMENT_CIRCUIT__EMPLACEMENT_X;

	/**
	 * The feature id for the '<em><b>Emplacement Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TABLE_VERITE__EMPLACEMENT_Y = ELEMENT_CIRCUIT__EMPLACEMENT_Y;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TABLE_VERITE__NAME = ELEMENT_CIRCUIT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TABLE_VERITE__DESCRIPTION = ELEMENT_CIRCUIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Source Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TABLE_VERITE__SOURCE_MAX = ELEMENT_CIRCUIT__SOURCE_MAX;

	/**
	 * The feature id for the '<em><b>Cible Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TABLE_VERITE__CIBLE_MAX = ELEMENT_CIRCUIT__CIBLE_MAX;

	/**
	 * The feature id for the '<em><b>Est Circuit Valide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TABLE_VERITE__EST_CIRCUIT_VALIDE = ELEMENT_CIRCUIT__EST_CIRCUIT_VALIDE;

	/**
	 * The feature id for the '<em><b>Est Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TABLE_VERITE__EST_MODIFIER = ELEMENT_CIRCUIT__EST_MODIFIER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TABLE_VERITE__TYPE = ELEMENT_CIRCUIT__TYPE;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TABLE_VERITE__ENTREE = ELEMENT_CIRCUIT__ENTREE;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TABLE_VERITE__SORTIE = ELEMENT_CIRCUIT__SORTIE;

	/**
	 * The feature id for the '<em><b>Table Verite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TABLE_VERITE__TABLE_VERITE = ELEMENT_CIRCUIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Element Table Verite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TABLE_VERITE_FEATURE_COUNT = ELEMENT_CIRCUIT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Valider</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TABLE_VERITE___VALIDER = ELEMENT_CIRCUIT___VALIDER;

	/**
	 * The operation id for the '<em>Get Liaisons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TABLE_VERITE___GET_LIAISONS = ELEMENT_CIRCUIT___GET_LIAISONS;

	/**
	 * The operation id for the '<em>Evaluer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TABLE_VERITE___EVALUER = ELEMENT_CIRCUIT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Calcul Liste Entree Boolean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TABLE_VERITE___CALCUL_LISTE_ENTREE_BOOLEAN__INT_INT = ELEMENT_CIRCUIT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Element Table Verite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TABLE_VERITE_OPERATION_COUNT = ELEMENT_CIRCUIT_OPERATION_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Emplacement X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__EMPLACEMENT_X = ELEMENT_TABLE_VERITE__EMPLACEMENT_X;

	/**
	 * The feature id for the '<em><b>Emplacement Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__EMPLACEMENT_Y = ELEMENT_TABLE_VERITE__EMPLACEMENT_Y;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__NAME = ELEMENT_TABLE_VERITE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__DESCRIPTION = ELEMENT_TABLE_VERITE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Source Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__SOURCE_MAX = ELEMENT_TABLE_VERITE__SOURCE_MAX;

	/**
	 * The feature id for the '<em><b>Cible Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__CIBLE_MAX = ELEMENT_TABLE_VERITE__CIBLE_MAX;

	/**
	 * The feature id for the '<em><b>Est Circuit Valide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__EST_CIRCUIT_VALIDE = ELEMENT_TABLE_VERITE__EST_CIRCUIT_VALIDE;

	/**
	 * The feature id for the '<em><b>Est Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__EST_MODIFIER = ELEMENT_TABLE_VERITE__EST_MODIFIER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__TYPE = ELEMENT_TABLE_VERITE__TYPE;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__ENTREE = ELEMENT_TABLE_VERITE__ENTREE;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__SORTIE = ELEMENT_TABLE_VERITE__SORTIE;

	/**
	 * The feature id for the '<em><b>Table Verite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__TABLE_VERITE = ELEMENT_TABLE_VERITE__TABLE_VERITE;

	/**
	 * The feature id for the '<em><b>Fichier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__FICHIER = ELEMENT_TABLE_VERITE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Circuit Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__CIRCUIT_ELEMENTS = ELEMENT_TABLE_VERITE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Porte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__MAX_PORTE = ELEMENT_TABLE_VERITE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tabledeverite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__TABLEDEVERITE = ELEMENT_TABLE_VERITE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Historique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__HISTORIQUE = ELEMENT_TABLE_VERITE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Max Entree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__MAX_ENTREE = ELEMENT_TABLE_VERITE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Max Sortie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__MAX_SORTIE = ELEMENT_TABLE_VERITE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Circuit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_FEATURE_COUNT = ELEMENT_TABLE_VERITE_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Get Liaisons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT___GET_LIAISONS = ELEMENT_TABLE_VERITE___GET_LIAISONS;

	/**
	 * The operation id for the '<em>Evaluer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT___EVALUER = ELEMENT_TABLE_VERITE___EVALUER;

	/**
	 * The operation id for the '<em>Calcul Liste Entree Boolean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT___CALCUL_LISTE_ENTREE_BOOLEAN__INT_INT = ELEMENT_TABLE_VERITE___CALCUL_LISTE_ENTREE_BOOLEAN__INT_INT;

	/**
	 * The operation id for the '<em>Ajouter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT___AJOUTER__ELEMENTCIRCUIT = ELEMENT_TABLE_VERITE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Relier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT___RELIER__ELEMENTCIRCUIT_ELEMENTCIRCUIT = ELEMENT_TABLE_VERITE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Enlever</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT___ENLEVER__ELEMENTCIRCUIT = ELEMENT_TABLE_VERITE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Valider</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT___VALIDER = ELEMENT_TABLE_VERITE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT___GET_ELEMENT__STRING = ELEMENT_TABLE_VERITE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT___COUNT__ELEMENTTYPE = ELEMENT_TABLE_VERITE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Max</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT___GET_MAX__ELEMENTTYPE = ELEMENT_TABLE_VERITE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Supprimer Liaison</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT___SUPPRIMER_LIAISON__ELEMENTCIRCUIT_ELEMENTCIRCUIT = ELEMENT_TABLE_VERITE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Deplacer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT___DEPLACER__ELEMENTCIRCUIT_INT_INT = ELEMENT_TABLE_VERITE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Delier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT___DELIER__ELEMENTCIRCUIT_ELEMENTCIRCUIT = ELEMENT_TABLE_VERITE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Calculer Liste Sortie</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT___CALCULER_LISTE_SORTIE__ELIST_ELIST = ELEMENT_TABLE_VERITE_OPERATION_COUNT + 10;

	/**
	 * The number of operations of the '<em>Circuit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_OPERATION_COUNT = ELEMENT_TABLE_VERITE_OPERATION_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Emplacement X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE__EMPLACEMENT_X = ELEMENT_TABLE_VERITE__EMPLACEMENT_X;

	/**
	 * The feature id for the '<em><b>Emplacement Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE__EMPLACEMENT_Y = ELEMENT_TABLE_VERITE__EMPLACEMENT_Y;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE__NAME = ELEMENT_TABLE_VERITE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE__DESCRIPTION = ELEMENT_TABLE_VERITE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Source Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE__SOURCE_MAX = ELEMENT_TABLE_VERITE__SOURCE_MAX;

	/**
	 * The feature id for the '<em><b>Cible Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE__CIBLE_MAX = ELEMENT_TABLE_VERITE__CIBLE_MAX;

	/**
	 * The feature id for the '<em><b>Est Circuit Valide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE__EST_CIRCUIT_VALIDE = ELEMENT_TABLE_VERITE__EST_CIRCUIT_VALIDE;

	/**
	 * The feature id for the '<em><b>Est Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE__EST_MODIFIER = ELEMENT_TABLE_VERITE__EST_MODIFIER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE__TYPE = ELEMENT_TABLE_VERITE__TYPE;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE__ENTREE = ELEMENT_TABLE_VERITE__ENTREE;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE__SORTIE = ELEMENT_TABLE_VERITE__SORTIE;

	/**
	 * The feature id for the '<em><b>Table Verite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE__TABLE_VERITE = ELEMENT_TABLE_VERITE__TABLE_VERITE;

	/**
	 * The number of structural features of the '<em>Porte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_FEATURE_COUNT = ELEMENT_TABLE_VERITE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Valider</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE___VALIDER = ELEMENT_TABLE_VERITE___VALIDER;

	/**
	 * The operation id for the '<em>Get Liaisons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE___GET_LIAISONS = ELEMENT_TABLE_VERITE___GET_LIAISONS;

	/**
	 * The operation id for the '<em>Evaluer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE___EVALUER = ELEMENT_TABLE_VERITE___EVALUER;

	/**
	 * The operation id for the '<em>Calcul Liste Entree Boolean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE___CALCUL_LISTE_ENTREE_BOOLEAN__INT_INT = ELEMENT_TABLE_VERITE___CALCUL_LISTE_ENTREE_BOOLEAN__INT_INT;

	/**
	 * The number of operations of the '<em>Porte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_OPERATION_COUNT = ELEMENT_TABLE_VERITE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Emplacement X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_STANDARD__EMPLACEMENT_X = PORTE__EMPLACEMENT_X;

	/**
	 * The feature id for the '<em><b>Emplacement Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_STANDARD__EMPLACEMENT_Y = PORTE__EMPLACEMENT_Y;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_STANDARD__NAME = PORTE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_STANDARD__DESCRIPTION = PORTE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Source Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_STANDARD__SOURCE_MAX = PORTE__SOURCE_MAX;

	/**
	 * The feature id for the '<em><b>Cible Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_STANDARD__CIBLE_MAX = PORTE__CIBLE_MAX;

	/**
	 * The feature id for the '<em><b>Est Circuit Valide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_STANDARD__EST_CIRCUIT_VALIDE = PORTE__EST_CIRCUIT_VALIDE;

	/**
	 * The feature id for the '<em><b>Est Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_STANDARD__EST_MODIFIER = PORTE__EST_MODIFIER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_STANDARD__TYPE = PORTE__TYPE;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_STANDARD__ENTREE = PORTE__ENTREE;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_STANDARD__SORTIE = PORTE__SORTIE;

	/**
	 * The feature id for the '<em><b>Table Verite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_STANDARD__TABLE_VERITE = PORTE__TABLE_VERITE;

	/**
	 * The feature id for the '<em><b>Type Porte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_STANDARD__TYPE_PORTE = PORTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Porte Standard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_STANDARD_FEATURE_COUNT = PORTE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Valider</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_STANDARD___VALIDER = PORTE___VALIDER;

	/**
	 * The operation id for the '<em>Get Liaisons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_STANDARD___GET_LIAISONS = PORTE___GET_LIAISONS;

	/**
	 * The operation id for the '<em>Evaluer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_STANDARD___EVALUER = PORTE___EVALUER;

	/**
	 * The operation id for the '<em>Calcul Liste Entree Boolean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_STANDARD___CALCUL_LISTE_ENTREE_BOOLEAN__INT_INT = PORTE___CALCUL_LISTE_ENTREE_BOOLEAN__INT_INT;

	/**
	 * The number of operations of the '<em>Porte Standard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_STANDARD_OPERATION_COUNT = PORTE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Emplacement X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_PERSONALISE__EMPLACEMENT_X = PORTE__EMPLACEMENT_X;

	/**
	 * The feature id for the '<em><b>Emplacement Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_PERSONALISE__EMPLACEMENT_Y = PORTE__EMPLACEMENT_Y;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_PERSONALISE__NAME = PORTE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_PERSONALISE__DESCRIPTION = PORTE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Source Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_PERSONALISE__SOURCE_MAX = PORTE__SOURCE_MAX;

	/**
	 * The feature id for the '<em><b>Cible Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_PERSONALISE__CIBLE_MAX = PORTE__CIBLE_MAX;

	/**
	 * The feature id for the '<em><b>Est Circuit Valide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_PERSONALISE__EST_CIRCUIT_VALIDE = PORTE__EST_CIRCUIT_VALIDE;

	/**
	 * The feature id for the '<em><b>Est Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_PERSONALISE__EST_MODIFIER = PORTE__EST_MODIFIER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_PERSONALISE__TYPE = PORTE__TYPE;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_PERSONALISE__ENTREE = PORTE__ENTREE;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_PERSONALISE__SORTIE = PORTE__SORTIE;

	/**
	 * The feature id for the '<em><b>Table Verite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_PERSONALISE__TABLE_VERITE = PORTE__TABLE_VERITE;

	/**
	 * The feature id for the '<em><b>Circuit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_PERSONALISE__CIRCUIT = PORTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Porte Personalise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_PERSONALISE_FEATURE_COUNT = PORTE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Valider</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_PERSONALISE___VALIDER = PORTE___VALIDER;

	/**
	 * The operation id for the '<em>Get Liaisons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_PERSONALISE___GET_LIAISONS = PORTE___GET_LIAISONS;

	/**
	 * The operation id for the '<em>Evaluer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_PERSONALISE___EVALUER = PORTE___EVALUER;

	/**
	 * The operation id for the '<em>Calcul Liste Entree Boolean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_PERSONALISE___CALCUL_LISTE_ENTREE_BOOLEAN__INT_INT = PORTE___CALCUL_LISTE_ENTREE_BOOLEAN__INT_INT;

	/**
	 * The number of operations of the '<em>Porte Personalise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_PERSONALISE_OPERATION_COUNT = PORTE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Emplacement X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_ET__EMPLACEMENT_X = PORTE_STANDARD__EMPLACEMENT_X;

	/**
	 * The feature id for the '<em><b>Emplacement Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_ET__EMPLACEMENT_Y = PORTE_STANDARD__EMPLACEMENT_Y;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_ET__NAME = PORTE_STANDARD__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_ET__DESCRIPTION = PORTE_STANDARD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Source Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_ET__SOURCE_MAX = PORTE_STANDARD__SOURCE_MAX;

	/**
	 * The feature id for the '<em><b>Cible Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_ET__CIBLE_MAX = PORTE_STANDARD__CIBLE_MAX;

	/**
	 * The feature id for the '<em><b>Est Circuit Valide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_ET__EST_CIRCUIT_VALIDE = PORTE_STANDARD__EST_CIRCUIT_VALIDE;

	/**
	 * The feature id for the '<em><b>Est Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_ET__EST_MODIFIER = PORTE_STANDARD__EST_MODIFIER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_ET__TYPE = PORTE_STANDARD__TYPE;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_ET__ENTREE = PORTE_STANDARD__ENTREE;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_ET__SORTIE = PORTE_STANDARD__SORTIE;

	/**
	 * The feature id for the '<em><b>Table Verite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_ET__TABLE_VERITE = PORTE_STANDARD__TABLE_VERITE;

	/**
	 * The feature id for the '<em><b>Type Porte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_ET__TYPE_PORTE = PORTE_STANDARD__TYPE_PORTE;

	/**
	 * The number of structural features of the '<em>Porte ET</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_ET_FEATURE_COUNT = PORTE_STANDARD_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Valider</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_ET___VALIDER = PORTE_STANDARD___VALIDER;

	/**
	 * The operation id for the '<em>Get Liaisons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_ET___GET_LIAISONS = PORTE_STANDARD___GET_LIAISONS;

	/**
	 * The operation id for the '<em>Evaluer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_ET___EVALUER = PORTE_STANDARD___EVALUER;

	/**
	 * The operation id for the '<em>Calcul Liste Entree Boolean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_ET___CALCUL_LISTE_ENTREE_BOOLEAN__INT_INT = PORTE_STANDARD___CALCUL_LISTE_ENTREE_BOOLEAN__INT_INT;

	/**
	 * The number of operations of the '<em>Porte ET</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_ET_OPERATION_COUNT = PORTE_STANDARD_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Emplacement X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_OU__EMPLACEMENT_X = PORTE_STANDARD__EMPLACEMENT_X;

	/**
	 * The feature id for the '<em><b>Emplacement Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_OU__EMPLACEMENT_Y = PORTE_STANDARD__EMPLACEMENT_Y;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_OU__NAME = PORTE_STANDARD__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_OU__DESCRIPTION = PORTE_STANDARD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Source Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_OU__SOURCE_MAX = PORTE_STANDARD__SOURCE_MAX;

	/**
	 * The feature id for the '<em><b>Cible Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_OU__CIBLE_MAX = PORTE_STANDARD__CIBLE_MAX;

	/**
	 * The feature id for the '<em><b>Est Circuit Valide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_OU__EST_CIRCUIT_VALIDE = PORTE_STANDARD__EST_CIRCUIT_VALIDE;

	/**
	 * The feature id for the '<em><b>Est Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_OU__EST_MODIFIER = PORTE_STANDARD__EST_MODIFIER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_OU__TYPE = PORTE_STANDARD__TYPE;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_OU__ENTREE = PORTE_STANDARD__ENTREE;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_OU__SORTIE = PORTE_STANDARD__SORTIE;

	/**
	 * The feature id for the '<em><b>Table Verite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_OU__TABLE_VERITE = PORTE_STANDARD__TABLE_VERITE;

	/**
	 * The feature id for the '<em><b>Type Porte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_OU__TYPE_PORTE = PORTE_STANDARD__TYPE_PORTE;

	/**
	 * The number of structural features of the '<em>Porte OU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_OU_FEATURE_COUNT = PORTE_STANDARD_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Valider</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_OU___VALIDER = PORTE_STANDARD___VALIDER;

	/**
	 * The operation id for the '<em>Get Liaisons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_OU___GET_LIAISONS = PORTE_STANDARD___GET_LIAISONS;

	/**
	 * The operation id for the '<em>Evaluer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_OU___EVALUER = PORTE_STANDARD___EVALUER;

	/**
	 * The operation id for the '<em>Calcul Liste Entree Boolean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_OU___CALCUL_LISTE_ENTREE_BOOLEAN__INT_INT = PORTE_STANDARD___CALCUL_LISTE_ENTREE_BOOLEAN__INT_INT;

	/**
	 * The number of operations of the '<em>Porte OU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_OU_OPERATION_COUNT = PORTE_STANDARD_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Emplacement X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE__EMPLACEMENT_X = ELEMENT_TABLE_VERITE__EMPLACEMENT_X;

	/**
	 * The feature id for the '<em><b>Emplacement Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE__EMPLACEMENT_Y = ELEMENT_TABLE_VERITE__EMPLACEMENT_Y;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE__NAME = ELEMENT_TABLE_VERITE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE__DESCRIPTION = ELEMENT_TABLE_VERITE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Source Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE__SOURCE_MAX = ELEMENT_TABLE_VERITE__SOURCE_MAX;

	/**
	 * The feature id for the '<em><b>Cible Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE__CIBLE_MAX = ELEMENT_TABLE_VERITE__CIBLE_MAX;

	/**
	 * The feature id for the '<em><b>Est Circuit Valide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE__EST_CIRCUIT_VALIDE = ELEMENT_TABLE_VERITE__EST_CIRCUIT_VALIDE;

	/**
	 * The feature id for the '<em><b>Est Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE__EST_MODIFIER = ELEMENT_TABLE_VERITE__EST_MODIFIER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE__TYPE = ELEMENT_TABLE_VERITE__TYPE;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE__ENTREE = ELEMENT_TABLE_VERITE__ENTREE;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE__SORTIE = ELEMENT_TABLE_VERITE__SORTIE;

	/**
	 * The feature id for the '<em><b>Table Verite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE__TABLE_VERITE = ELEMENT_TABLE_VERITE__TABLE_VERITE;

	/**
	 * The number of structural features of the '<em>Entree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE_FEATURE_COUNT = ELEMENT_TABLE_VERITE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Valider</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE___VALIDER = ELEMENT_TABLE_VERITE___VALIDER;

	/**
	 * The operation id for the '<em>Get Liaisons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE___GET_LIAISONS = ELEMENT_TABLE_VERITE___GET_LIAISONS;

	/**
	 * The operation id for the '<em>Evaluer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE___EVALUER = ELEMENT_TABLE_VERITE___EVALUER;

	/**
	 * The operation id for the '<em>Calcul Liste Entree Boolean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE___CALCUL_LISTE_ENTREE_BOOLEAN__INT_INT = ELEMENT_TABLE_VERITE___CALCUL_LISTE_ENTREE_BOOLEAN__INT_INT;

	/**
	 * The number of operations of the '<em>Entree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE_OPERATION_COUNT = ELEMENT_TABLE_VERITE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Emplacement X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE__EMPLACEMENT_X = ELEMENT_CIRCUIT__EMPLACEMENT_X;

	/**
	 * The feature id for the '<em><b>Emplacement Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE__EMPLACEMENT_Y = ELEMENT_CIRCUIT__EMPLACEMENT_Y;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE__NAME = ELEMENT_CIRCUIT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE__DESCRIPTION = ELEMENT_CIRCUIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Source Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE__SOURCE_MAX = ELEMENT_CIRCUIT__SOURCE_MAX;

	/**
	 * The feature id for the '<em><b>Cible Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE__CIBLE_MAX = ELEMENT_CIRCUIT__CIBLE_MAX;

	/**
	 * The feature id for the '<em><b>Est Circuit Valide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE__EST_CIRCUIT_VALIDE = ELEMENT_CIRCUIT__EST_CIRCUIT_VALIDE;

	/**
	 * The feature id for the '<em><b>Est Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE__EST_MODIFIER = ELEMENT_CIRCUIT__EST_MODIFIER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE__TYPE = ELEMENT_CIRCUIT__TYPE;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE__ENTREE = ELEMENT_CIRCUIT__ENTREE;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE__SORTIE = ELEMENT_CIRCUIT__SORTIE;

	/**
	 * The number of structural features of the '<em>Sortie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE_FEATURE_COUNT = ELEMENT_CIRCUIT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Valider</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE___VALIDER = ELEMENT_CIRCUIT___VALIDER;

	/**
	 * The operation id for the '<em>Get Liaisons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE___GET_LIAISONS = ELEMENT_CIRCUIT___GET_LIAISONS;

	/**
	 * The number of operations of the '<em>Sortie</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE_OPERATION_COUNT = ELEMENT_CIRCUIT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Possede</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_DE_VERITE__POSSEDE = 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_DE_VERITE__ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Table De Verite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_DE_VERITE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Calculer Table</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_DE_VERITE___CALCULER_TABLE = 0;

	/**
	 * The number of operations of the '<em>Table De Verite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_DE_VERITE_OPERATION_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Entrees</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGNE_TABLE_DE_VERITE__ENTREES = 0;

	/**
	 * The feature id for the '<em><b>Sorties</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGNE_TABLE_DE_VERITE__SORTIES = 1;

	/**
	 * The number of structural features of the '<em>Ligne Table De Verite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGNE_TABLE_DE_VERITE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ligne Table De Verite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGNE_TABLE_DE_VERITE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Action Curseur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTIONNAIRE_HISTORIQUE__ACTION_CURSEUR = 0;

	/**
	 * The feature id for the '<em><b>Circuit</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTIONNAIRE_HISTORIQUE__CIRCUIT = 1;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTIONNAIRE_HISTORIQUE__ACTIONS = 2;

	/**
	 * The number of structural features of the '<em>Gestionnaire Historique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTIONNAIRE_HISTORIQUE_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Enregistrer Action</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTIONNAIRE_HISTORIQUE___ENREGISTRER_ACTION__ACTION = 0;

	/**
	 * The operation id for the '<em>Undo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTIONNAIRE_HISTORIQUE___UNDO = 1;

	/**
	 * The operation id for the '<em>Redo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTIONNAIRE_HISTORIQUE___REDO = 2;

	/**
	 * The number of operations of the '<em>Gestionnaire Historique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESTIONNAIRE_HISTORIQUE_OPERATION_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Gestionnaire Historique</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__GESTIONNAIRE_HISTORIQUE = 1;

	/**
	 * The feature id for the '<em><b>Done</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__DONE = 2;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___EXECUTE = 0;

	/**
	 * The operation id for the '<em>Rollback</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___ROLLBACK = 1;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ELEMENT_CIRCUIT__TYPE = ACTION__TYPE;

	/**
	 * The feature id for the '<em><b>Gestionnaire Historique</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ELEMENT_CIRCUIT__GESTIONNAIRE_HISTORIQUE = ACTION__GESTIONNAIRE_HISTORIQUE;

	/**
	 * The feature id for the '<em><b>Done</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ELEMENT_CIRCUIT__DONE = ACTION__DONE;

	/**
	 * The feature id for the '<em><b>Liaisons Modifiees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ELEMENT_CIRCUIT__LIAISONS_MODIFIEES = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element Modifie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ELEMENT_CIRCUIT__ELEMENT_MODIFIE = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action Element Circuit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ELEMENT_CIRCUIT_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ELEMENT_CIRCUIT___EXECUTE = ACTION___EXECUTE;

	/**
	 * The operation id for the '<em>Rollback</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ELEMENT_CIRCUIT___ROLLBACK = ACTION___ROLLBACK;

	/**
	 * The number of operations of the '<em>Action Element Circuit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ELEMENT_CIRCUIT_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_LIAISON__TYPE = ACTION__TYPE;

	/**
	 * The feature id for the '<em><b>Gestionnaire Historique</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_LIAISON__GESTIONNAIRE_HISTORIQUE = ACTION__GESTIONNAIRE_HISTORIQUE;

	/**
	 * The feature id for the '<em><b>Done</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_LIAISON__DONE = ACTION__DONE;

	/**
	 * The feature id for the '<em><b>Cible</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_LIAISON__CIBLE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_LIAISON__SOURCE = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action Liaison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_LIAISON_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_LIAISON___EXECUTE = ACTION___EXECUTE;

	/**
	 * The operation id for the '<em>Rollback</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_LIAISON___ROLLBACK = ACTION___ROLLBACK;

	/**
	 * The number of operations of the '<em>Action Liaison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_LIAISON_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link circuiteditor.impl.PersistanceManagerImpl <em>Persistance Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circuiteditor.impl.PersistanceManagerImpl
	 * @see circuiteditor.impl.CircuiteditorPackageImpl#getPersistanceManager()
	 * @generated
	 */
	int PERSISTANCE_MANAGER = 17;

	/**
	 * The number of structural features of the '<em>Persistance Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTANCE_MANAGER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Sauvegarde XMI</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTANCE_MANAGER___SAUVEGARDE_XMI__CIRCUIT_STRING = 0;

	/**
	 * The operation id for the '<em>Sauvegarde JPG</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTANCE_MANAGER___SAUVEGARDE_JPG__BYTE_STRING = 1;

	/**
	 * The operation id for the '<em>Sauvegarde Table</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTANCE_MANAGER___SAUVEGARDE_TABLE__TABLEDEVERITE_STRING = 2;

	/**
	 * The number of operations of the '<em>Persistance Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTANCE_MANAGER_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link circuiteditor.impl.PorteNOTImpl <em>Porte NOT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circuiteditor.impl.PorteNOTImpl
	 * @see circuiteditor.impl.CircuiteditorPackageImpl#getPorteNOT()
	 * @generated
	 */
	int PORTE_NOT = 18;

	/**
	 * The feature id for the '<em><b>Emplacement X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_NOT__EMPLACEMENT_X = PORTE_STANDARD__EMPLACEMENT_X;

	/**
	 * The feature id for the '<em><b>Emplacement Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_NOT__EMPLACEMENT_Y = PORTE_STANDARD__EMPLACEMENT_Y;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_NOT__NAME = PORTE_STANDARD__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_NOT__DESCRIPTION = PORTE_STANDARD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Source Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_NOT__SOURCE_MAX = PORTE_STANDARD__SOURCE_MAX;

	/**
	 * The feature id for the '<em><b>Cible Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_NOT__CIBLE_MAX = PORTE_STANDARD__CIBLE_MAX;

	/**
	 * The feature id for the '<em><b>Est Circuit Valide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_NOT__EST_CIRCUIT_VALIDE = PORTE_STANDARD__EST_CIRCUIT_VALIDE;

	/**
	 * The feature id for the '<em><b>Est Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_NOT__EST_MODIFIER = PORTE_STANDARD__EST_MODIFIER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_NOT__TYPE = PORTE_STANDARD__TYPE;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_NOT__ENTREE = PORTE_STANDARD__ENTREE;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_NOT__SORTIE = PORTE_STANDARD__SORTIE;

	/**
	 * The feature id for the '<em><b>Table Verite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_NOT__TABLE_VERITE = PORTE_STANDARD__TABLE_VERITE;

	/**
	 * The feature id for the '<em><b>Type Porte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_NOT__TYPE_PORTE = PORTE_STANDARD__TYPE_PORTE;

	/**
	 * The number of structural features of the '<em>Porte NOT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_NOT_FEATURE_COUNT = PORTE_STANDARD_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Valider</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_NOT___VALIDER = PORTE_STANDARD___VALIDER;

	/**
	 * The operation id for the '<em>Get Liaisons</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_NOT___GET_LIAISONS = PORTE_STANDARD___GET_LIAISONS;

	/**
	 * The operation id for the '<em>Evaluer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_NOT___EVALUER = PORTE_STANDARD___EVALUER;

	/**
	 * The operation id for the '<em>Calcul Liste Entree Boolean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_NOT___CALCUL_LISTE_ENTREE_BOOLEAN__INT_INT = PORTE_STANDARD___CALCUL_LISTE_ENTREE_BOOLEAN__INT_INT;

	/**
	 * The number of operations of the '<em>Porte NOT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_NOT_OPERATION_COUNT = PORTE_STANDARD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link circuiteditor.impl.ActionDeplacerElementImpl <em>Action Deplacer Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circuiteditor.impl.ActionDeplacerElementImpl
	 * @see circuiteditor.impl.CircuiteditorPackageImpl#getActionDeplacerElement()
	 * @generated
	 */
	int ACTION_DEPLACER_ELEMENT = 19;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DEPLACER_ELEMENT__TYPE = ACTION_ELEMENT_CIRCUIT__TYPE;

	/**
	 * The feature id for the '<em><b>Gestionnaire Historique</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DEPLACER_ELEMENT__GESTIONNAIRE_HISTORIQUE = ACTION_ELEMENT_CIRCUIT__GESTIONNAIRE_HISTORIQUE;

	/**
	 * The feature id for the '<em><b>Done</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DEPLACER_ELEMENT__DONE = ACTION_ELEMENT_CIRCUIT__DONE;

	/**
	 * The feature id for the '<em><b>Liaisons Modifiees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DEPLACER_ELEMENT__LIAISONS_MODIFIEES = ACTION_ELEMENT_CIRCUIT__LIAISONS_MODIFIEES;

	/**
	 * The feature id for the '<em><b>Element Modifie</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DEPLACER_ELEMENT__ELEMENT_MODIFIE = ACTION_ELEMENT_CIRCUIT__ELEMENT_MODIFIE;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DEPLACER_ELEMENT__X = ACTION_ELEMENT_CIRCUIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DEPLACER_ELEMENT__Y = ACTION_ELEMENT_CIRCUIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action Deplacer Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DEPLACER_ELEMENT_FEATURE_COUNT = ACTION_ELEMENT_CIRCUIT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DEPLACER_ELEMENT___EXECUTE = ACTION_ELEMENT_CIRCUIT___EXECUTE;

	/**
	 * The operation id for the '<em>Rollback</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DEPLACER_ELEMENT___ROLLBACK = ACTION_ELEMENT_CIRCUIT___ROLLBACK;

	/**
	 * The number of operations of the '<em>Action Deplacer Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DEPLACER_ELEMENT_OPERATION_COUNT = ACTION_ELEMENT_CIRCUIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link circuiteditor.TypeAction <em>Type Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circuiteditor.TypeAction
	 * @see circuiteditor.impl.CircuiteditorPackageImpl#getTypeAction()
	 * @generated
	 */
	int TYPE_ACTION = 20;

	/**
	 * The meta object id for the '{@link circuiteditor.TypePorteStandard <em>Type Porte Standard</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circuiteditor.TypePorteStandard
	 * @see circuiteditor.impl.CircuiteditorPackageImpl#getTypePorteStandard()
	 * @generated
	 */
	int TYPE_PORTE_STANDARD = 21;

	/**
	 * The meta object id for the '{@link circuiteditor.ElementType <em>Element Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see circuiteditor.ElementType
	 * @see circuiteditor.impl.CircuiteditorPackageImpl#getElementType()
	 * @generated
	 */
	int ELEMENT_TYPE = 22;


	/**
	 * Returns the meta object for class '{@link circuiteditor.Circuit <em>Circuit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circuit</em>'.
	 * @see circuiteditor.Circuit
	 * @generated
	 */
	EClass getCircuit();

	/**
	 * Returns the meta object for the attribute '{@link circuiteditor.Circuit#getFichier <em>Fichier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fichier</em>'.
	 * @see circuiteditor.Circuit#getFichier()
	 * @see #getCircuit()
	 * @generated
	 */
	EAttribute getCircuit_Fichier();

	/**
	 * Returns the meta object for the containment reference list '{@link circuiteditor.Circuit#getCircuitElements <em>Circuit Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Circuit Elements</em>'.
	 * @see circuiteditor.Circuit#getCircuitElements()
	 * @see #getCircuit()
	 * @generated
	 */
	EReference getCircuit_CircuitElements();

	/**
	 * Returns the meta object for the attribute '{@link circuiteditor.Circuit#getMaxPorte <em>Max Porte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Porte</em>'.
	 * @see circuiteditor.Circuit#getMaxPorte()
	 * @see #getCircuit()
	 * @generated
	 */
	EAttribute getCircuit_MaxPorte();

	/**
	 * Returns the meta object for the reference '{@link circuiteditor.Circuit#getTabledeverite <em>Tabledeverite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tabledeverite</em>'.
	 * @see circuiteditor.Circuit#getTabledeverite()
	 * @see #getCircuit()
	 * @generated
	 */
	EReference getCircuit_Tabledeverite();

	/**
	 * Returns the meta object for the containment reference '{@link circuiteditor.Circuit#getHistorique <em>Historique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Historique</em>'.
	 * @see circuiteditor.Circuit#getHistorique()
	 * @see #getCircuit()
	 * @generated
	 */
	EReference getCircuit_Historique();

	/**
	 * Returns the meta object for the attribute '{@link circuiteditor.Circuit#getMaxEntree <em>Max Entree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Entree</em>'.
	 * @see circuiteditor.Circuit#getMaxEntree()
	 * @see #getCircuit()
	 * @generated
	 */
	EAttribute getCircuit_MaxEntree();

	/**
	 * Returns the meta object for the attribute '{@link circuiteditor.Circuit#getMaxSortie <em>Max Sortie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Sortie</em>'.
	 * @see circuiteditor.Circuit#getMaxSortie()
	 * @see #getCircuit()
	 * @generated
	 */
	EAttribute getCircuit_MaxSortie();

	/**
	 * Returns the meta object for the '{@link circuiteditor.Circuit#ajouter(circuiteditor.ElementCircuit) <em>Ajouter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ajouter</em>' operation.
	 * @see circuiteditor.Circuit#ajouter(circuiteditor.ElementCircuit)
	 * @generated
	 */
	EOperation getCircuit__Ajouter__ElementCircuit();

	/**
	 * Returns the meta object for the '{@link circuiteditor.Circuit#relier(circuiteditor.ElementCircuit, circuiteditor.ElementCircuit) <em>Relier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Relier</em>' operation.
	 * @see circuiteditor.Circuit#relier(circuiteditor.ElementCircuit, circuiteditor.ElementCircuit)
	 * @generated
	 */
	EOperation getCircuit__Relier__ElementCircuit_ElementCircuit();

	/**
	 * Returns the meta object for the '{@link circuiteditor.Circuit#enlever(circuiteditor.ElementCircuit) <em>Enlever</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Enlever</em>' operation.
	 * @see circuiteditor.Circuit#enlever(circuiteditor.ElementCircuit)
	 * @generated
	 */
	EOperation getCircuit__Enlever__ElementCircuit();

	/**
	 * Returns the meta object for the '{@link circuiteditor.Circuit#valider() <em>Valider</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Valider</em>' operation.
	 * @see circuiteditor.Circuit#valider()
	 * @generated
	 */
	EOperation getCircuit__Valider();

	/**
	 * Returns the meta object for the '{@link circuiteditor.Circuit#getElement(java.lang.String) <em>Get Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Element</em>' operation.
	 * @see circuiteditor.Circuit#getElement(java.lang.String)
	 * @generated
	 */
	EOperation getCircuit__GetElement__String();

	/**
	 * Returns the meta object for the '{@link circuiteditor.Circuit#count(circuiteditor.ElementType) <em>Count</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Count</em>' operation.
	 * @see circuiteditor.Circuit#count(circuiteditor.ElementType)
	 * @generated
	 */
	EOperation getCircuit__Count__ElementType();

	/**
	 * Returns the meta object for the '{@link circuiteditor.Circuit#getMax(circuiteditor.ElementType) <em>Get Max</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Max</em>' operation.
	 * @see circuiteditor.Circuit#getMax(circuiteditor.ElementType)
	 * @generated
	 */
	EOperation getCircuit__GetMax__ElementType();

	/**
	 * Returns the meta object for the '{@link circuiteditor.Circuit#supprimerLiaison(circuiteditor.ElementCircuit, circuiteditor.ElementCircuit) <em>Supprimer Liaison</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Supprimer Liaison</em>' operation.
	 * @see circuiteditor.Circuit#supprimerLiaison(circuiteditor.ElementCircuit, circuiteditor.ElementCircuit)
	 * @generated
	 */
	EOperation getCircuit__SupprimerLiaison__ElementCircuit_ElementCircuit();

	/**
	 * Returns the meta object for the '{@link circuiteditor.Circuit#deplacer(circuiteditor.ElementCircuit, int, int) <em>Deplacer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Deplacer</em>' operation.
	 * @see circuiteditor.Circuit#deplacer(circuiteditor.ElementCircuit, int, int)
	 * @generated
	 */
	EOperation getCircuit__Deplacer__ElementCircuit_int_int();

	/**
	 * Returns the meta object for the '{@link circuiteditor.Circuit#delier(circuiteditor.ElementCircuit, circuiteditor.ElementCircuit) <em>Delier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delier</em>' operation.
	 * @see circuiteditor.Circuit#delier(circuiteditor.ElementCircuit, circuiteditor.ElementCircuit)
	 * @generated
	 */
	EOperation getCircuit__Delier__ElementCircuit_ElementCircuit();

	/**
	 * Returns the meta object for the '{@link circuiteditor.Circuit#calculerListeSortie(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList) <em>Calculer Liste Sortie</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculer Liste Sortie</em>' operation.
	 * @see circuiteditor.Circuit#calculerListeSortie(org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getCircuit__CalculerListeSortie__EList_EList();

	/**
	 * Returns the meta object for class '{@link circuiteditor.Porte <em>Porte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Porte</em>'.
	 * @see circuiteditor.Porte
	 * @generated
	 */
	EClass getPorte();

	/**
	 * Returns the meta object for class '{@link circuiteditor.ElementCircuit <em>Element Circuit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Circuit</em>'.
	 * @see circuiteditor.ElementCircuit
	 * @generated
	 */
	EClass getElementCircuit();

	/**
	 * Returns the meta object for the attribute '{@link circuiteditor.ElementCircuit#getEmplacementX <em>Emplacement X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emplacement X</em>'.
	 * @see circuiteditor.ElementCircuit#getEmplacementX()
	 * @see #getElementCircuit()
	 * @generated
	 */
	EAttribute getElementCircuit_EmplacementX();

	/**
	 * Returns the meta object for the attribute '{@link circuiteditor.ElementCircuit#getEmplacementY <em>Emplacement Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emplacement Y</em>'.
	 * @see circuiteditor.ElementCircuit#getEmplacementY()
	 * @see #getElementCircuit()
	 * @generated
	 */
	EAttribute getElementCircuit_EmplacementY();

	/**
	 * Returns the meta object for the attribute '{@link circuiteditor.ElementCircuit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see circuiteditor.ElementCircuit#getName()
	 * @see #getElementCircuit()
	 * @generated
	 */
	EAttribute getElementCircuit_Name();

	/**
	 * Returns the meta object for the attribute '{@link circuiteditor.ElementCircuit#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see circuiteditor.ElementCircuit#getDescription()
	 * @see #getElementCircuit()
	 * @generated
	 */
	EAttribute getElementCircuit_Description();

	/**
	 * Returns the meta object for the attribute '{@link circuiteditor.ElementCircuit#getSourceMax <em>Source Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Max</em>'.
	 * @see circuiteditor.ElementCircuit#getSourceMax()
	 * @see #getElementCircuit()
	 * @generated
	 */
	EAttribute getElementCircuit_SourceMax();

	/**
	 * Returns the meta object for the attribute '{@link circuiteditor.ElementCircuit#getCibleMax <em>Cible Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cible Max</em>'.
	 * @see circuiteditor.ElementCircuit#getCibleMax()
	 * @see #getElementCircuit()
	 * @generated
	 */
	EAttribute getElementCircuit_CibleMax();

	/**
	 * Returns the meta object for the attribute '{@link circuiteditor.ElementCircuit#isEstCircuitValide <em>Est Circuit Valide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Est Circuit Valide</em>'.
	 * @see circuiteditor.ElementCircuit#isEstCircuitValide()
	 * @see #getElementCircuit()
	 * @generated
	 */
	EAttribute getElementCircuit_EstCircuitValide();

	/**
	 * Returns the meta object for the attribute '{@link circuiteditor.ElementCircuit#isEstModifier <em>Est Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Est Modifier</em>'.
	 * @see circuiteditor.ElementCircuit#isEstModifier()
	 * @see #getElementCircuit()
	 * @generated
	 */
	EAttribute getElementCircuit_EstModifier();

	/**
	 * Returns the meta object for the attribute '{@link circuiteditor.ElementCircuit#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see circuiteditor.ElementCircuit#getType()
	 * @see #getElementCircuit()
	 * @generated
	 */
	EAttribute getElementCircuit_Type();

	/**
	 * Returns the meta object for the reference list '{@link circuiteditor.ElementCircuit#getEntree <em>Entree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entree</em>'.
	 * @see circuiteditor.ElementCircuit#getEntree()
	 * @see #getElementCircuit()
	 * @generated
	 */
	EReference getElementCircuit_Entree();

	/**
	 * Returns the meta object for the reference list '{@link circuiteditor.ElementCircuit#getSortie <em>Sortie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sortie</em>'.
	 * @see circuiteditor.ElementCircuit#getSortie()
	 * @see #getElementCircuit()
	 * @generated
	 */
	EReference getElementCircuit_Sortie();

	/**
	 * Returns the meta object for the '{@link circuiteditor.ElementCircuit#valider() <em>Valider</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Valider</em>' operation.
	 * @see circuiteditor.ElementCircuit#valider()
	 * @generated
	 */
	EOperation getElementCircuit__Valider();

	/**
	 * Returns the meta object for the '{@link circuiteditor.ElementCircuit#getLiaisons() <em>Get Liaisons</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Liaisons</em>' operation.
	 * @see circuiteditor.ElementCircuit#getLiaisons()
	 * @generated
	 */
	EOperation getElementCircuit__GetLiaisons();

	/**
	 * Returns the meta object for class '{@link circuiteditor.Entree <em>Entree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entree</em>'.
	 * @see circuiteditor.Entree
	 * @generated
	 */
	EClass getEntree();

	/**
	 * Returns the meta object for class '{@link circuiteditor.Sortie <em>Sortie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sortie</em>'.
	 * @see circuiteditor.Sortie
	 * @generated
	 */
	EClass getSortie();

	/**
	 * Returns the meta object for class '{@link circuiteditor.PorteStandard <em>Porte Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Porte Standard</em>'.
	 * @see circuiteditor.PorteStandard
	 * @generated
	 */
	EClass getPorteStandard();

	/**
	 * Returns the meta object for the attribute '{@link circuiteditor.PorteStandard#getTypePorte <em>Type Porte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Porte</em>'.
	 * @see circuiteditor.PorteStandard#getTypePorte()
	 * @see #getPorteStandard()
	 * @generated
	 */
	EAttribute getPorteStandard_TypePorte();

	/**
	 * Returns the meta object for class '{@link circuiteditor.PortePersonalise <em>Porte Personalise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Porte Personalise</em>'.
	 * @see circuiteditor.PortePersonalise
	 * @generated
	 */
	EClass getPortePersonalise();

	/**
	 * Returns the meta object for the reference '{@link circuiteditor.PortePersonalise#getCircuit <em>Circuit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Circuit</em>'.
	 * @see circuiteditor.PortePersonalise#getCircuit()
	 * @see #getPortePersonalise()
	 * @generated
	 */
	EReference getPortePersonalise_Circuit();

	/**
	 * Returns the meta object for class '{@link circuiteditor.PorteET <em>Porte ET</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Porte ET</em>'.
	 * @see circuiteditor.PorteET
	 * @generated
	 */
	EClass getPorteET();

	/**
	 * Returns the meta object for class '{@link circuiteditor.PorteOU <em>Porte OU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Porte OU</em>'.
	 * @see circuiteditor.PorteOU
	 * @generated
	 */
	EClass getPorteOU();

	/**
	 * Returns the meta object for class '{@link circuiteditor.TableDeVerite <em>Table De Verite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table De Verite</em>'.
	 * @see circuiteditor.TableDeVerite
	 * @generated
	 */
	EClass getTableDeVerite();

	/**
	 * Returns the meta object for the containment reference list '{@link circuiteditor.TableDeVerite#getPossede <em>Possede</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Possede</em>'.
	 * @see circuiteditor.TableDeVerite#getPossede()
	 * @see #getTableDeVerite()
	 * @generated
	 */
	EReference getTableDeVerite_Possede();

	/**
	 * Returns the meta object for the container reference '{@link circuiteditor.TableDeVerite#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Element</em>'.
	 * @see circuiteditor.TableDeVerite#getElement()
	 * @see #getTableDeVerite()
	 * @generated
	 */
	EReference getTableDeVerite_Element();

	/**
	 * Returns the meta object for the '{@link circuiteditor.TableDeVerite#calculerTable() <em>Calculer Table</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculer Table</em>' operation.
	 * @see circuiteditor.TableDeVerite#calculerTable()
	 * @generated
	 */
	EOperation getTableDeVerite__CalculerTable();

	/**
	 * Returns the meta object for class '{@link circuiteditor.LigneTableDeVerite <em>Ligne Table De Verite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ligne Table De Verite</em>'.
	 * @see circuiteditor.LigneTableDeVerite
	 * @generated
	 */
	EClass getLigneTableDeVerite();

	/**
	 * Returns the meta object for the attribute list '{@link circuiteditor.LigneTableDeVerite#getEntrees <em>Entrees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Entrees</em>'.
	 * @see circuiteditor.LigneTableDeVerite#getEntrees()
	 * @see #getLigneTableDeVerite()
	 * @generated
	 */
	EAttribute getLigneTableDeVerite_Entrees();

	/**
	 * Returns the meta object for the attribute list '{@link circuiteditor.LigneTableDeVerite#getSorties <em>Sorties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Sorties</em>'.
	 * @see circuiteditor.LigneTableDeVerite#getSorties()
	 * @see #getLigneTableDeVerite()
	 * @generated
	 */
	EAttribute getLigneTableDeVerite_Sorties();

	/**
	 * Returns the meta object for class '{@link circuiteditor.ElementTableVerite <em>Element Table Verite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Table Verite</em>'.
	 * @see circuiteditor.ElementTableVerite
	 * @generated
	 */
	EClass getElementTableVerite();

	/**
	 * Returns the meta object for the containment reference '{@link circuiteditor.ElementTableVerite#getTableVerite <em>Table Verite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table Verite</em>'.
	 * @see circuiteditor.ElementTableVerite#getTableVerite()
	 * @see #getElementTableVerite()
	 * @generated
	 */
	EReference getElementTableVerite_TableVerite();

	/**
	 * Returns the meta object for the '{@link circuiteditor.ElementTableVerite#evaluer() <em>Evaluer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluer</em>' operation.
	 * @see circuiteditor.ElementTableVerite#evaluer()
	 * @generated
	 */
	EOperation getElementTableVerite__Evaluer();

	/**
	 * Returns the meta object for the '{@link circuiteditor.ElementTableVerite#calculListeEntreeBoolean(int, int) <em>Calcul Liste Entree Boolean</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calcul Liste Entree Boolean</em>' operation.
	 * @see circuiteditor.ElementTableVerite#calculListeEntreeBoolean(int, int)
	 * @generated
	 */
	EOperation getElementTableVerite__CalculListeEntreeBoolean__int_int();

	/**
	 * Returns the meta object for class '{@link circuiteditor.GestionnaireHistorique <em>Gestionnaire Historique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gestionnaire Historique</em>'.
	 * @see circuiteditor.GestionnaireHistorique
	 * @generated
	 */
	EClass getGestionnaireHistorique();

	/**
	 * Returns the meta object for the attribute '{@link circuiteditor.GestionnaireHistorique#getActionCurseur <em>Action Curseur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Curseur</em>'.
	 * @see circuiteditor.GestionnaireHistorique#getActionCurseur()
	 * @see #getGestionnaireHistorique()
	 * @generated
	 */
	EAttribute getGestionnaireHistorique_ActionCurseur();

	/**
	 * Returns the meta object for the container reference '{@link circuiteditor.GestionnaireHistorique#getCircuit <em>Circuit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Circuit</em>'.
	 * @see circuiteditor.GestionnaireHistorique#getCircuit()
	 * @see #getGestionnaireHistorique()
	 * @generated
	 */
	EReference getGestionnaireHistorique_Circuit();

	/**
	 * Returns the meta object for the containment reference list '{@link circuiteditor.GestionnaireHistorique#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see circuiteditor.GestionnaireHistorique#getActions()
	 * @see #getGestionnaireHistorique()
	 * @generated
	 */
	EReference getGestionnaireHistorique_Actions();

	/**
	 * Returns the meta object for the '{@link circuiteditor.GestionnaireHistorique#enregistrerAction(circuiteditor.Action) <em>Enregistrer Action</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Enregistrer Action</em>' operation.
	 * @see circuiteditor.GestionnaireHistorique#enregistrerAction(circuiteditor.Action)
	 * @generated
	 */
	EOperation getGestionnaireHistorique__EnregistrerAction__Action();

	/**
	 * Returns the meta object for the '{@link circuiteditor.GestionnaireHistorique#undo() <em>Undo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Undo</em>' operation.
	 * @see circuiteditor.GestionnaireHistorique#undo()
	 * @generated
	 */
	EOperation getGestionnaireHistorique__Undo();

	/**
	 * Returns the meta object for the '{@link circuiteditor.GestionnaireHistorique#redo() <em>Redo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Redo</em>' operation.
	 * @see circuiteditor.GestionnaireHistorique#redo()
	 * @generated
	 */
	EOperation getGestionnaireHistorique__Redo();

	/**
	 * Returns the meta object for class '{@link circuiteditor.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see circuiteditor.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link circuiteditor.Action#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see circuiteditor.Action#getType()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Type();

	/**
	 * Returns the meta object for the container reference '{@link circuiteditor.Action#getGestionnaireHistorique <em>Gestionnaire Historique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Gestionnaire Historique</em>'.
	 * @see circuiteditor.Action#getGestionnaireHistorique()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_GestionnaireHistorique();

	/**
	 * Returns the meta object for the attribute '{@link circuiteditor.Action#isDone <em>Done</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Done</em>'.
	 * @see circuiteditor.Action#isDone()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Done();

	/**
	 * Returns the meta object for the '{@link circuiteditor.Action#execute() <em>Execute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see circuiteditor.Action#execute()
	 * @generated
	 */
	EOperation getAction__Execute();

	/**
	 * Returns the meta object for the '{@link circuiteditor.Action#rollback() <em>Rollback</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Rollback</em>' operation.
	 * @see circuiteditor.Action#rollback()
	 * @generated
	 */
	EOperation getAction__Rollback();

	/**
	 * Returns the meta object for class '{@link circuiteditor.ActionElementCircuit <em>Action Element Circuit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Element Circuit</em>'.
	 * @see circuiteditor.ActionElementCircuit
	 * @generated
	 */
	EClass getActionElementCircuit();

	/**
	 * Returns the meta object for the reference list '{@link circuiteditor.ActionElementCircuit#getLiaisonsModifiees <em>Liaisons Modifiees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Liaisons Modifiees</em>'.
	 * @see circuiteditor.ActionElementCircuit#getLiaisonsModifiees()
	 * @see #getActionElementCircuit()
	 * @generated
	 */
	EReference getActionElementCircuit_LiaisonsModifiees();

	/**
	 * Returns the meta object for the reference '{@link circuiteditor.ActionElementCircuit#getElementModifie <em>Element Modifie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element Modifie</em>'.
	 * @see circuiteditor.ActionElementCircuit#getElementModifie()
	 * @see #getActionElementCircuit()
	 * @generated
	 */
	EReference getActionElementCircuit_ElementModifie();

	/**
	 * Returns the meta object for class '{@link circuiteditor.ActionLiaison <em>Action Liaison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Liaison</em>'.
	 * @see circuiteditor.ActionLiaison
	 * @generated
	 */
	EClass getActionLiaison();

	/**
	 * Returns the meta object for the reference '{@link circuiteditor.ActionLiaison#getCible <em>Cible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cible</em>'.
	 * @see circuiteditor.ActionLiaison#getCible()
	 * @see #getActionLiaison()
	 * @generated
	 */
	EReference getActionLiaison_Cible();

	/**
	 * Returns the meta object for the reference '{@link circuiteditor.ActionLiaison#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see circuiteditor.ActionLiaison#getSource()
	 * @see #getActionLiaison()
	 * @generated
	 */
	EReference getActionLiaison_Source();

	/**
	 * Returns the meta object for class '{@link circuiteditor.CircuitEditor <em>Circuit Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circuit Editor</em>'.
	 * @see circuiteditor.CircuitEditor
	 * @generated
	 */
	EClass getCircuitEditor();

	/**
	 * Returns the meta object for the containment reference '{@link circuiteditor.CircuitEditor#getMainCircuit <em>Main Circuit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Main Circuit</em>'.
	 * @see circuiteditor.CircuitEditor#getMainCircuit()
	 * @see #getCircuitEditor()
	 * @generated
	 */
	EReference getCircuitEditor_MainCircuit();

	/**
	 * Returns the meta object for the reference '{@link circuiteditor.CircuitEditor#getPersistanceManager <em>Persistance Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Persistance Manager</em>'.
	 * @see circuiteditor.CircuitEditor#getPersistanceManager()
	 * @see #getCircuitEditor()
	 * @generated
	 */
	EReference getCircuitEditor_PersistanceManager();

	/**
	 * Returns the meta object for the '{@link circuiteditor.CircuitEditor#sauvegarder(java.lang.String) <em>Sauvegarder</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sauvegarder</em>' operation.
	 * @see circuiteditor.CircuitEditor#sauvegarder(java.lang.String)
	 * @generated
	 */
	EOperation getCircuitEditor__Sauvegarder__String();

	/**
	 * Returns the meta object for the '{@link circuiteditor.CircuitEditor#ajouter(circuiteditor.ElementType) <em>Ajouter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ajouter</em>' operation.
	 * @see circuiteditor.CircuitEditor#ajouter(circuiteditor.ElementType)
	 * @generated
	 */
	EOperation getCircuitEditor__Ajouter__ElementType();

	/**
	 * Returns the meta object for the '{@link circuiteditor.CircuitEditor#enlever(java.lang.String) <em>Enlever</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Enlever</em>' operation.
	 * @see circuiteditor.CircuitEditor#enlever(java.lang.String)
	 * @generated
	 */
	EOperation getCircuitEditor__Enlever__String();

	/**
	 * Returns the meta object for the '{@link circuiteditor.CircuitEditor#nouveau() <em>Nouveau</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Nouveau</em>' operation.
	 * @see circuiteditor.CircuitEditor#nouveau()
	 * @generated
	 */
	EOperation getCircuitEditor__Nouveau();

	/**
	 * Returns the meta object for the '{@link circuiteditor.CircuitEditor#ouvrir(java.lang.String) <em>Ouvrir</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ouvrir</em>' operation.
	 * @see circuiteditor.CircuitEditor#ouvrir(java.lang.String)
	 * @generated
	 */
	EOperation getCircuitEditor__Ouvrir__String();

	/**
	 * Returns the meta object for the '{@link circuiteditor.CircuitEditor#delier(circuiteditor.ElementCircuit, circuiteditor.ElementCircuit) <em>Delier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delier</em>' operation.
	 * @see circuiteditor.CircuitEditor#delier(circuiteditor.ElementCircuit, circuiteditor.ElementCircuit)
	 * @generated
	 */
	EOperation getCircuitEditor__Delier__ElementCircuit_ElementCircuit();

	/**
	 * Returns the meta object for the '{@link circuiteditor.CircuitEditor#deplacer(circuiteditor.ElementCircuit, int, int) <em>Deplacer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Deplacer</em>' operation.
	 * @see circuiteditor.CircuitEditor#deplacer(circuiteditor.ElementCircuit, int, int)
	 * @generated
	 */
	EOperation getCircuitEditor__Deplacer__ElementCircuit_int_int();

	/**
	 * Returns the meta object for the '{@link circuiteditor.CircuitEditor#exporterTable(java.lang.String) <em>Exporter Table</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Exporter Table</em>' operation.
	 * @see circuiteditor.CircuitEditor#exporterTable(java.lang.String)
	 * @generated
	 */
	EOperation getCircuitEditor__ExporterTable__String();

	/**
	 * Returns the meta object for the '{@link circuiteditor.CircuitEditor#exporterCircuit(java.lang.String, byte[]) <em>Exporter Circuit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Exporter Circuit</em>' operation.
	 * @see circuiteditor.CircuitEditor#exporterCircuit(java.lang.String, byte[])
	 * @generated
	 */
	EOperation getCircuitEditor__ExporterCircuit__String_byte();

	/**
	 * Returns the meta object for the '{@link circuiteditor.CircuitEditor#undo() <em>Undo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Undo</em>' operation.
	 * @see circuiteditor.CircuitEditor#undo()
	 * @generated
	 */
	EOperation getCircuitEditor__Undo();

	/**
	 * Returns the meta object for the '{@link circuiteditor.CircuitEditor#redo() <em>Redo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Redo</em>' operation.
	 * @see circuiteditor.CircuitEditor#redo()
	 * @generated
	 */
	EOperation getCircuitEditor__Redo();

	/**
	 * Returns the meta object for the '{@link circuiteditor.CircuitEditor#relier(circuiteditor.ElementCircuit, circuiteditor.ElementCircuit) <em>Relier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Relier</em>' operation.
	 * @see circuiteditor.CircuitEditor#relier(circuiteditor.ElementCircuit, circuiteditor.ElementCircuit)
	 * @generated
	 */
	EOperation getCircuitEditor__Relier__ElementCircuit_ElementCircuit();

	/**
	 * Returns the meta object for class '{@link circuiteditor.PersistanceManager <em>Persistance Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persistance Manager</em>'.
	 * @see circuiteditor.PersistanceManager
	 * @generated
	 */
	EClass getPersistanceManager();

	/**
	 * Returns the meta object for the '{@link circuiteditor.PersistanceManager#sauvegardeXMI(circuiteditor.Circuit, java.lang.String) <em>Sauvegarde XMI</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sauvegarde XMI</em>' operation.
	 * @see circuiteditor.PersistanceManager#sauvegardeXMI(circuiteditor.Circuit, java.lang.String)
	 * @generated
	 */
	EOperation getPersistanceManager__SauvegardeXMI__Circuit_String();

	/**
	 * Returns the meta object for the '{@link circuiteditor.PersistanceManager#sauvegardeJPG(byte[], java.lang.String) <em>Sauvegarde JPG</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sauvegarde JPG</em>' operation.
	 * @see circuiteditor.PersistanceManager#sauvegardeJPG(byte[], java.lang.String)
	 * @generated
	 */
	EOperation getPersistanceManager__SauvegardeJPG__byte_String();

	/**
	 * Returns the meta object for the '{@link circuiteditor.PersistanceManager#sauvegardeTable(circuiteditor.TableDeVerite, java.lang.String) <em>Sauvegarde Table</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sauvegarde Table</em>' operation.
	 * @see circuiteditor.PersistanceManager#sauvegardeTable(circuiteditor.TableDeVerite, java.lang.String)
	 * @generated
	 */
	EOperation getPersistanceManager__SauvegardeTable__TableDeVerite_String();

	/**
	 * Returns the meta object for class '{@link circuiteditor.PorteNOT <em>Porte NOT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Porte NOT</em>'.
	 * @see circuiteditor.PorteNOT
	 * @generated
	 */
	EClass getPorteNOT();

	/**
	 * Returns the meta object for class '{@link circuiteditor.ActionDeplacerElement <em>Action Deplacer Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Deplacer Element</em>'.
	 * @see circuiteditor.ActionDeplacerElement
	 * @generated
	 */
	EClass getActionDeplacerElement();

	/**
	 * Returns the meta object for the attribute '{@link circuiteditor.ActionDeplacerElement#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see circuiteditor.ActionDeplacerElement#getX()
	 * @see #getActionDeplacerElement()
	 * @generated
	 */
	EAttribute getActionDeplacerElement_X();

	/**
	 * Returns the meta object for the attribute '{@link circuiteditor.ActionDeplacerElement#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see circuiteditor.ActionDeplacerElement#getY()
	 * @see #getActionDeplacerElement()
	 * @generated
	 */
	EAttribute getActionDeplacerElement_Y();

	/**
	 * Returns the meta object for enum '{@link circuiteditor.TypeAction <em>Type Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Action</em>'.
	 * @see circuiteditor.TypeAction
	 * @generated
	 */
	EEnum getTypeAction();

	/**
	 * Returns the meta object for enum '{@link circuiteditor.TypePorteStandard <em>Type Porte Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Porte Standard</em>'.
	 * @see circuiteditor.TypePorteStandard
	 * @generated
	 */
	EEnum getTypePorteStandard();

	/**
	 * Returns the meta object for enum '{@link circuiteditor.ElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Element Type</em>'.
	 * @see circuiteditor.ElementType
	 * @generated
	 */
	EEnum getElementType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CircuiteditorFactory getCircuiteditorFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link circuiteditor.impl.CircuitImpl <em>Circuit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circuiteditor.impl.CircuitImpl
		 * @see circuiteditor.impl.CircuiteditorPackageImpl#getCircuit()
		 * @generated
		 */
		EClass CIRCUIT = eINSTANCE.getCircuit();

		/**
		 * The meta object literal for the '<em><b>Fichier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCUIT__FICHIER = eINSTANCE.getCircuit_Fichier();

		/**
		 * The meta object literal for the '<em><b>Circuit Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIRCUIT__CIRCUIT_ELEMENTS = eINSTANCE.getCircuit_CircuitElements();

		/**
		 * The meta object literal for the '<em><b>Max Porte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCUIT__MAX_PORTE = eINSTANCE.getCircuit_MaxPorte();

		/**
		 * The meta object literal for the '<em><b>Tabledeverite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIRCUIT__TABLEDEVERITE = eINSTANCE.getCircuit_Tabledeverite();

		/**
		 * The meta object literal for the '<em><b>Historique</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIRCUIT__HISTORIQUE = eINSTANCE.getCircuit_Historique();

		/**
		 * The meta object literal for the '<em><b>Max Entree</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCUIT__MAX_ENTREE = eINSTANCE.getCircuit_MaxEntree();

		/**
		 * The meta object literal for the '<em><b>Max Sortie</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCUIT__MAX_SORTIE = eINSTANCE.getCircuit_MaxSortie();

		/**
		 * The meta object literal for the '<em><b>Ajouter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CIRCUIT___AJOUTER__ELEMENTCIRCUIT = eINSTANCE.getCircuit__Ajouter__ElementCircuit();

		/**
		 * The meta object literal for the '<em><b>Relier</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CIRCUIT___RELIER__ELEMENTCIRCUIT_ELEMENTCIRCUIT = eINSTANCE.getCircuit__Relier__ElementCircuit_ElementCircuit();

		/**
		 * The meta object literal for the '<em><b>Enlever</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CIRCUIT___ENLEVER__ELEMENTCIRCUIT = eINSTANCE.getCircuit__Enlever__ElementCircuit();

		/**
		 * The meta object literal for the '<em><b>Valider</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CIRCUIT___VALIDER = eINSTANCE.getCircuit__Valider();

		/**
		 * The meta object literal for the '<em><b>Get Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CIRCUIT___GET_ELEMENT__STRING = eINSTANCE.getCircuit__GetElement__String();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CIRCUIT___COUNT__ELEMENTTYPE = eINSTANCE.getCircuit__Count__ElementType();

		/**
		 * The meta object literal for the '<em><b>Get Max</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CIRCUIT___GET_MAX__ELEMENTTYPE = eINSTANCE.getCircuit__GetMax__ElementType();

		/**
		 * The meta object literal for the '<em><b>Supprimer Liaison</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CIRCUIT___SUPPRIMER_LIAISON__ELEMENTCIRCUIT_ELEMENTCIRCUIT = eINSTANCE.getCircuit__SupprimerLiaison__ElementCircuit_ElementCircuit();

		/**
		 * The meta object literal for the '<em><b>Deplacer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CIRCUIT___DEPLACER__ELEMENTCIRCUIT_INT_INT = eINSTANCE.getCircuit__Deplacer__ElementCircuit_int_int();

		/**
		 * The meta object literal for the '<em><b>Delier</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CIRCUIT___DELIER__ELEMENTCIRCUIT_ELEMENTCIRCUIT = eINSTANCE.getCircuit__Delier__ElementCircuit_ElementCircuit();

		/**
		 * The meta object literal for the '<em><b>Calculer Liste Sortie</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CIRCUIT___CALCULER_LISTE_SORTIE__ELIST_ELIST = eINSTANCE.getCircuit__CalculerListeSortie__EList_EList();

		/**
		 * The meta object literal for the '{@link circuiteditor.impl.PorteImpl <em>Porte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circuiteditor.impl.PorteImpl
		 * @see circuiteditor.impl.CircuiteditorPackageImpl#getPorte()
		 * @generated
		 */
		EClass PORTE = eINSTANCE.getPorte();

		/**
		 * The meta object literal for the '{@link circuiteditor.impl.ElementCircuitImpl <em>Element Circuit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circuiteditor.impl.ElementCircuitImpl
		 * @see circuiteditor.impl.CircuiteditorPackageImpl#getElementCircuit()
		 * @generated
		 */
		EClass ELEMENT_CIRCUIT = eINSTANCE.getElementCircuit();

		/**
		 * The meta object literal for the '<em><b>Emplacement X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_CIRCUIT__EMPLACEMENT_X = eINSTANCE.getElementCircuit_EmplacementX();

		/**
		 * The meta object literal for the '<em><b>Emplacement Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_CIRCUIT__EMPLACEMENT_Y = eINSTANCE.getElementCircuit_EmplacementY();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_CIRCUIT__NAME = eINSTANCE.getElementCircuit_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_CIRCUIT__DESCRIPTION = eINSTANCE.getElementCircuit_Description();

		/**
		 * The meta object literal for the '<em><b>Source Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_CIRCUIT__SOURCE_MAX = eINSTANCE.getElementCircuit_SourceMax();

		/**
		 * The meta object literal for the '<em><b>Cible Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_CIRCUIT__CIBLE_MAX = eINSTANCE.getElementCircuit_CibleMax();

		/**
		 * The meta object literal for the '<em><b>Est Circuit Valide</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_CIRCUIT__EST_CIRCUIT_VALIDE = eINSTANCE.getElementCircuit_EstCircuitValide();

		/**
		 * The meta object literal for the '<em><b>Est Modifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_CIRCUIT__EST_MODIFIER = eINSTANCE.getElementCircuit_EstModifier();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_CIRCUIT__TYPE = eINSTANCE.getElementCircuit_Type();

		/**
		 * The meta object literal for the '<em><b>Entree</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_CIRCUIT__ENTREE = eINSTANCE.getElementCircuit_Entree();

		/**
		 * The meta object literal for the '<em><b>Sortie</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_CIRCUIT__SORTIE = eINSTANCE.getElementCircuit_Sortie();

		/**
		 * The meta object literal for the '<em><b>Valider</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT_CIRCUIT___VALIDER = eINSTANCE.getElementCircuit__Valider();

		/**
		 * The meta object literal for the '<em><b>Get Liaisons</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT_CIRCUIT___GET_LIAISONS = eINSTANCE.getElementCircuit__GetLiaisons();

		/**
		 * The meta object literal for the '{@link circuiteditor.impl.EntreeImpl <em>Entree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circuiteditor.impl.EntreeImpl
		 * @see circuiteditor.impl.CircuiteditorPackageImpl#getEntree()
		 * @generated
		 */
		EClass ENTREE = eINSTANCE.getEntree();

		/**
		 * The meta object literal for the '{@link circuiteditor.impl.SortieImpl <em>Sortie</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circuiteditor.impl.SortieImpl
		 * @see circuiteditor.impl.CircuiteditorPackageImpl#getSortie()
		 * @generated
		 */
		EClass SORTIE = eINSTANCE.getSortie();

		/**
		 * The meta object literal for the '{@link circuiteditor.impl.PorteStandardImpl <em>Porte Standard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circuiteditor.impl.PorteStandardImpl
		 * @see circuiteditor.impl.CircuiteditorPackageImpl#getPorteStandard()
		 * @generated
		 */
		EClass PORTE_STANDARD = eINSTANCE.getPorteStandard();

		/**
		 * The meta object literal for the '<em><b>Type Porte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORTE_STANDARD__TYPE_PORTE = eINSTANCE.getPorteStandard_TypePorte();

		/**
		 * The meta object literal for the '{@link circuiteditor.impl.PortePersonaliseImpl <em>Porte Personalise</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circuiteditor.impl.PortePersonaliseImpl
		 * @see circuiteditor.impl.CircuiteditorPackageImpl#getPortePersonalise()
		 * @generated
		 */
		EClass PORTE_PERSONALISE = eINSTANCE.getPortePersonalise();

		/**
		 * The meta object literal for the '<em><b>Circuit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORTE_PERSONALISE__CIRCUIT = eINSTANCE.getPortePersonalise_Circuit();

		/**
		 * The meta object literal for the '{@link circuiteditor.impl.PorteETImpl <em>Porte ET</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circuiteditor.impl.PorteETImpl
		 * @see circuiteditor.impl.CircuiteditorPackageImpl#getPorteET()
		 * @generated
		 */
		EClass PORTE_ET = eINSTANCE.getPorteET();

		/**
		 * The meta object literal for the '{@link circuiteditor.impl.PorteOUImpl <em>Porte OU</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circuiteditor.impl.PorteOUImpl
		 * @see circuiteditor.impl.CircuiteditorPackageImpl#getPorteOU()
		 * @generated
		 */
		EClass PORTE_OU = eINSTANCE.getPorteOU();

		/**
		 * The meta object literal for the '{@link circuiteditor.impl.TableDeVeriteImpl <em>Table De Verite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circuiteditor.impl.TableDeVeriteImpl
		 * @see circuiteditor.impl.CircuiteditorPackageImpl#getTableDeVerite()
		 * @generated
		 */
		EClass TABLE_DE_VERITE = eINSTANCE.getTableDeVerite();

		/**
		 * The meta object literal for the '<em><b>Possede</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_DE_VERITE__POSSEDE = eINSTANCE.getTableDeVerite_Possede();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_DE_VERITE__ELEMENT = eINSTANCE.getTableDeVerite_Element();

		/**
		 * The meta object literal for the '<em><b>Calculer Table</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_DE_VERITE___CALCULER_TABLE = eINSTANCE.getTableDeVerite__CalculerTable();

		/**
		 * The meta object literal for the '{@link circuiteditor.impl.LigneTableDeVeriteImpl <em>Ligne Table De Verite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circuiteditor.impl.LigneTableDeVeriteImpl
		 * @see circuiteditor.impl.CircuiteditorPackageImpl#getLigneTableDeVerite()
		 * @generated
		 */
		EClass LIGNE_TABLE_DE_VERITE = eINSTANCE.getLigneTableDeVerite();

		/**
		 * The meta object literal for the '<em><b>Entrees</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIGNE_TABLE_DE_VERITE__ENTREES = eINSTANCE.getLigneTableDeVerite_Entrees();

		/**
		 * The meta object literal for the '<em><b>Sorties</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIGNE_TABLE_DE_VERITE__SORTIES = eINSTANCE.getLigneTableDeVerite_Sorties();

		/**
		 * The meta object literal for the '{@link circuiteditor.ElementTableVerite <em>Element Table Verite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circuiteditor.ElementTableVerite
		 * @see circuiteditor.impl.CircuiteditorPackageImpl#getElementTableVerite()
		 * @generated
		 */
		EClass ELEMENT_TABLE_VERITE = eINSTANCE.getElementTableVerite();

		/**
		 * The meta object literal for the '<em><b>Table Verite</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_TABLE_VERITE__TABLE_VERITE = eINSTANCE.getElementTableVerite_TableVerite();

		/**
		 * The meta object literal for the '<em><b>Evaluer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT_TABLE_VERITE___EVALUER = eINSTANCE.getElementTableVerite__Evaluer();

		/**
		 * The meta object literal for the '<em><b>Calcul Liste Entree Boolean</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT_TABLE_VERITE___CALCUL_LISTE_ENTREE_BOOLEAN__INT_INT = eINSTANCE.getElementTableVerite__CalculListeEntreeBoolean__int_int();

		/**
		 * The meta object literal for the '{@link circuiteditor.impl.GestionnaireHistoriqueImpl <em>Gestionnaire Historique</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circuiteditor.impl.GestionnaireHistoriqueImpl
		 * @see circuiteditor.impl.CircuiteditorPackageImpl#getGestionnaireHistorique()
		 * @generated
		 */
		EClass GESTIONNAIRE_HISTORIQUE = eINSTANCE.getGestionnaireHistorique();

		/**
		 * The meta object literal for the '<em><b>Action Curseur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GESTIONNAIRE_HISTORIQUE__ACTION_CURSEUR = eINSTANCE.getGestionnaireHistorique_ActionCurseur();

		/**
		 * The meta object literal for the '<em><b>Circuit</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GESTIONNAIRE_HISTORIQUE__CIRCUIT = eINSTANCE.getGestionnaireHistorique_Circuit();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GESTIONNAIRE_HISTORIQUE__ACTIONS = eINSTANCE.getGestionnaireHistorique_Actions();

		/**
		 * The meta object literal for the '<em><b>Enregistrer Action</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GESTIONNAIRE_HISTORIQUE___ENREGISTRER_ACTION__ACTION = eINSTANCE.getGestionnaireHistorique__EnregistrerAction__Action();

		/**
		 * The meta object literal for the '<em><b>Undo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GESTIONNAIRE_HISTORIQUE___UNDO = eINSTANCE.getGestionnaireHistorique__Undo();

		/**
		 * The meta object literal for the '<em><b>Redo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GESTIONNAIRE_HISTORIQUE___REDO = eINSTANCE.getGestionnaireHistorique__Redo();

		/**
		 * The meta object literal for the '{@link circuiteditor.Action <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circuiteditor.Action
		 * @see circuiteditor.impl.CircuiteditorPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__TYPE = eINSTANCE.getAction_Type();

		/**
		 * The meta object literal for the '<em><b>Gestionnaire Historique</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__GESTIONNAIRE_HISTORIQUE = eINSTANCE.getAction_GestionnaireHistorique();

		/**
		 * The meta object literal for the '<em><b>Done</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__DONE = eINSTANCE.getAction_Done();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION___EXECUTE = eINSTANCE.getAction__Execute();

		/**
		 * The meta object literal for the '<em><b>Rollback</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION___ROLLBACK = eINSTANCE.getAction__Rollback();

		/**
		 * The meta object literal for the '{@link circuiteditor.impl.ActionElementCircuitImpl <em>Action Element Circuit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circuiteditor.impl.ActionElementCircuitImpl
		 * @see circuiteditor.impl.CircuiteditorPackageImpl#getActionElementCircuit()
		 * @generated
		 */
		EClass ACTION_ELEMENT_CIRCUIT = eINSTANCE.getActionElementCircuit();

		/**
		 * The meta object literal for the '<em><b>Liaisons Modifiees</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_ELEMENT_CIRCUIT__LIAISONS_MODIFIEES = eINSTANCE.getActionElementCircuit_LiaisonsModifiees();

		/**
		 * The meta object literal for the '<em><b>Element Modifie</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_ELEMENT_CIRCUIT__ELEMENT_MODIFIE = eINSTANCE.getActionElementCircuit_ElementModifie();

		/**
		 * The meta object literal for the '{@link circuiteditor.impl.ActionLiaisonImpl <em>Action Liaison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circuiteditor.impl.ActionLiaisonImpl
		 * @see circuiteditor.impl.CircuiteditorPackageImpl#getActionLiaison()
		 * @generated
		 */
		EClass ACTION_LIAISON = eINSTANCE.getActionLiaison();

		/**
		 * The meta object literal for the '<em><b>Cible</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_LIAISON__CIBLE = eINSTANCE.getActionLiaison_Cible();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_LIAISON__SOURCE = eINSTANCE.getActionLiaison_Source();

		/**
		 * The meta object literal for the '{@link circuiteditor.impl.CircuitEditorImpl <em>Circuit Editor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circuiteditor.impl.CircuitEditorImpl
		 * @see circuiteditor.impl.CircuiteditorPackageImpl#getCircuitEditor()
		 * @generated
		 */
		EClass CIRCUIT_EDITOR = eINSTANCE.getCircuitEditor();

		/**
		 * The meta object literal for the '<em><b>Main Circuit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIRCUIT_EDITOR__MAIN_CIRCUIT = eINSTANCE.getCircuitEditor_MainCircuit();

		/**
		 * The meta object literal for the '<em><b>Persistance Manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIRCUIT_EDITOR__PERSISTANCE_MANAGER = eINSTANCE.getCircuitEditor_PersistanceManager();

		/**
		 * The meta object literal for the '<em><b>Sauvegarder</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CIRCUIT_EDITOR___SAUVEGARDER__STRING = eINSTANCE.getCircuitEditor__Sauvegarder__String();

		/**
		 * The meta object literal for the '<em><b>Ajouter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CIRCUIT_EDITOR___AJOUTER__ELEMENTTYPE = eINSTANCE.getCircuitEditor__Ajouter__ElementType();

		/**
		 * The meta object literal for the '<em><b>Enlever</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CIRCUIT_EDITOR___ENLEVER__STRING = eINSTANCE.getCircuitEditor__Enlever__String();

		/**
		 * The meta object literal for the '<em><b>Nouveau</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CIRCUIT_EDITOR___NOUVEAU = eINSTANCE.getCircuitEditor__Nouveau();

		/**
		 * The meta object literal for the '<em><b>Ouvrir</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CIRCUIT_EDITOR___OUVRIR__STRING = eINSTANCE.getCircuitEditor__Ouvrir__String();

		/**
		 * The meta object literal for the '<em><b>Delier</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CIRCUIT_EDITOR___DELIER__ELEMENTCIRCUIT_ELEMENTCIRCUIT = eINSTANCE.getCircuitEditor__Delier__ElementCircuit_ElementCircuit();

		/**
		 * The meta object literal for the '<em><b>Deplacer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CIRCUIT_EDITOR___DEPLACER__ELEMENTCIRCUIT_INT_INT = eINSTANCE.getCircuitEditor__Deplacer__ElementCircuit_int_int();

		/**
		 * The meta object literal for the '<em><b>Exporter Table</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CIRCUIT_EDITOR___EXPORTER_TABLE__STRING = eINSTANCE.getCircuitEditor__ExporterTable__String();

		/**
		 * The meta object literal for the '<em><b>Exporter Circuit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CIRCUIT_EDITOR___EXPORTER_CIRCUIT__STRING_BYTE = eINSTANCE.getCircuitEditor__ExporterCircuit__String_byte();

		/**
		 * The meta object literal for the '<em><b>Undo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CIRCUIT_EDITOR___UNDO = eINSTANCE.getCircuitEditor__Undo();

		/**
		 * The meta object literal for the '<em><b>Redo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CIRCUIT_EDITOR___REDO = eINSTANCE.getCircuitEditor__Redo();

		/**
		 * The meta object literal for the '<em><b>Relier</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CIRCUIT_EDITOR___RELIER__ELEMENTCIRCUIT_ELEMENTCIRCUIT = eINSTANCE.getCircuitEditor__Relier__ElementCircuit_ElementCircuit();

		/**
		 * The meta object literal for the '{@link circuiteditor.impl.PersistanceManagerImpl <em>Persistance Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circuiteditor.impl.PersistanceManagerImpl
		 * @see circuiteditor.impl.CircuiteditorPackageImpl#getPersistanceManager()
		 * @generated
		 */
		EClass PERSISTANCE_MANAGER = eINSTANCE.getPersistanceManager();

		/**
		 * The meta object literal for the '<em><b>Sauvegarde XMI</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERSISTANCE_MANAGER___SAUVEGARDE_XMI__CIRCUIT_STRING = eINSTANCE.getPersistanceManager__SauvegardeXMI__Circuit_String();

		/**
		 * The meta object literal for the '<em><b>Sauvegarde JPG</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERSISTANCE_MANAGER___SAUVEGARDE_JPG__BYTE_STRING = eINSTANCE.getPersistanceManager__SauvegardeJPG__byte_String();

		/**
		 * The meta object literal for the '<em><b>Sauvegarde Table</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERSISTANCE_MANAGER___SAUVEGARDE_TABLE__TABLEDEVERITE_STRING = eINSTANCE.getPersistanceManager__SauvegardeTable__TableDeVerite_String();

		/**
		 * The meta object literal for the '{@link circuiteditor.impl.PorteNOTImpl <em>Porte NOT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circuiteditor.impl.PorteNOTImpl
		 * @see circuiteditor.impl.CircuiteditorPackageImpl#getPorteNOT()
		 * @generated
		 */
		EClass PORTE_NOT = eINSTANCE.getPorteNOT();

		/**
		 * The meta object literal for the '{@link circuiteditor.impl.ActionDeplacerElementImpl <em>Action Deplacer Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circuiteditor.impl.ActionDeplacerElementImpl
		 * @see circuiteditor.impl.CircuiteditorPackageImpl#getActionDeplacerElement()
		 * @generated
		 */
		EClass ACTION_DEPLACER_ELEMENT = eINSTANCE.getActionDeplacerElement();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_DEPLACER_ELEMENT__X = eINSTANCE.getActionDeplacerElement_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_DEPLACER_ELEMENT__Y = eINSTANCE.getActionDeplacerElement_Y();

		/**
		 * The meta object literal for the '{@link circuiteditor.TypeAction <em>Type Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circuiteditor.TypeAction
		 * @see circuiteditor.impl.CircuiteditorPackageImpl#getTypeAction()
		 * @generated
		 */
		EEnum TYPE_ACTION = eINSTANCE.getTypeAction();

		/**
		 * The meta object literal for the '{@link circuiteditor.TypePorteStandard <em>Type Porte Standard</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circuiteditor.TypePorteStandard
		 * @see circuiteditor.impl.CircuiteditorPackageImpl#getTypePorteStandard()
		 * @generated
		 */
		EEnum TYPE_PORTE_STANDARD = eINSTANCE.getTypePorteStandard();

		/**
		 * The meta object literal for the '{@link circuiteditor.ElementType <em>Element Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see circuiteditor.ElementType
		 * @see circuiteditor.impl.CircuiteditorPackageImpl#getElementType()
		 * @generated
		 */
		EEnum ELEMENT_TYPE = eINSTANCE.getElementType();

	}

} //CircuiteditorPackage
