/**
 */
package circuiteditor.impl;

import circuiteditor.ActionLiaison;
import circuiteditor.CircuiteditorPackage;
import circuiteditor.ElementCircuit;

import circuiteditor.GestionnaireHistorique;
import circuiteditor.TypeAction;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Liaison</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link circuiteditor.impl.ActionLiaisonImpl#getType <em>Type</em>}</li>
 *   <li>{@link circuiteditor.impl.ActionLiaisonImpl#getGestionnaireHistorique <em>Gestionnaire Historique</em>}</li>
 *   <li>{@link circuiteditor.impl.ActionLiaisonImpl#isDone <em>Done</em>}</li>
 *   <li>{@link circuiteditor.impl.ActionLiaisonImpl#getCible <em>Cible</em>}</li>
 *   <li>{@link circuiteditor.impl.ActionLiaisonImpl#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionLiaisonImpl extends MinimalEObjectImpl.Container implements ActionLiaison {
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
	 * The cached value of the '{@link #getCible() <em>Cible</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCible()
	 * @generated
	 * @ordered
	 */
	protected ElementCircuit cible;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ElementCircuit source;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionLiaisonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircuiteditorPackage.Literals.ACTION_LIAISON;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CircuiteditorPackage.ACTION_LIAISON__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GestionnaireHistorique getGestionnaireHistorique() {
		if (eContainerFeatureID() != CircuiteditorPackage.ACTION_LIAISON__GESTIONNAIRE_HISTORIQUE) return null;
		return (GestionnaireHistorique)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGestionnaireHistorique(GestionnaireHistorique newGestionnaireHistorique, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGestionnaireHistorique, CircuiteditorPackage.ACTION_LIAISON__GESTIONNAIRE_HISTORIQUE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGestionnaireHistorique(GestionnaireHistorique newGestionnaireHistorique) {
		if (newGestionnaireHistorique != eInternalContainer() || (eContainerFeatureID() != CircuiteditorPackage.ACTION_LIAISON__GESTIONNAIRE_HISTORIQUE && newGestionnaireHistorique != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, CircuiteditorPackage.ACTION_LIAISON__GESTIONNAIRE_HISTORIQUE, newGestionnaireHistorique, newGestionnaireHistorique));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CircuiteditorPackage.ACTION_LIAISON__DONE, oldDone, done));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementCircuit getCible() {
		if (cible != null && cible.eIsProxy()) {
			InternalEObject oldCible = (InternalEObject)cible;
			cible = (ElementCircuit)eResolveProxy(oldCible);
			if (cible != oldCible) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CircuiteditorPackage.ACTION_LIAISON__CIBLE, oldCible, cible));
			}
		}
		return cible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementCircuit basicGetCible() {
		return cible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCible(ElementCircuit newCible) {
		ElementCircuit oldCible = cible;
		cible = newCible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircuiteditorPackage.ACTION_LIAISON__CIBLE, oldCible, cible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementCircuit getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (ElementCircuit)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CircuiteditorPackage.ACTION_LIAISON__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementCircuit basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(ElementCircuit newSource) {
		ElementCircuit oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircuiteditorPackage.ACTION_LIAISON__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void execute() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void rollback() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CircuiteditorPackage.ACTION_LIAISON__GESTIONNAIRE_HISTORIQUE:
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
			case CircuiteditorPackage.ACTION_LIAISON__GESTIONNAIRE_HISTORIQUE:
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
			case CircuiteditorPackage.ACTION_LIAISON__GESTIONNAIRE_HISTORIQUE:
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
			case CircuiteditorPackage.ACTION_LIAISON__TYPE:
				return getType();
			case CircuiteditorPackage.ACTION_LIAISON__GESTIONNAIRE_HISTORIQUE:
				return getGestionnaireHistorique();
			case CircuiteditorPackage.ACTION_LIAISON__DONE:
				return isDone();
			case CircuiteditorPackage.ACTION_LIAISON__CIBLE:
				if (resolve) return getCible();
				return basicGetCible();
			case CircuiteditorPackage.ACTION_LIAISON__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CircuiteditorPackage.ACTION_LIAISON__TYPE:
				setType((TypeAction)newValue);
				return;
			case CircuiteditorPackage.ACTION_LIAISON__GESTIONNAIRE_HISTORIQUE:
				setGestionnaireHistorique((GestionnaireHistorique)newValue);
				return;
			case CircuiteditorPackage.ACTION_LIAISON__DONE:
				setDone((Boolean)newValue);
				return;
			case CircuiteditorPackage.ACTION_LIAISON__CIBLE:
				setCible((ElementCircuit)newValue);
				return;
			case CircuiteditorPackage.ACTION_LIAISON__SOURCE:
				setSource((ElementCircuit)newValue);
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
			case CircuiteditorPackage.ACTION_LIAISON__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CircuiteditorPackage.ACTION_LIAISON__GESTIONNAIRE_HISTORIQUE:
				setGestionnaireHistorique((GestionnaireHistorique)null);
				return;
			case CircuiteditorPackage.ACTION_LIAISON__DONE:
				setDone(DONE_EDEFAULT);
				return;
			case CircuiteditorPackage.ACTION_LIAISON__CIBLE:
				setCible((ElementCircuit)null);
				return;
			case CircuiteditorPackage.ACTION_LIAISON__SOURCE:
				setSource((ElementCircuit)null);
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
			case CircuiteditorPackage.ACTION_LIAISON__TYPE:
				return type != TYPE_EDEFAULT;
			case CircuiteditorPackage.ACTION_LIAISON__GESTIONNAIRE_HISTORIQUE:
				return getGestionnaireHistorique() != null;
			case CircuiteditorPackage.ACTION_LIAISON__DONE:
				return done != DONE_EDEFAULT;
			case CircuiteditorPackage.ACTION_LIAISON__CIBLE:
				return cible != null;
			case CircuiteditorPackage.ACTION_LIAISON__SOURCE:
				return source != null;
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
			case CircuiteditorPackage.ACTION_LIAISON___EXECUTE:
				execute();
				return null;
			case CircuiteditorPackage.ACTION_LIAISON___ROLLBACK:
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

} //ActionLiaisonImpl
