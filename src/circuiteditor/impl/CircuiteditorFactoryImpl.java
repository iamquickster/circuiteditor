/**
 */
package circuiteditor.impl;

import circuiteditor.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class CircuiteditorFactoryImpl extends EFactoryImpl implements
		CircuiteditorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static CircuiteditorFactory init() {
		try {
			CircuiteditorFactory theCircuiteditorFactory = (CircuiteditorFactory)EPackage.Registry.INSTANCE.getEFactory(CircuiteditorPackage.eNS_URI);
			if (theCircuiteditorFactory != null) {
				return theCircuiteditorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CircuiteditorFactoryImpl();
	}

	private int elementCount = 0;

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public CircuiteditorFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CircuiteditorPackage.CIRCUIT_EDITOR: return createCircuitEditor();
			case CircuiteditorPackage.CIRCUIT: return createCircuit();
			case CircuiteditorPackage.PORTE: return createPorte();
			case CircuiteditorPackage.PORTE_STANDARD: return createPorteStandard();
			case CircuiteditorPackage.PORTE_PERSONALISE: return createPortePersonalise();
			case CircuiteditorPackage.PORTE_ET: return createPorteET();
			case CircuiteditorPackage.PORTE_OU: return createPorteOU();
			case CircuiteditorPackage.ENTREE: return createEntree();
			case CircuiteditorPackage.SORTIE: return createSortie();
			case CircuiteditorPackage.TABLE_DE_VERITE: return createTableDeVerite();
			case CircuiteditorPackage.LIGNE_TABLE_DE_VERITE: return createLigneTableDeVerite();
			case CircuiteditorPackage.GESTIONNAIRE_HISTORIQUE: return createGestionnaireHistorique();
			case CircuiteditorPackage.ACTION_ELEMENT_CIRCUIT: return createActionElementCircuit();
			case CircuiteditorPackage.ACTION_LIAISON: return createActionLiaison();
			case CircuiteditorPackage.PERSISTANCE_MANAGER: return createPersistanceManager();
			case CircuiteditorPackage.PORTE_NOT: return createPorteNOT();
			case CircuiteditorPackage.ACTION_DEPLACER_ELEMENT: return createActionDeplacerElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CircuiteditorPackage.TYPE_ACTION:
				return createTypeActionFromString(eDataType, initialValue);
			case CircuiteditorPackage.TYPE_PORTE_STANDARD:
				return createTypePorteStandardFromString(eDataType, initialValue);
			case CircuiteditorPackage.ELEMENT_TYPE:
				return createElementTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CircuiteditorPackage.TYPE_ACTION:
				return convertTypeActionToString(eDataType, instanceValue);
			case CircuiteditorPackage.TYPE_PORTE_STANDARD:
				return convertTypePorteStandardToString(eDataType, instanceValue);
			case CircuiteditorPackage.ELEMENT_TYPE:
				return convertElementTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Circuit createCircuit() {
		CircuitImpl circuit = new CircuitImpl();
		circuit.setType(ElementType.PORTE_PERSONALISE);
		circuit.setHistorique(this.createGestionnaireHistorique());
		circuit.setSourceMax(5);
		circuit.setCibleMax(5);
		return circuit;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Porte createPorte() {
		PorteImpl porte = new PorteImpl();
		porte.setType(ElementType.PORTE_STANDARD);
		porte.setName("P" + getCount());
		porte.setSourceMax(50);
		porte.setCibleMax(50);
		return porte;
	}

	private int getCount() {
		return ++elementCount;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Entree createEntree() {
		EntreeImpl entree = new EntreeImpl();
		entree.setType(ElementType.ENTREE);
		entree.setName("E" + getCount());
		entree.setSourceMax(0);
		entree.setCibleMax(50);
		return entree;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Sortie createSortie() {
		SortieImpl sortie = new SortieImpl();
		sortie.setType(ElementType.SORTIE);
		sortie.setName("S" + getCount());
		sortie.setSourceMax(50);
		sortie.setCibleMax(0);
		return sortie;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PorteStandard createPorteStandard() {
		PorteStandardImpl porteStandard = new PorteStandardImpl();
		porteStandard.setType(ElementType.PORTE_STANDARD);
		porteStandard.setName("P" + getCount());
		return porteStandard;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public PortePersonalise createPortePersonalise() {
		PortePersonaliseImpl portePersonalise = new PortePersonaliseImpl();
		portePersonalise.setType(ElementType.PORTE_PERSONALISE);
		portePersonalise.setName("PP" + getCount());
		return portePersonalise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PorteET createPorteET() {
		PorteETImpl porteET = new PorteETImpl();
		return porteET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PorteOU createPorteOU() {
		PorteOUImpl porteOU = new PorteOUImpl();
		return porteOU;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TableDeVerite createTableDeVerite() {
		TableDeVeriteImpl tableDeVerite = new TableDeVeriteImpl();
		return tableDeVerite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LigneTableDeVerite createLigneTableDeVerite() {
		LigneTableDeVeriteImpl ligneTableDeVerite = new LigneTableDeVeriteImpl();
		return ligneTableDeVerite;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public GestionnaireHistorique createGestionnaireHistorique() {
		GestionnaireHistoriqueImpl gestionnaireHistorique = new GestionnaireHistoriqueImpl();
		return gestionnaireHistorique;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ActionElementCircuit createActionElementCircuit() {
		ActionElementCircuitImpl actionElementCircuit = new ActionElementCircuitImpl();
		return actionElementCircuit;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ActionLiaison createActionLiaison() {
		ActionLiaisonImpl actionLiaison = new ActionLiaisonImpl();
		return actionLiaison;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CircuitEditor createCircuitEditor() {
		CircuitEditorImpl circuitEditor = new CircuitEditorImpl();
		return circuitEditor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PersistanceManager createPersistanceManager() {
		PersistanceManagerImpl persistanceManager = new PersistanceManagerImpl();
		return persistanceManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PorteNOT createPorteNOT() {
		PorteNOTImpl porteNOT = new PorteNOTImpl();
		return porteNOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionDeplacerElement createActionDeplacerElement() {
		ActionDeplacerElementImpl actionDeplacerElement = new ActionDeplacerElementImpl();
		return actionDeplacerElement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAction createTypeActionFromString(EDataType eDataType,
			String initialValue) {
		TypeAction result = TypeAction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeActionToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TypePorteStandard createTypePorteStandardFromString(
			EDataType eDataType, String initialValue) {
		TypePorteStandard result = TypePorteStandard.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypePorteStandardToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ElementType createElementTypeFromString(EDataType eDataType,
			String initialValue) {
		ElementType result = ElementType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertElementTypeToString(EDataType eDataType,
			Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CircuiteditorPackage getCircuiteditorPackage() {
		return (CircuiteditorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CircuiteditorPackage getPackage() {
		return CircuiteditorPackage.eINSTANCE;
	}

} // CircuiteditorFactoryImpl
