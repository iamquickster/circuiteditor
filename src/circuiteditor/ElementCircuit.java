/**
 */
package circuiteditor;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Element Circuit</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link circuiteditor.ElementCircuit#getEmplacementX <em>Emplacement X</em>}</li>
 *   <li>{@link circuiteditor.ElementCircuit#getEmplacementY <em>Emplacement Y</em>}</li>
 *   <li>{@link circuiteditor.ElementCircuit#getName <em>Name</em>}</li>
 *   <li>{@link circuiteditor.ElementCircuit#getDescription <em>Description</em>}</li>
 *   <li>{@link circuiteditor.ElementCircuit#getSourceMax <em>Source Max</em>}</li>
 *   <li>{@link circuiteditor.ElementCircuit#getCibleMax <em>Cible Max</em>}</li>
 *   <li>{@link circuiteditor.ElementCircuit#isEstCircuitValide <em>Est Circuit Valide</em>}</li>
 *   <li>{@link circuiteditor.ElementCircuit#isEstModifier <em>Est Modifier</em>}</li>
 *   <li>{@link circuiteditor.ElementCircuit#getType <em>Type</em>}</li>
 *   <li>{@link circuiteditor.ElementCircuit#getEntree <em>Entree</em>}</li>
 *   <li>{@link circuiteditor.ElementCircuit#getSortie <em>Sortie</em>}</li>
 * </ul>
 * </p>
 *
 * @see circuiteditor.CircuiteditorPackage#getElementCircuit()
 * @model abstract="true"
 * @generated
 */
public interface ElementCircuit extends EObject {
	/**
	 * Returns the value of the '<em><b>Emplacement X</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emplacement X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Emplacement X</em>' attribute.
	 * @see #setEmplacementX(int)
	 * @see circuiteditor.CircuiteditorPackage#getElementCircuit_EmplacementX()
	 * @model
	 * @generated
	 */
	int getEmplacementX();

	/**
	 * Sets the value of the '{@link circuiteditor.ElementCircuit#getEmplacementX <em>Emplacement X</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Emplacement X</em>' attribute.
	 * @see #getEmplacementX()
	 * @generated
	 */
	void setEmplacementX(int value);

	/**
	 * Returns the value of the '<em><b>Emplacement Y</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emplacement Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Emplacement Y</em>' attribute.
	 * @see #setEmplacementY(int)
	 * @see circuiteditor.CircuiteditorPackage#getElementCircuit_EmplacementY()
	 * @model
	 * @generated
	 */
	int getEmplacementY();

	/**
	 * Sets the value of the '{@link circuiteditor.ElementCircuit#getEmplacementY <em>Emplacement Y</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Emplacement Y</em>' attribute.
	 * @see #getEmplacementY()
	 * @generated
	 */
	void setEmplacementY(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see circuiteditor.CircuiteditorPackage#getElementCircuit_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link circuiteditor.ElementCircuit#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see circuiteditor.CircuiteditorPackage#getElementCircuit_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link circuiteditor.ElementCircuit#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Source Max</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Max</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Max</em>' attribute.
	 * @see #setSourceMax(int)
	 * @see circuiteditor.CircuiteditorPackage#getElementCircuit_SourceMax()
	 * @model default="0"
	 * @generated
	 */
	int getSourceMax();

	/**
	 * Sets the value of the '{@link circuiteditor.ElementCircuit#getSourceMax <em>Source Max</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Source Max</em>' attribute.
	 * @see #getSourceMax()
	 * @generated
	 */
	void setSourceMax(int value);

	/**
	 * Returns the value of the '<em><b>Cible Max</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cible Max</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cible Max</em>' attribute.
	 * @see #setCibleMax(int)
	 * @see circuiteditor.CircuiteditorPackage#getElementCircuit_CibleMax()
	 * @model default="0"
	 * @generated
	 */
	int getCibleMax();

	/**
	 * Sets the value of the '{@link circuiteditor.ElementCircuit#getCibleMax
	 * <em>Cible Max</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Cible Max</em>' attribute.
	 * @see #getCibleMax()
	 * @generated
	 */
	void setCibleMax(int value);

	/**
	 * Returns the value of the '<em><b>Est Circuit Valide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Circuit Valide</em>' attribute isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Circuit Valide</em>' attribute.
	 * @see #setEstCircuitValide(boolean)
	 * @see circuiteditor.CircuiteditorPackage#getElementCircuit_EstCircuitValide()
	 * @model
	 * @generated
	 */
	boolean isEstCircuitValide();

	/**
	 * Sets the value of the '{@link circuiteditor.ElementCircuit#isEstCircuitValide <em>Est Circuit Valide</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Est Circuit Valide</em>' attribute.
	 * @see #isEstCircuitValide()
	 * @generated
	 */
	void setEstCircuitValide(boolean value);

	/**
	 * Returns the value of the '<em><b>Est Modifier</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Modifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Est Modifier</em>' attribute.
	 * @see #setEstModifier(boolean)
	 * @see circuiteditor.CircuiteditorPackage#getElementCircuit_EstModifier()
	 * @model
	 * @generated
	 */
	boolean isEstModifier();

	/**
	 * Sets the value of the '{@link circuiteditor.ElementCircuit#isEstModifier <em>Est Modifier</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Est Modifier</em>' attribute.
	 * @see #isEstModifier()
	 * @generated
	 */
	void setEstModifier(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute. The literals
	 * are from the enumeration {@link circuiteditor.ElementType}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see circuiteditor.ElementType
	 * @see #setType(ElementType)
	 * @see circuiteditor.CircuiteditorPackage#getElementCircuit_Type()
	 * @model
	 * @generated
	 */
	ElementType getType();

	/**
	 * Sets the value of the '{@link circuiteditor.ElementCircuit#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see circuiteditor.ElementType
	 * @see #getType()
	 * @generated
	 */
	void setType(ElementType value);

	/**
	 * Returns the value of the '<em><b>Entree</b></em>' reference list. The
	 * list contents are of type {@link circuiteditor.ElementCircuit}. It is
	 * bidirectional and its opposite is '
	 * {@link circuiteditor.ElementCircuit#getSortie <em>Sortie</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entree</em>' reference list isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Entree</em>' reference list.
	 * @see circuiteditor.CircuiteditorPackage#getElementCircuit_Entree()
	 * @see circuiteditor.ElementCircuit#getSortie
	 * @model opposite="sortie"
	 * @generated
	 */
	EList<ElementCircuit> getEntree();

	/**
	 * Returns the value of the '<em><b>Sortie</b></em>' reference list. The
	 * list contents are of type {@link circuiteditor.ElementCircuit}. It is
	 * bidirectional and its opposite is '
	 * {@link circuiteditor.ElementCircuit#getEntree <em>Entree</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sortie</em>' reference list isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Sortie</em>' reference list.
	 * @see circuiteditor.CircuiteditorPackage#getElementCircuit_Sortie()
	 * @see circuiteditor.ElementCircuit#getEntree
	 * @model opposite="entree"
	 * @generated
	 */
	EList<ElementCircuit> getSortie();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean valider();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model kind="operation" many="false"
	 * @generated
	 */
	EList<?> getLiaisons();

} // ElementCircuit
