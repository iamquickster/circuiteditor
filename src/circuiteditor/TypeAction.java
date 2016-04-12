/**
 */
package circuiteditor;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Action</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see circuiteditor.CircuiteditorPackage#getTypeAction()
 * @model
 * @generated
 */
public enum TypeAction implements Enumerator {
	/**
	 * The '<em><b>AJOUTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AJOUTER_VALUE
	 * @generated
	 * @ordered
	 */
	AJOUTER(0, "AJOUTER", "AJOUTER"),

	/**
	 * The '<em><b>SUPPRIMER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPPRIMER_VALUE
	 * @generated
	 * @ordered
	 */
	SUPPRIMER(0, "SUPPRIMER", "SUPPRIMER"),

	/**
	 * The '<em><b>DEPLACER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPLACER_VALUE
	 * @generated
	 * @ordered
	 */
	DEPLACER(0, "DEPLACER", "DEPLACER");

	/**
	 * The '<em><b>AJOUTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AJOUTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AJOUTER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AJOUTER_VALUE = 0;

	/**
	 * The '<em><b>SUPPRIMER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SUPPRIMER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUPPRIMER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUPPRIMER_VALUE = 0;

	/**
	 * The '<em><b>DEPLACER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEPLACER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEPLACER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEPLACER_VALUE = 0;

	/**
	 * An array of all the '<em><b>Type Action</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeAction[] VALUES_ARRAY =
		new TypeAction[] {
			AJOUTER,
			SUPPRIMER,
			DEPLACER,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Action</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeAction> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Action</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeAction get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeAction result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Action</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeAction getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeAction result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Action</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeAction get(int value) {
		switch (value) {
			case AJOUTER_VALUE: return AJOUTER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TypeAction(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TypeAction
