/**
 */
package circuiteditor.impl;

import circuiteditor.CircuiteditorPackage;
import circuiteditor.LigneTableDeVerite;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ligne Table De Verite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link circuiteditor.impl.LigneTableDeVeriteImpl#getEntrees <em>Entrees</em>}</li>
 *   <li>{@link circuiteditor.impl.LigneTableDeVeriteImpl#getSorties <em>Sorties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LigneTableDeVeriteImpl extends MinimalEObjectImpl.Container implements LigneTableDeVerite {
	/**
	 * The cached value of the '{@link #getEntrees() <em>Entrees</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntrees()
	 * @generated
	 * @ordered
	 */
	protected EList<Boolean> entrees;

	/**
	 * The cached value of the '{@link #getSorties() <em>Sorties</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSorties()
	 * @generated
	 * @ordered
	 */
	protected EList<Boolean> sorties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LigneTableDeVeriteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircuiteditorPackage.Literals.LIGNE_TABLE_DE_VERITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Boolean> getEntrees() {
		if (entrees == null) {
			entrees = new EDataTypeEList<Boolean>(Boolean.class, this, CircuiteditorPackage.LIGNE_TABLE_DE_VERITE__ENTREES);
		}
		return entrees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Boolean> getSorties() {
		if (sorties == null) {
			sorties = new EDataTypeUniqueEList<Boolean>(Boolean.class, this, CircuiteditorPackage.LIGNE_TABLE_DE_VERITE__SORTIES);
		}
		return sorties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CircuiteditorPackage.LIGNE_TABLE_DE_VERITE__ENTREES:
				return getEntrees();
			case CircuiteditorPackage.LIGNE_TABLE_DE_VERITE__SORTIES:
				return getSorties();
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
			case CircuiteditorPackage.LIGNE_TABLE_DE_VERITE__ENTREES:
				getEntrees().clear();
				getEntrees().addAll((Collection<? extends Boolean>)newValue);
				return;
			case CircuiteditorPackage.LIGNE_TABLE_DE_VERITE__SORTIES:
				getSorties().clear();
				getSorties().addAll((Collection<? extends Boolean>)newValue);
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
			case CircuiteditorPackage.LIGNE_TABLE_DE_VERITE__ENTREES:
				getEntrees().clear();
				return;
			case CircuiteditorPackage.LIGNE_TABLE_DE_VERITE__SORTIES:
				getSorties().clear();
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
			case CircuiteditorPackage.LIGNE_TABLE_DE_VERITE__ENTREES:
				return entrees != null && !entrees.isEmpty();
			case CircuiteditorPackage.LIGNE_TABLE_DE_VERITE__SORTIES:
				return sorties != null && !sorties.isEmpty();
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
		result.append(" (entrees: ");
		result.append(entrees);
		result.append(", sorties: ");
		result.append(sorties);
		result.append(')');
		return result.toString();
	}
	
	@Override
	public	boolean equals(Object o) {
		if(o instanceof LigneTableDeVerite) {
			LigneTableDeVerite ldv = (LigneTableDeVerite) o;
			return ldv.getEntrees().equals(this.getEntrees());
		}
		return false;
	}

} //LigneTableDeVeriteImpl
