/**
 */
package circuiteditor.impl;

import circuiteditor.ActionElementCircuit;
import circuiteditor.ActionLiaison;
import circuiteditor.CircuiteditorPackage;
import circuiteditor.ElementCircuit;

import circuiteditor.GestionnaireHistorique;
import circuiteditor.TypeAction;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Element Circuit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link circuiteditor.impl.ActionElementCircuitImpl#getType <em>Type</em>}</li>
 *   <li>{@link circuiteditor.impl.ActionElementCircuitImpl#getGestionnaireHistorique <em>Gestionnaire Historique</em>}</li>
 *   <li>{@link circuiteditor.impl.ActionElementCircuitImpl#isDone <em>Done</em>}</li>
 *   <li>{@link circuiteditor.impl.ActionElementCircuitImpl#getLiaisonsModifiees <em>Liaisons Modifiees</em>}</li>
 *   <li>{@link circuiteditor.impl.ActionElementCircuitImpl#getElementModifie <em>Element Modifie</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionElementCircuitImpl extends MinimalEObjectImpl.Container implements ActionElementCircuit {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeAction TYPE_EDEFAULT = TypeAction.AJOUTER;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeAction type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isDone() <em>Done</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDone()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DONE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDone() <em>Done</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDone()
	 * @generated
	 * @ordered
	 */
	protected boolean done = DONE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLiaisonsModifiees() <em>Liaisons Modifiees</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiaisonsModifiees()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionLiaison> liaisonsModifiees;

	/**
	 * The cached value of the '{@link #getElementModifie() <em>Element Modifie</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementModifie()
	 * @generated
	 * @ordered
	 */
	protected ElementCircuit elementModifie;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionElementCircuitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircuiteditorPackage.Literals.ACTION_ELEMENT_CIRCUIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAction getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeAction newType) {
		TypeAction oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircuiteditorPackage.ACTION_ELEMENT_CIRCUIT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GestionnaireHistorique getGestionnaireHistorique() {
		if (eContainerFeatureID() != CircuiteditorPackage.ACTION_ELEMENT_CIRCUIT__GESTIONNAIRE_HISTORIQUE) return null;
		return (GestionnaireHistorique)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGestionnaireHistorique(GestionnaireHistorique newGestionnaireHistorique, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGestionnaireHistorique, CircuiteditorPackage.ACTION_ELEMENT_CIRCUIT__GESTIONNAIRE_HISTORIQUE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGestionnaireHistorique(GestionnaireHistorique newGestionnaireHistorique) {
		if (newGestionnaireHistorique != eInternalContainer() || (eContainerFeatureID() != CircuiteditorPackage.ACTION_ELEMENT_CIRCUIT__GESTIONNAIRE_HISTORIQUE && newGestionnaireHistorique != null)) {
			if (EcoreUtil.isAncestor(this, newGestionnaireHistorique))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGestionnaireHistorique != null)
				msgs = ((InternalEObject)newGestionnaireHistorique).eInverseAdd(this, CircuiteditorPackage.GESTIONNAIRE_HISTORIQUE__ACTIONS, GestionnaireHistorique.class, msgs);
			msgs = basicSetGestionnaireHistorique(newGestionnaireHistorique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircuiteditorPackage.ACTION_ELEMENT_CIRCUIT__GESTIONNAIRE_HISTORIQUE, newGestionnaireHistorique, newGestionnaireHistorique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDone() {
		return done;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDone(boolean newDone) {
		boolean oldDone = done;
		done = newDone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircuiteditorPackage.ACTION_ELEMENT_CIRCUIT__DONE, oldDone, done));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionLiaison> getLiaisonsModifiees() {
		if (liaisonsModifiees == null) {
			liaisonsModifiees = new EObjectResolvingEList<ActionLiaison>(ActionLiaison.class, this, CircuiteditorPackage.ACTION_ELEMENT_CIRCUIT__LIAISONS_MODIFIEES);
		}
		return liaisonsModifiees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementCircuit getElementModifie() {
		if (elementModifie != null && elementModifie.eIsProxy()) {
			InternalEObject oldElementModifie = (InternalEObject)elementModifie;
			elementModifie = (ElementCircuit)eResolveProxy(oldElementModifie);
			if (elementModifie != oldElementModifie) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CircuiteditorPackage.ACTION_ELEMENT_CIRCUIT__ELEMENT_MODIFIE, oldElementModifie, elementModifie));
			}
		}
		return elementModifie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementCircuit basicGetElementModifie() {
		return elementModifie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementModifie(ElementCircuit newElementModifie) {
		ElementCircuit oldElementModifie = elementModifie;
		elementModifie = newElementModifie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircuiteditorPackage.ACTION_ELEMENT_CIRCUIT__ELEMENT_MODIFIE, oldElementModifie, elementModifie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void execute() {
		if(type == TypeAction.AJOUTER) {
			getGestionnaireHistorique().getCircuit().ajouter(getElementModifie());
		} else if(type == TypeAction.SUPPRIMER) {
			getGestionnaireHistorique().getCircuit().enlever(getElementModifie());
		}
		setDone(true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void rollback() {
		if(type == TypeAction.AJOUTER) {
			getGestionnaireHistorique().getCircuit().enlever(elementModifie);
		} else if (type == TypeAction.SUPPRIMER) {
			getGestionnaireHistorique().getCircuit().ajouter(elementModifie);
			for (ActionLiaison a : getLiaisonsModifiees() ) {
				a.execute();
			}
		}
		setDone(false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CircuiteditorPackage.ACTION_ELEMENT_CIRCUIT__GESTIONNAIRE_HISTORIQUE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGestionnaireHistorique((GestionnaireHistorique)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CircuiteditorPackage.ACTION_ELEMENT_CIRCUIT__GESTIONNAIRE_HISTORIQUE:
				return basicSetGestionnaireHistorique(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CircuiteditorPackage.ACTION_ELEMENT_CIRCUIT__GESTIONNAIRE_HISTORIQUE:
				return eInternalContainer().eInverseRemove(this, CircuiteditorPackage.GESTIONNAIRE_HISTORIQUE__ACTIONS, GestionnaireHistorique.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CircuiteditorPackage.ACTION_ELEMENT_CIRCUIT__TYPE:
				return getType();
			case CircuiteditorPackage.ACTION_ELEMENT_CIRCUIT__GESTIONNAIRE_HISTORIQUE:
				return getGestionnaireHistorique();
			case CircuiteditorPackage.ACTION_ELEMENT_CIRCUIT__DONE:
				return isDone();
			case CircuiteditorPackage.ACTION_ELEMENT_CIRCUIT__LIAISONS_MODIFIEES:
				return getLiaisonsModifiees();
			case CircuiteditorPackage.ACTION_ELEMENT_CIRCUIT__ELEMENT_MODIFIE:
				if (resolve) return getElementModifie();
				return basicGetElementModifie();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CircuiteditorPackage.ACTION_ELEMENT_CIRCUIT__TYPE:
				setType((TypeAction)newValue);
				return;
			case CircuiteditorPackage.ACTION_ELEMENT_CIRCUIT__GESTIONNAIRE_HISTORIQUE:
				setGestionnaireHistorique((GestionnaireHistorique)newValue);
				return;
			case CircuiteditorPackage.ACTION_ELEMENT_CIRCUIT__DONE:
				setDone((Boolean)newValue);
				return;
			case CircuiteditorPackage.ACTION_ELEMENT_CIRCUIT__LIAISONS_MODIFIEES:
				getLiaisonsModifiees().clear();
				getLiaisonsModifiees().addAll((Collection<? extends ActionLiaison>)newValue);
				return;
			case CircuiteditorPackage.ACTION_ELEMENT_CIRCUIT__ELEMENT_MODIFIE:
				setElementModifie((ElementCircuit)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CircuiteditorPackage.ACTION_ELEMENT_CIRCUIT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CircuiteditorPackage.ACTION_ELEMENT_CIRCUIT__GESTIONNAIRE_HISTORIQUE:
				setGestionnaireHistorique((GestionnaireHistorique)null);
				return;
			case CircuiteditorPackage.ACTION_ELEMENT_CIRCUIT__DONE:
				setDone(DONE_EDEFAULT);
				return;
			case CircuiteditorPackage.ACTION_ELEMENT_CIRCUIT__LIAISONS_MODIFIEES:
				getLiaisonsModifiees().clear();
				return;
			case CircuiteditorPackage.ACTION_ELEMENT_CIRCUIT__ELEMENT_MODIFIE:
				setElementModifie((ElementCircuit)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CircuiteditorPackage.ACTION_ELEMENT_CIRCUIT__TYPE:
				return type != TYPE_EDEFAULT;
			case CircuiteditorPackage.ACTION_ELEMENT_CIRCUIT__GESTIONNAIRE_HISTORIQUE:
				return getGestionnaireHistorique() != null;
			case CircuiteditorPackage.ACTION_ELEMENT_CIRCUIT__DONE:
				return done != DONE_EDEFAULT;
			case CircuiteditorPackage.ACTION_ELEMENT_CIRCUIT__LIAISONS_MODIFIEES:
				return liaisonsModifiees != null && !liaisonsModifiees.isEmpty();
			case CircuiteditorPackage.ACTION_ELEMENT_CIRCUIT__ELEMENT_MODIFIE:
				return elementModifie != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CircuiteditorPackage.ACTION_ELEMENT_CIRCUIT___EXECUTE:
				execute();
				return null;
			case CircuiteditorPackage.ACTION_ELEMENT_CIRCUIT___ROLLBACK:
				rollback();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", done: ");
		result.append(done);
		result.append(')');
		return result.toString();
	}

} //ActionElementCircuitImpl
