/**
 */
package circuiteditor;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EClass;
import circuiteditor.impl.CircuiteditorPackageImpl;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration '
 * <em><b>Element Type</b></em>', and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see circuiteditor.CircuiteditorPackage#getElementType()
 * @model
 * @generated
 */
public enum ElementType implements Enumerator {
	/**
	 * The '<em><b>Sortie</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #SORTIE_VALUE
	 * @generated
	 * @ordered
	 */
	SORTIE(0, "Sortie", "Sortie"),

	/**
	 * The '<em><b>Entree</b></em>' literal object.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #ENTREE_VALUE
	 * @generated
	 * @ordered
	 */
	ENTREE(1, "Entree", "Entree"),

	/**
	 * The '<em><b>Porte Standard</b></em>' literal object.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #PORTE_STANDARD_VALUE
	 * @generated
	 * @ordered
	 */
	PORTE_STANDARD(2, "PorteStandard", "PorteStandard"),

	/**
	 * The '<em><b>Porte Personalise</b></em>' literal object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #PORTE_PERSONALISE_VALUE
	 * @generated
	 * @ordered
	 */
	PORTE_PERSONALISE(3, "PortePersonalise", "PortePersonalise"), /**
	 * The '<em><b>Porte ET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PORTE_ET_VALUE
	 * @generated
	 * @ordered
	 */
	PORTE_ET(4, "PorteET", "PorteET"), /**
	 * The '<em><b>Porte OU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PORTE_OU_VALUE
	 * @generated
	 * @ordered
	 */
	PORTE_OU(5, "PorteOU", "PorteOU"), /**
	 * The '<em><b>Porte NOT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PORTE_NOT_VALUE
	 * @generated
	 * @ordered
	 */
	PORTE_NOT(6, "PorteNOT", "PorteNOT");

	/**
	 * The '<em><b>Sortie</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sortie</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SORTIE
	 * @model name="Sortie"
	 * @generated
	 * @ordered
	 */
	public static final int SORTIE_VALUE = 0;

	/**
	 * The '<em><b>Entree</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Entree</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENTREE
	 * @model name="Entree"
	 * @generated
	 * @ordered
	 */
	public static final int ENTREE_VALUE = 1;

	/**
	 * The '<em><b>Porte Standard</b></em>' literal value.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of '<em><b>Porte Standard</b></em>' literal object isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PORTE_STANDARD
	 * @model name="PorteStandard"
	 * @generated
	 * @ordered
	 */
	public static final int PORTE_STANDARD_VALUE = 2;

	/**
	 * The '<em><b>Porte Personalise</b></em>' literal value. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Porte Personalise</b></em>' literal object
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @see #PORTE_PERSONALISE
	 * @model name="PortePersonalise"
	 * @generated
	 * @ordered
	 */
	public static final int PORTE_PERSONALISE_VALUE = 3;

	/**
	 * The '<em><b>Porte ET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Porte ET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PORTE_ET
	 * @model name="PorteET"
	 * @generated
	 * @ordered
	 */
	public static final int PORTE_ET_VALUE = 4;

	/**
	 * The '<em><b>Porte OU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Porte OU</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PORTE_OU
	 * @model name="PorteOU"
	 * @generated
	 * @ordered
	 */
	public static final int PORTE_OU_VALUE = 5;

	/**
	 * The '<em><b>Porte NOT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Porte NOT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PORTE_NOT
	 * @model name="PorteNOT"
	 * @generated
	 * @ordered
	 */
	public static final int PORTE_NOT_VALUE = 6;

	/**
	 * An array of all the '<em><b>Element Type</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final ElementType[] VALUES_ARRAY = new ElementType[] {
			SORTIE,
			ENTREE,
			PORTE_STANDARD,
			PORTE_PERSONALISE,
			PORTE_ET,
			PORTE_OU,
			PORTE_NOT,
		};

	/**
	 * A public read-only list of all the '<em><b>Element Type</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ElementType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Element Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static ElementType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ElementType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Element Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static ElementType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ElementType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Element Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static ElementType get(int value) {
		switch (value) {
			case SORTIE_VALUE: return SORTIE;
			case ENTREE_VALUE: return ENTREE;
			case PORTE_STANDARD_VALUE: return PORTE_STANDARD;
			case PORTE_PERSONALISE_VALUE: return PORTE_PERSONALISE;
			case PORTE_ET_VALUE: return PORTE_ET;
			case PORTE_OU_VALUE: return PORTE_OU;
			case PORTE_NOT_VALUE: return PORTE_NOT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	private ElementType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

	public EClass toEClass() {

		if (this == ElementType.PORTE_STANDARD) {
			return CircuiteditorPackageImpl.eINSTANCE.getPorteStandard();
		} else if (this == ElementType.ENTREE) {
			return CircuiteditorPackageImpl.eINSTANCE.getEntree();
		} else if (this == ElementType.SORTIE) {
			return CircuiteditorPackageImpl.eINSTANCE.getSortie();
		} else if (this == ElementType.PORTE_ET) {
			return CircuiteditorPackageImpl.eINSTANCE.getPorteET();
		} else if (this == ElementType.PORTE_OU) {
			return CircuiteditorPackageImpl.eINSTANCE.getPorteOU();
		} else if (this == ElementType.PORTE_NOT) {
			return CircuiteditorPackageImpl.eINSTANCE.getPorteNOT();
		} else if(this == ElementType.PORTE_PERSONALISE) {
			return CircuiteditorPackageImpl.eINSTANCE.getPortePersonalise();
		}
		return null;
	}

} // ElementType
