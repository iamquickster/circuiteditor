/**
 */
package circuiteditor.impl;

import circuiteditor.Circuit;
import circuiteditor.CircuiteditorPackage;
import circuiteditor.ElementCircuit;
import circuiteditor.Entree;
import circuiteditor.LigneTableDeVerite;
import circuiteditor.TableDeVerite;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entree</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link circuiteditor.impl.EntreeImpl#getTableVerite <em>Table Verite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntreeImpl extends ElementCircuitImpl implements Entree {
	/**
	 * The cached value of the '{@link #getTableVerite() <em>Table Verite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableVerite()
	 * @generated
	 * @ordered
	 */
	protected TableDeVerite tableVerite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntreeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircuiteditorPackage.Literals.ENTREE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TableDeVerite getTableVerite() {
		if(tableVerite == null) {
			tableVerite = CircuiteditorFactoryImpl.eINSTANCE.createTableDeVerite();
		}
		return tableVerite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableVerite(TableDeVerite newTableVerite, NotificationChain msgs) {
		TableDeVerite oldTableVerite = tableVerite;
		tableVerite = newTableVerite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CircuiteditorPackage.ENTREE__TABLE_VERITE, oldTableVerite, newTableVerite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableVerite(TableDeVerite newTableVerite) {
		if (newTableVerite != tableVerite) {
			NotificationChain msgs = null;
			if (tableVerite != null)
				msgs = ((InternalEObject)tableVerite).eInverseRemove(this, CircuiteditorPackage.TABLE_DE_VERITE__ELEMENT, TableDeVerite.class, msgs);
			if (newTableVerite != null)
				msgs = ((InternalEObject)newTableVerite).eInverseAdd(this, CircuiteditorPackage.TABLE_DE_VERITE__ELEMENT, TableDeVerite.class, msgs);
			msgs = basicSetTableVerite(newTableVerite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircuiteditorPackage.ENTREE__TABLE_VERITE, newTableVerite, newTableVerite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<LigneTableDeVerite> evaluer() {
		EList<LigneTableDeVerite> result = new BasicEList<LigneTableDeVerite>();
		LigneTableDeVerite s1 = CircuiteditorFactoryImpl.eINSTANCE.createLigneTableDeVerite();
		
		s1.getSorties().add(true);
		result.add(s1);
		LigneTableDeVerite s2 = CircuiteditorFactoryImpl.eINSTANCE.createLigneTableDeVerite();
		s2.getSorties().add(false);
		result.add(s2);
		getTableVerite().getPossede().addAll(result);
		return result ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Boolean> calculListeEntreeBoolean(int longueurListe, int valeur) {
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
			case CircuiteditorPackage.ENTREE__TABLE_VERITE:
				if (tableVerite != null)
					msgs = ((InternalEObject)tableVerite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CircuiteditorPackage.ENTREE__TABLE_VERITE, null, msgs);
				return basicSetTableVerite((TableDeVerite)otherEnd, msgs);
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
			case CircuiteditorPackage.ENTREE__TABLE_VERITE:
				return basicSetTableVerite(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CircuiteditorPackage.ENTREE__TABLE_VERITE:
				return getTableVerite();
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
			case CircuiteditorPackage.ENTREE__TABLE_VERITE:
				setTableVerite((TableDeVerite)newValue);
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
			case CircuiteditorPackage.ENTREE__TABLE_VERITE:
				setTableVerite((TableDeVerite)null);
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
			case CircuiteditorPackage.ENTREE__TABLE_VERITE:
				return tableVerite != null;
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
			case CircuiteditorPackage.ENTREE___EVALUER:
				return evaluer();
			case CircuiteditorPackage.ENTREE___CALCUL_LISTE_ENTREE_BOOLEAN__INT_INT:
				return calculListeEntreeBoolean((Integer)arguments.get(0), (Integer)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}
	
	@Override
	public boolean valider() {
		if(getEntree().size() == 0){
			for (ElementCircuit elem : getSortie()) {
				if(elem instanceof Circuit) {
					continue;
				}
				return true;
				
			}
		}
		return false;
	}

} //EntreeImpl
