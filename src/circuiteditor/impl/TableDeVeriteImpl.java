/**
 */
package circuiteditor.impl;

import circuiteditor.CircuiteditorPackage;
import circuiteditor.ElementTableVerite;
import circuiteditor.LigneTableDeVerite;
import circuiteditor.TableDeVerite;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table De Verite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link circuiteditor.impl.TableDeVeriteImpl#getPossede <em>Possede</em>}</li>
 *   <li>{@link circuiteditor.impl.TableDeVeriteImpl#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableDeVeriteImpl extends MinimalEObjectImpl.Container implements TableDeVerite {
	/**
	 * The cached value of the '{@link #getPossede() <em>Possede</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossede()
	 * @generated
	 * @ordered
	 */
	protected EList<LigneTableDeVerite> possede;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableDeVeriteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircuiteditorPackage.Literals.TABLE_DE_VERITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LigneTableDeVerite> getPossede() {
		if (possede == null) {
			possede = new EObjectContainmentEList<LigneTableDeVerite>(LigneTableDeVerite.class, this, CircuiteditorPackage.TABLE_DE_VERITE__POSSEDE);
		}
		return possede;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementTableVerite getElement() {
		if (eContainerFeatureID() != CircuiteditorPackage.TABLE_DE_VERITE__ELEMENT) return null;
		return (ElementTableVerite)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElement(ElementTableVerite newElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newElement, CircuiteditorPackage.TABLE_DE_VERITE__ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(ElementTableVerite newElement) {
		if (newElement != eInternalContainer() || (eContainerFeatureID() != CircuiteditorPackage.TABLE_DE_VERITE__ELEMENT && newElement != null)) {
			if (EcoreUtil.isAncestor(this, newElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newElement != null)
				msgs = ((InternalEObject)newElement).eInverseAdd(this, CircuiteditorPackage.ELEMENT_TABLE_VERITE__TABLE_VERITE, ElementTableVerite.class, msgs);
			msgs = basicSetElement(newElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircuiteditorPackage.TABLE_DE_VERITE__ELEMENT, newElement, newElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void calculerTable() {
		getPossede().clear();
		getPossede().addAll(getElement().evaluer());
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CircuiteditorPackage.TABLE_DE_VERITE__ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetElement((ElementTableVerite)otherEnd, msgs);
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
			case CircuiteditorPackage.TABLE_DE_VERITE__POSSEDE:
				return ((InternalEList<?>)getPossede()).basicRemove(otherEnd, msgs);
			case CircuiteditorPackage.TABLE_DE_VERITE__ELEMENT:
				return basicSetElement(null, msgs);
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
			case CircuiteditorPackage.TABLE_DE_VERITE__ELEMENT:
				return eInternalContainer().eInverseRemove(this, CircuiteditorPackage.ELEMENT_TABLE_VERITE__TABLE_VERITE, ElementTableVerite.class, msgs);
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
			case CircuiteditorPackage.TABLE_DE_VERITE__POSSEDE:
				return getPossede();
			case CircuiteditorPackage.TABLE_DE_VERITE__ELEMENT:
				return getElement();
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
			case CircuiteditorPackage.TABLE_DE_VERITE__POSSEDE:
				getPossede().clear();
				getPossede().addAll((Collection<? extends LigneTableDeVerite>)newValue);
				return;
			case CircuiteditorPackage.TABLE_DE_VERITE__ELEMENT:
				setElement((ElementTableVerite)newValue);
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
			case CircuiteditorPackage.TABLE_DE_VERITE__POSSEDE:
				getPossede().clear();
				return;
			case CircuiteditorPackage.TABLE_DE_VERITE__ELEMENT:
				setElement((ElementTableVerite)null);
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
			case CircuiteditorPackage.TABLE_DE_VERITE__POSSEDE:
				return possede != null && !possede.isEmpty();
			case CircuiteditorPackage.TABLE_DE_VERITE__ELEMENT:
				return getElement() != null;
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
			case CircuiteditorPackage.TABLE_DE_VERITE___CALCULER_TABLE:
				calculerTable();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //TableDeVeriteImpl
