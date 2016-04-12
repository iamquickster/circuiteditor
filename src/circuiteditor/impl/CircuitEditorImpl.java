/**
 */
package circuiteditor.impl;

import circuiteditor.ActionElementCircuit;
import circuiteditor.Circuit;
import circuiteditor.CircuitEditor;
import circuiteditor.CircuiteditorPackage;
import circuiteditor.ElementCircuit;
import circuiteditor.ElementType;
import circuiteditor.Entree;
import circuiteditor.PersistanceManager;
import circuiteditor.PorteET;
import circuiteditor.Sortie;
import circuiteditor.TypeAction;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Circuit Editor</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link circuiteditor.impl.CircuitEditorImpl#getMainCircuit <em>Main Circuit</em>}</li>
 *   <li>{@link circuiteditor.impl.CircuitEditorImpl#getPersistanceManager <em>Persistance Manager</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CircuitEditorImpl extends MinimalEObjectImpl.Container implements CircuitEditor {
	/**
	 * The cached value of the '{@link #getMainCircuit() <em>Main Circuit</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMainCircuit()
	 * @generated
	 * @ordered
	 */
	protected Circuit mainCircuit;

	/**
	 * The cached value of the '{@link #getPersistanceManager() <em>Persistance Manager</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getPersistanceManager()
	 * @generated
	 * @ordered
	 */
	protected PersistanceManager persistanceManager;

	private Resource res;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected CircuitEditorImpl() {
		super();
		persistanceManager = CircuiteditorFactoryImpl.eINSTANCE
				.createPersistanceManager();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircuiteditorPackage.Literals.CIRCUIT_EDITOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Circuit getMainCircuit() {
		return mainCircuit;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMainCircuit(Circuit newMainCircuit,
			NotificationChain msgs) {
		Circuit oldMainCircuit = mainCircuit;
		mainCircuit = newMainCircuit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CircuiteditorPackage.CIRCUIT_EDITOR__MAIN_CIRCUIT, oldMainCircuit, newMainCircuit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainCircuit(Circuit newMainCircuit) {
		if (newMainCircuit != mainCircuit) {
			NotificationChain msgs = null;
			if (mainCircuit != null)
				msgs = ((InternalEObject)mainCircuit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CircuiteditorPackage.CIRCUIT_EDITOR__MAIN_CIRCUIT, null, msgs);
			if (newMainCircuit != null)
				msgs = ((InternalEObject)newMainCircuit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CircuiteditorPackage.CIRCUIT_EDITOR__MAIN_CIRCUIT, null, msgs);
			msgs = basicSetMainCircuit(newMainCircuit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircuiteditorPackage.CIRCUIT_EDITOR__MAIN_CIRCUIT, newMainCircuit, newMainCircuit));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PersistanceManager getPersistanceManager() {
		if (persistanceManager != null && persistanceManager.eIsProxy()) {
			InternalEObject oldPersistanceManager = (InternalEObject)persistanceManager;
			persistanceManager = (PersistanceManager)eResolveProxy(oldPersistanceManager);
			if (persistanceManager != oldPersistanceManager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CircuiteditorPackage.CIRCUIT_EDITOR__PERSISTANCE_MANAGER, oldPersistanceManager, persistanceManager));
			}
		}
		return persistanceManager;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public PersistanceManager basicGetPersistanceManager() {
		return persistanceManager;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistanceManager(PersistanceManager newPersistanceManager) {
		PersistanceManager oldPersistanceManager = persistanceManager;
		persistanceManager = newPersistanceManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircuiteditorPackage.CIRCUIT_EDITOR__PERSISTANCE_MANAGER, oldPersistanceManager, persistanceManager));
	}


	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean sauvegarder(String filePath) {
		boolean sauvegarde = false;
		
		Circuit main = getMainCircuit();
		
		//if (getMainCircuit().valider()) {
			sauvegarde = getPersistanceManager().sauvegardeXMI(
					main, filePath);
		//}
		
			setMainCircuit(main);

		return sauvegarde;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void ajouter(ElementType type) {
		if (getMainCircuit().count(type) < getMainCircuit().getMax(type)) {
			ElementCircuit elemAjouter = null;
			if (type.equals(ElementType.ENTREE_VALUE)) {
				elemAjouter = CircuiteditorFactoryImpl.eINSTANCE.createEntree();
			} else if (type.equals(ElementType.SORTIE)) {
				elemAjouter = CircuiteditorFactoryImpl.eINSTANCE.createSortie();
			} else {
				elemAjouter = CircuiteditorFactoryImpl.eINSTANCE
						.createPorteStandard();

			}
			getMainCircuit().ajouter(elemAjouter);
			ActionElementCircuit a1 = CircuiteditorFactoryImpl.eINSTANCE
					.createActionElementCircuit();
			a1.setType(TypeAction.AJOUTER);
			a1.setElementModifie(elemAjouter);
			a1.setDone(true);
			getMainCircuit().getHistorique().enregistrerAction(a1);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean enlever(String nomElement) {
		boolean resultat = false;
		ElementCircuit elem = getMainCircuit().getElement(nomElement);
		if(elem != null){
			
			resultat = getMainCircuit().enlever(elem);
			ActionElementCircuit a1 = CircuiteditorFactoryImpl.eINSTANCE
					.createActionElementCircuit();
			a1.setType(TypeAction.SUPPRIMER);
			a1.setDone(true);
			a1.setElementModifie(elem);
			getMainCircuit().getHistorique().enregistrerAction(a1);
		}
		
		

		return resultat;

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean nouveau() {

		Circuit circuit = CircuiteditorFactoryImpl.eINSTANCE.createCircuit();
		
		Entree e1 = CircuiteditorFactoryImpl.eINSTANCE.createEntree();
		e1.setEmplacementX(100);
		e1.setEmplacementY(100);
		e1.setName("E1");
		
		
		Entree e2 = CircuiteditorFactoryImpl.eINSTANCE.createEntree();
		e2.setEmplacementX(100);
		e2.setEmplacementY(200);
		e2.setName("E2");
		
		
		PorteET p1 = CircuiteditorFactoryImpl.eINSTANCE.createPorteET();
		p1.setEmplacementX(150);
		p1.setEmplacementY(150);
		p1.setName("P&1");
		
		Sortie s1 = CircuiteditorFactoryImpl.eINSTANCE.createSortie();
		s1.setEmplacementX(200);
		s1.setEmplacementY(150);
		s1.setName("S1");
		
		
		circuit.ajouter(e1);
		circuit.ajouter(e2);
		circuit.ajouter(p1);
		circuit.ajouter(s1);
		
		circuit.relier(e1, p1);
		circuit.relier(e2, p1);
		
		circuit.relier(p1, s1);
		
		setMainCircuit(circuit);
		
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void ouvrir(String path) {

		
		Resource resource = new XMIResourceImpl(URI.createURI(path));
		
		try {
			resource.load(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		EObject eObject = resource.getContents().get(0);
		setMainCircuit((Circuit) eObject);

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean delier(ElementCircuit elementSource, ElementCircuit elementCible) {
		getMainCircuit().supprimerLiaison(elementSource, elementCible);

		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void deplacer(ElementCircuit element, int x, int y) {
		ActionElementCircuit a  = CircuiteditorFactoryImpl.eINSTANCE.createActionElementCircuit();
		a.setElementModifie(element);
		a.setType(TypeAction.DEPLACER);
		
		getMainCircuit().deplacer(element, x, y);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void exporterTable(String path) {
		
		persistanceManager.sauvegardeTable(mainCircuit.getTabledeverite(), path);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void exporterCircuit(String path, byte[] circuit) {
		
		persistanceManager.sauvegardeJPG(circuit, path);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void undo() {
		mainCircuit.getHistorique().undo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void redo() {
		
		mainCircuit.getHistorique().redo();
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean relier(ElementCircuit elementSource, ElementCircuit elementCible) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CircuiteditorPackage.CIRCUIT_EDITOR__MAIN_CIRCUIT:
				return basicSetMainCircuit(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CircuiteditorPackage.CIRCUIT_EDITOR__MAIN_CIRCUIT:
				return getMainCircuit();
			case CircuiteditorPackage.CIRCUIT_EDITOR__PERSISTANCE_MANAGER:
				if (resolve) return getPersistanceManager();
				return basicGetPersistanceManager();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CircuiteditorPackage.CIRCUIT_EDITOR__MAIN_CIRCUIT:
				setMainCircuit((Circuit)newValue);
				return;
			case CircuiteditorPackage.CIRCUIT_EDITOR__PERSISTANCE_MANAGER:
				setPersistanceManager((PersistanceManager)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CircuiteditorPackage.CIRCUIT_EDITOR__MAIN_CIRCUIT:
				setMainCircuit((Circuit)null);
				return;
			case CircuiteditorPackage.CIRCUIT_EDITOR__PERSISTANCE_MANAGER:
				setPersistanceManager((PersistanceManager)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CircuiteditorPackage.CIRCUIT_EDITOR__MAIN_CIRCUIT:
				return mainCircuit != null;
			case CircuiteditorPackage.CIRCUIT_EDITOR__PERSISTANCE_MANAGER:
				return persistanceManager != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case CircuiteditorPackage.CIRCUIT_EDITOR___AJOUTER__ELEMENTTYPE:
				ajouter((ElementType)arguments.get(0));
				return null;
			case CircuiteditorPackage.CIRCUIT_EDITOR___ENLEVER__STRING:
				return enlever((String)arguments.get(0));
			case CircuiteditorPackage.CIRCUIT_EDITOR___NOUVEAU:
				return nouveau();
			case CircuiteditorPackage.CIRCUIT_EDITOR___OUVRIR__STRING:
				ouvrir((String)arguments.get(0));
				return null;
			case CircuiteditorPackage.CIRCUIT_EDITOR___DELIER__ELEMENTCIRCUIT_ELEMENTCIRCUIT:
				return delier((ElementCircuit)arguments.get(0), (ElementCircuit)arguments.get(1));
			case CircuiteditorPackage.CIRCUIT_EDITOR___DEPLACER__ELEMENTCIRCUIT_INT_INT:
				deplacer((ElementCircuit)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case CircuiteditorPackage.CIRCUIT_EDITOR___SAUVEGARDER__STRING:
				return sauvegarder((String)arguments.get(0));
			case CircuiteditorPackage.CIRCUIT_EDITOR___EXPORTER_TABLE__STRING:
				exporterTable((String)arguments.get(0));
				return null;
			case CircuiteditorPackage.CIRCUIT_EDITOR___EXPORTER_CIRCUIT__STRING_BYTE:
				exporterCircuit((String)arguments.get(0), (byte[])arguments.get(1));
				return null;
			case CircuiteditorPackage.CIRCUIT_EDITOR___UNDO:
				undo();
				return null;
			case CircuiteditorPackage.CIRCUIT_EDITOR___REDO:
				redo();
				return null;
			case CircuiteditorPackage.CIRCUIT_EDITOR___RELIER__ELEMENTCIRCUIT_ELEMENTCIRCUIT:
				return relier((ElementCircuit)arguments.get(0), (ElementCircuit)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} // CircuitEditorImpl
