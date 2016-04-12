/**
 */
package circuiteditor.impl;

import circuiteditor.Action;
import circuiteditor.Circuit;
import circuiteditor.CircuiteditorPackage;
import circuiteditor.GestionnaireHistorique;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Gestionnaire Historique</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link circuiteditor.impl.GestionnaireHistoriqueImpl#getActionCurseur <em>Action Curseur</em>}</li>
 *   <li>{@link circuiteditor.impl.GestionnaireHistoriqueImpl#getCircuit <em>Circuit</em>}</li>
 *   <li>{@link circuiteditor.impl.GestionnaireHistoriqueImpl#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GestionnaireHistoriqueImpl extends MinimalEObjectImpl.Container
		implements GestionnaireHistorique {
	/**
	 * The default value of the '{@link #getActionCurseur() <em>Action Curseur</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getActionCurseur()
	 * @generated
	 * @ordered
	 */
	protected static final int ACTION_CURSEUR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getActionCurseur() <em>Action Curseur</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getActionCurseur()
	 * @generated
	 * @ordered
	 */
	protected int actionCurseur = ACTION_CURSEUR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

	private AdapterFactoryEditingDomain domain;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected GestionnaireHistoriqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircuiteditorPackage.Literals.GESTIONNAIRE_HISTORIQUE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getActionCurseur() {
		return actionCurseur;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionCurseur(int newActionCurseur) {
		int oldActionCurseur = actionCurseur;
		actionCurseur = newActionCurseur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircuiteditorPackage.GESTIONNAIRE_HISTORIQUE__ACTION_CURSEUR, oldActionCurseur, actionCurseur));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Circuit getCircuit() {
		if (eContainerFeatureID() != CircuiteditorPackage.GESTIONNAIRE_HISTORIQUE__CIRCUIT) return null;
		return (Circuit)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCircuit(Circuit newCircuit,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCircuit, CircuiteditorPackage.GESTIONNAIRE_HISTORIQUE__CIRCUIT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCircuit(Circuit newCircuit) {
		if (newCircuit != eInternalContainer() || (eContainerFeatureID() != CircuiteditorPackage.GESTIONNAIRE_HISTORIQUE__CIRCUIT && newCircuit != null)) {
			if (EcoreUtil.isAncestor(this, newCircuit))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCircuit != null)
				msgs = ((InternalEObject)newCircuit).eInverseAdd(this, CircuiteditorPackage.CIRCUIT__HISTORIQUE, Circuit.class, msgs);
			msgs = basicSetCircuit(newCircuit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircuiteditorPackage.GESTIONNAIRE_HISTORIQUE__CIRCUIT, newCircuit, newCircuit));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentWithInverseEList<Action>(Action.class, this, CircuiteditorPackage.GESTIONNAIRE_HISTORIQUE__ACTIONS, CircuiteditorPackage.ACTION__GESTIONNAIRE_HISTORIQUE);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean enregistrerAction(Action action) {
		 if(getActions().isEmpty()) {
			 actions.add(action);
			 return true;
		 }
		 
		 if(actions.get(actionCurseur).isDone()){
			 actionCurseur++;
		 }
		 
		 for ( int i = actionCurseur; i < actions.size(); i++){
			 actions.remove(i);
		 }
		 
		 actions.add(action);
		 
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void undo() {
		if(getActions().isEmpty()) {
			return;
		}
		if(actionCurseur == 0  && !getActions().get(actionCurseur).isDone()) {
			return;
		}
		if (getActions().get(actionCurseur).isDone()) {
			getActions().get(actionCurseur).rollback();
		} else {
			getActions().get(--actionCurseur).rollback();
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void redo() {
		if(getActions().isEmpty()) {
			return;
		}
		if(getActions().size() == actionCurseur + 1 && getActions().get(actionCurseur).isDone()) {
			return;
		}
		if (getActions().get(actionCurseur).isDone()) {
			getActions().get(++actionCurseur).execute();
		} else {
			getActions().get(actionCurseur).execute();
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CircuiteditorPackage.GESTIONNAIRE_HISTORIQUE__CIRCUIT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCircuit((Circuit)otherEnd, msgs);
			case CircuiteditorPackage.GESTIONNAIRE_HISTORIQUE__ACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActions()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CircuiteditorPackage.GESTIONNAIRE_HISTORIQUE__CIRCUIT:
				return basicSetCircuit(null, msgs);
			case CircuiteditorPackage.GESTIONNAIRE_HISTORIQUE__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CircuiteditorPackage.GESTIONNAIRE_HISTORIQUE__CIRCUIT:
				return eInternalContainer().eInverseRemove(this, CircuiteditorPackage.CIRCUIT__HISTORIQUE, Circuit.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void Undo(Circuit circuit) {

		AdapterFactoryEditingDomain.getEditingDomainFor(circuit)
				.getCommandStack().undo();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void Redo(Circuit circuit) {

		AdapterFactoryEditingDomain.getEditingDomainFor(circuit)
				.getCommandStack().redo();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CircuiteditorPackage.GESTIONNAIRE_HISTORIQUE__ACTION_CURSEUR:
				return getActionCurseur();
			case CircuiteditorPackage.GESTIONNAIRE_HISTORIQUE__CIRCUIT:
				return getCircuit();
			case CircuiteditorPackage.GESTIONNAIRE_HISTORIQUE__ACTIONS:
				return getActions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CircuiteditorPackage.GESTIONNAIRE_HISTORIQUE__ACTION_CURSEUR:
				setActionCurseur((Integer)newValue);
				return;
			case CircuiteditorPackage.GESTIONNAIRE_HISTORIQUE__CIRCUIT:
				setCircuit((Circuit)newValue);
				return;
			case CircuiteditorPackage.GESTIONNAIRE_HISTORIQUE__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
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
			case CircuiteditorPackage.GESTIONNAIRE_HISTORIQUE__ACTION_CURSEUR:
				setActionCurseur(ACTION_CURSEUR_EDEFAULT);
				return;
			case CircuiteditorPackage.GESTIONNAIRE_HISTORIQUE__CIRCUIT:
				setCircuit((Circuit)null);
				return;
			case CircuiteditorPackage.GESTIONNAIRE_HISTORIQUE__ACTIONS:
				getActions().clear();
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
			case CircuiteditorPackage.GESTIONNAIRE_HISTORIQUE__ACTION_CURSEUR:
				return actionCurseur != ACTION_CURSEUR_EDEFAULT;
			case CircuiteditorPackage.GESTIONNAIRE_HISTORIQUE__CIRCUIT:
				return getCircuit() != null;
			case CircuiteditorPackage.GESTIONNAIRE_HISTORIQUE__ACTIONS:
				return actions != null && !actions.isEmpty();
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
			case CircuiteditorPackage.GESTIONNAIRE_HISTORIQUE___ENREGISTRER_ACTION__ACTION:
				return enregistrerAction((Action)arguments.get(0));
			case CircuiteditorPackage.GESTIONNAIRE_HISTORIQUE___UNDO:
				undo();
				return null;
			case CircuiteditorPackage.GESTIONNAIRE_HISTORIQUE___REDO:
				redo();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (actionCurseur: ");
		result.append(actionCurseur);
		result.append(')');
		return result.toString();
	}

} // GestionnaireHistoriqueImpl
