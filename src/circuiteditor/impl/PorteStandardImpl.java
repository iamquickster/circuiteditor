/**
 */
package circuiteditor.impl;

import circuiteditor.CircuiteditorPackage;
import circuiteditor.PorteStandard;
import circuiteditor.TypePorteStandard;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Porte Standard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link circuiteditor.impl.PorteStandardImpl#getTypePorte <em>Type Porte</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PorteStandardImpl extends PorteImpl implements PorteStandard {
	/**
	 * The default value of the '{@link #getTypePorte() <em>Type Porte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypePorte()
	 * @generated
	 * @ordered
	 */
	protected static final TypePorteStandard TYPE_PORTE_EDEFAULT = TypePorteStandard.AND;

	/**
	 * The cached value of the '{@link #getTypePorte() <em>Type Porte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypePorte()
	 * @generated
	 * @ordered
	 */
	protected TypePorteStandard typePorte = TYPE_PORTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PorteStandardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircuiteditorPackage.Literals.PORTE_STANDARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypePorteStandard getTypePorte() {
		return typePorte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypePorte(TypePorteStandard newTypePorte) {
		TypePorteStandard oldTypePorte = typePorte;
		typePorte = newTypePorte == null ? TYPE_PORTE_EDEFAULT : newTypePorte;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircuiteditorPackage.PORTE_STANDARD__TYPE_PORTE, oldTypePorte, typePorte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CircuiteditorPackage.PORTE_STANDARD__TYPE_PORTE:
				return getTypePorte();
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
			case CircuiteditorPackage.PORTE_STANDARD__TYPE_PORTE:
				setTypePorte((TypePorteStandard)newValue);
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
			case CircuiteditorPackage.PORTE_STANDARD__TYPE_PORTE:
				setTypePorte(TYPE_PORTE_EDEFAULT);
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
			case CircuiteditorPackage.PORTE_STANDARD__TYPE_PORTE:
				return typePorte != TYPE_PORTE_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (typePorte: ");
		result.append(typePorte);
		result.append(')');
		return result.toString();
	}

} //PorteStandardImpl
