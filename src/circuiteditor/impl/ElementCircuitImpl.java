/**
 */
package circuiteditor.impl;

import circuiteditor.CircuiteditorPackage;
import circuiteditor.ElementCircuit;
import circuiteditor.ElementType;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Element Circuit</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link circuiteditor.impl.ElementCircuitImpl#getEmplacementX <em>Emplacement X</em>}</li>
 *   <li>{@link circuiteditor.impl.ElementCircuitImpl#getEmplacementY <em>Emplacement Y</em>}</li>
 *   <li>{@link circuiteditor.impl.ElementCircuitImpl#getName <em>Name</em>}</li>
 *   <li>{@link circuiteditor.impl.ElementCircuitImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link circuiteditor.impl.ElementCircuitImpl#getSourceMax <em>Source Max</em>}</li>
 *   <li>{@link circuiteditor.impl.ElementCircuitImpl#getCibleMax <em>Cible Max</em>}</li>
 *   <li>{@link circuiteditor.impl.ElementCircuitImpl#isEstCircuitValide <em>Est Circuit Valide</em>}</li>
 *   <li>{@link circuiteditor.impl.ElementCircuitImpl#isEstModifier <em>Est Modifier</em>}</li>
 *   <li>{@link circuiteditor.impl.ElementCircuitImpl#getType <em>Type</em>}</li>
 *   <li>{@link circuiteditor.impl.ElementCircuitImpl#getEntree <em>Entree</em>}</li>
 *   <li>{@link circuiteditor.impl.ElementCircuitImpl#getSortie <em>Sortie</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ElementCircuitImpl extends MinimalEObjectImpl.Container
		implements ElementCircuit {
	/**
	 * The default value of the '{@link #getEmplacementX() <em>Emplacement X</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getEmplacementX()
	 * @generated
	 * @ordered
	 */
	protected static final int EMPLACEMENT_X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEmplacementX() <em>Emplacement X</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getEmplacementX()
	 * @generated
	 * @ordered
	 */
	protected int emplacementX = EMPLACEMENT_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmplacementY() <em>Emplacement Y</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getEmplacementY()
	 * @generated
	 * @ordered
	 */
	protected static final int EMPLACEMENT_Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEmplacementY() <em>Emplacement Y</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getEmplacementY()
	 * @generated
	 * @ordered
	 */
	protected int emplacementY = EMPLACEMENT_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceMax() <em>Source Max</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSourceMax()
	 * @generated
	 * @ordered
	 */
	protected static final int SOURCE_MAX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSourceMax() <em>Source Max</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSourceMax()
	 * @generated
	 * @ordered
	 */
	protected int sourceMax = SOURCE_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getCibleMax() <em>Cible Max</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCibleMax()
	 * @generated
	 * @ordered
	 */
	protected static final int CIBLE_MAX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCibleMax() <em>Cible Max</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCibleMax()
	 * @generated
	 * @ordered
	 */
	protected int cibleMax = CIBLE_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #isEstCircuitValide() <em>Est Circuit Valide</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isEstCircuitValide()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EST_CIRCUIT_VALIDE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEstCircuitValide() <em>Est Circuit Valide</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isEstCircuitValide()
	 * @generated
	 * @ordered
	 */
	protected boolean estCircuitValide = EST_CIRCUIT_VALIDE_EDEFAULT;

	/**
	 * The default value of the '{@link #isEstModifier() <em>Est Modifier</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isEstModifier()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EST_MODIFIER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEstModifier() <em>Est Modifier</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isEstModifier()
	 * @generated
	 * @ordered
	 */
	protected boolean estModifier = EST_MODIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ElementType TYPE_EDEFAULT = ElementType.SORTIE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ElementType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntree() <em>Entree</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getEntree()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementCircuit> entree;

	/**
	 * The cached value of the '{@link #getSortie() <em>Sortie</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSortie()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementCircuit> sortie;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected ElementCircuitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircuiteditorPackage.Literals.ELEMENT_CIRCUIT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getEmplacementX() {
		return emplacementX;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmplacementX(int newEmplacementX) {
		int oldEmplacementX = emplacementX;
		emplacementX = newEmplacementX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircuiteditorPackage.ELEMENT_CIRCUIT__EMPLACEMENT_X, oldEmplacementX, emplacementX));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getEmplacementY() {
		return emplacementY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmplacementY(int newEmplacementY) {
		int oldEmplacementY = emplacementY;
		emplacementY = newEmplacementY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircuiteditorPackage.ELEMENT_CIRCUIT__EMPLACEMENT_Y, oldEmplacementY, emplacementY));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircuiteditorPackage.ELEMENT_CIRCUIT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircuiteditorPackage.ELEMENT_CIRCUIT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getSourceMax() {
		return sourceMax;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceMax(int newSourceMax) {
		int oldSourceMax = sourceMax;
		sourceMax = newSourceMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircuiteditorPackage.ELEMENT_CIRCUIT__SOURCE_MAX, oldSourceMax, sourceMax));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getCibleMax() {
		return cibleMax;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCibleMax(int newCibleMax) {
		int oldCibleMax = cibleMax;
		cibleMax = newCibleMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircuiteditorPackage.ELEMENT_CIRCUIT__CIBLE_MAX, oldCibleMax, cibleMax));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEstCircuitValide() {
		return estCircuitValide;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstCircuitValide(boolean newEstCircuitValide) {
		boolean oldEstCircuitValide = estCircuitValide;
		estCircuitValide = newEstCircuitValide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircuiteditorPackage.ELEMENT_CIRCUIT__EST_CIRCUIT_VALIDE, oldEstCircuitValide, estCircuitValide));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEstModifier() {
		return estModifier;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstModifier(boolean newEstModifier) {
		boolean oldEstModifier = estModifier;
		estModifier = newEstModifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircuiteditorPackage.ELEMENT_CIRCUIT__EST_MODIFIER, oldEstModifier, estModifier));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ElementType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ElementType newType) {
		ElementType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircuiteditorPackage.ELEMENT_CIRCUIT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementCircuit> getEntree() {
		if (entree == null) {
			entree = new EObjectWithInverseResolvingEList.ManyInverse<ElementCircuit>(ElementCircuit.class, this, CircuiteditorPackage.ELEMENT_CIRCUIT__ENTREE, CircuiteditorPackage.ELEMENT_CIRCUIT__SORTIE);
		}
		return entree;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementCircuit> getSortie() {
		if (sortie == null) {
			sortie = new EObjectWithInverseResolvingEList.ManyInverse<ElementCircuit>(ElementCircuit.class, this, CircuiteditorPackage.ELEMENT_CIRCUIT__SORTIE, CircuiteditorPackage.ELEMENT_CIRCUIT__ENTREE);
		}
		return sortie;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean valider() {
		return getEntree().size() == sourceMax && getSortie().size() == cibleMax;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<?> getLiaisons() {
		EList<ElementCircuit> liaisons = new BasicEList<>(getEntree());
		liaisons.addAll(getSortie());
		
		return liaisons;
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
			case CircuiteditorPackage.ELEMENT_CIRCUIT__ENTREE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEntree()).basicAdd(otherEnd, msgs);
			case CircuiteditorPackage.ELEMENT_CIRCUIT__SORTIE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSortie()).basicAdd(otherEnd, msgs);
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
			case CircuiteditorPackage.ELEMENT_CIRCUIT__ENTREE:
				return ((InternalEList<?>)getEntree()).basicRemove(otherEnd, msgs);
			case CircuiteditorPackage.ELEMENT_CIRCUIT__SORTIE:
				return ((InternalEList<?>)getSortie()).basicRemove(otherEnd, msgs);
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
			case CircuiteditorPackage.ELEMENT_CIRCUIT__EMPLACEMENT_X:
				return getEmplacementX();
			case CircuiteditorPackage.ELEMENT_CIRCUIT__EMPLACEMENT_Y:
				return getEmplacementY();
			case CircuiteditorPackage.ELEMENT_CIRCUIT__NAME:
				return getName();
			case CircuiteditorPackage.ELEMENT_CIRCUIT__DESCRIPTION:
				return getDescription();
			case CircuiteditorPackage.ELEMENT_CIRCUIT__SOURCE_MAX:
				return getSourceMax();
			case CircuiteditorPackage.ELEMENT_CIRCUIT__CIBLE_MAX:
				return getCibleMax();
			case CircuiteditorPackage.ELEMENT_CIRCUIT__EST_CIRCUIT_VALIDE:
				return isEstCircuitValide();
			case CircuiteditorPackage.ELEMENT_CIRCUIT__EST_MODIFIER:
				return isEstModifier();
			case CircuiteditorPackage.ELEMENT_CIRCUIT__TYPE:
				return getType();
			case CircuiteditorPackage.ELEMENT_CIRCUIT__ENTREE:
				return getEntree();
			case CircuiteditorPackage.ELEMENT_CIRCUIT__SORTIE:
				return getSortie();
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
			case CircuiteditorPackage.ELEMENT_CIRCUIT__EMPLACEMENT_X:
				setEmplacementX((Integer)newValue);
				return;
			case CircuiteditorPackage.ELEMENT_CIRCUIT__EMPLACEMENT_Y:
				setEmplacementY((Integer)newValue);
				return;
			case CircuiteditorPackage.ELEMENT_CIRCUIT__NAME:
				setName((String)newValue);
				return;
			case CircuiteditorPackage.ELEMENT_CIRCUIT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CircuiteditorPackage.ELEMENT_CIRCUIT__SOURCE_MAX:
				setSourceMax((Integer)newValue);
				return;
			case CircuiteditorPackage.ELEMENT_CIRCUIT__CIBLE_MAX:
				setCibleMax((Integer)newValue);
				return;
			case CircuiteditorPackage.ELEMENT_CIRCUIT__EST_CIRCUIT_VALIDE:
				setEstCircuitValide((Boolean)newValue);
				return;
			case CircuiteditorPackage.ELEMENT_CIRCUIT__EST_MODIFIER:
				setEstModifier((Boolean)newValue);
				return;
			case CircuiteditorPackage.ELEMENT_CIRCUIT__TYPE:
				setType((ElementType)newValue);
				return;
			case CircuiteditorPackage.ELEMENT_CIRCUIT__ENTREE:
				getEntree().clear();
				getEntree().addAll((Collection<? extends ElementCircuit>)newValue);
				return;
			case CircuiteditorPackage.ELEMENT_CIRCUIT__SORTIE:
				getSortie().clear();
				getSortie().addAll((Collection<? extends ElementCircuit>)newValue);
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
			case CircuiteditorPackage.ELEMENT_CIRCUIT__EMPLACEMENT_X:
				setEmplacementX(EMPLACEMENT_X_EDEFAULT);
				return;
			case CircuiteditorPackage.ELEMENT_CIRCUIT__EMPLACEMENT_Y:
				setEmplacementY(EMPLACEMENT_Y_EDEFAULT);
				return;
			case CircuiteditorPackage.ELEMENT_CIRCUIT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CircuiteditorPackage.ELEMENT_CIRCUIT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CircuiteditorPackage.ELEMENT_CIRCUIT__SOURCE_MAX:
				setSourceMax(SOURCE_MAX_EDEFAULT);
				return;
			case CircuiteditorPackage.ELEMENT_CIRCUIT__CIBLE_MAX:
				setCibleMax(CIBLE_MAX_EDEFAULT);
				return;
			case CircuiteditorPackage.ELEMENT_CIRCUIT__EST_CIRCUIT_VALIDE:
				setEstCircuitValide(EST_CIRCUIT_VALIDE_EDEFAULT);
				return;
			case CircuiteditorPackage.ELEMENT_CIRCUIT__EST_MODIFIER:
				setEstModifier(EST_MODIFIER_EDEFAULT);
				return;
			case CircuiteditorPackage.ELEMENT_CIRCUIT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CircuiteditorPackage.ELEMENT_CIRCUIT__ENTREE:
				getEntree().clear();
				return;
			case CircuiteditorPackage.ELEMENT_CIRCUIT__SORTIE:
				getSortie().clear();
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
			case CircuiteditorPackage.ELEMENT_CIRCUIT__EMPLACEMENT_X:
				return emplacementX != EMPLACEMENT_X_EDEFAULT;
			case CircuiteditorPackage.ELEMENT_CIRCUIT__EMPLACEMENT_Y:
				return emplacementY != EMPLACEMENT_Y_EDEFAULT;
			case CircuiteditorPackage.ELEMENT_CIRCUIT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CircuiteditorPackage.ELEMENT_CIRCUIT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CircuiteditorPackage.ELEMENT_CIRCUIT__SOURCE_MAX:
				return sourceMax != SOURCE_MAX_EDEFAULT;
			case CircuiteditorPackage.ELEMENT_CIRCUIT__CIBLE_MAX:
				return cibleMax != CIBLE_MAX_EDEFAULT;
			case CircuiteditorPackage.ELEMENT_CIRCUIT__EST_CIRCUIT_VALIDE:
				return estCircuitValide != EST_CIRCUIT_VALIDE_EDEFAULT;
			case CircuiteditorPackage.ELEMENT_CIRCUIT__EST_MODIFIER:
				return estModifier != EST_MODIFIER_EDEFAULT;
			case CircuiteditorPackage.ELEMENT_CIRCUIT__TYPE:
				return type != TYPE_EDEFAULT;
			case CircuiteditorPackage.ELEMENT_CIRCUIT__ENTREE:
				return entree != null && !entree.isEmpty();
			case CircuiteditorPackage.ELEMENT_CIRCUIT__SORTIE:
				return sortie != null && !sortie.isEmpty();
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
			case CircuiteditorPackage.ELEMENT_CIRCUIT___VALIDER:
				return valider();
			case CircuiteditorPackage.ELEMENT_CIRCUIT___GET_LIAISONS:
				return getLiaisons();
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
		result.append(" (emplacementX: ");
		result.append(emplacementX);
		result.append(", emplacementY: ");
		result.append(emplacementY);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", sourceMax: ");
		result.append(sourceMax);
		result.append(", cibleMax: ");
		result.append(cibleMax);
		result.append(", estCircuitValide: ");
		result.append(estCircuitValide);
		result.append(", estModifier: ");
		result.append(estModifier);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} // ElementCircuitImpl
