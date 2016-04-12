/**
 */
package circuiteditor.impl;

import java.io.ObjectInputStream.GetField;

import circuiteditor.Circuit;
import circuiteditor.CircuiteditorPackage;
import circuiteditor.ElementCircuit;
import circuiteditor.LigneTableDeVerite;
import circuiteditor.PortePersonalise;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Porte Personalise</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link circuiteditor.impl.PortePersonaliseImpl#getCircuit <em>Circuit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortePersonaliseImpl extends PorteImpl implements PortePersonalise {
	/**
	 * The cached value of the '{@link #getCircuit() <em>Circuit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCircuit()
	 * @generated
	 * @ordered
	 */
	protected Circuit circuit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortePersonaliseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircuiteditorPackage.Literals.PORTE_PERSONALISE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Circuit getCircuit() {
		if (circuit != null && circuit.eIsProxy()) {
			InternalEObject oldCircuit = (InternalEObject)circuit;
			circuit = (Circuit)eResolveProxy(oldCircuit);
			if (circuit != oldCircuit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CircuiteditorPackage.PORTE_PERSONALISE__CIRCUIT, oldCircuit, circuit));
			}
		}
		return circuit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Circuit basicGetCircuit() {
		return circuit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCircuit(Circuit newCircuit) {
		Circuit oldCircuit = circuit;
		circuit = newCircuit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircuiteditorPackage.PORTE_PERSONALISE__CIRCUIT, oldCircuit, circuit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CircuiteditorPackage.PORTE_PERSONALISE__CIRCUIT:
				if (resolve) return getCircuit();
				return basicGetCircuit();
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
			case CircuiteditorPackage.PORTE_PERSONALISE__CIRCUIT:
				setCircuit((Circuit)newValue);
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
			case CircuiteditorPackage.PORTE_PERSONALISE__CIRCUIT:
				setCircuit((Circuit)null);
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
			case CircuiteditorPackage.PORTE_PERSONALISE__CIRCUIT:
				return circuit != null;
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public EList<ElementCircuit> getEntree() {
		return getCircuit().getEntree();
	}
	
	@Override
	public EList<ElementCircuit> getSortie() {
		return getCircuit().getSortie();
	}
	
	@Override
	public EList<LigneTableDeVerite> evaluer() {
		return getCircuit().evaluer();
		
	}
	
	@Override
	public boolean valider() {
		return getCircuit().valider();
		
	}

	


} //PortePersonaliseImpl
