/**
 */
package circuiteditor;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Circuit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link circuiteditor.Circuit#getFichier <em>Fichier</em>}</li>
 *   <li>{@link circuiteditor.Circuit#getCircuitElements <em>Circuit Elements</em>}</li>
 *   <li>{@link circuiteditor.Circuit#getMaxPorte <em>Max Porte</em>}</li>
 *   <li>{@link circuiteditor.Circuit#getTabledeverite <em>Tabledeverite</em>}</li>
 *   <li>{@link circuiteditor.Circuit#getHistorique <em>Historique</em>}</li>
 *   <li>{@link circuiteditor.Circuit#getMaxEntree <em>Max Entree</em>}</li>
 *   <li>{@link circuiteditor.Circuit#getMaxSortie <em>Max Sortie</em>}</li>
 * </ul>
 * </p>
 *
 * @see circuiteditor.CircuiteditorPackage#getCircuit()
 * @model
 * @generated
 */
public interface Circuit extends ElementTableVerite {
	/**
	 * Returns the value of the '<em><b>Fichier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fichier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fichier</em>' attribute.
	 * @see #setFichier(String)
	 * @see circuiteditor.CircuiteditorPackage#getCircuit_Fichier()
	 * @model
	 * @generated
	 */
	String getFichier();

	/**
	 * Sets the value of the '{@link circuiteditor.Circuit#getFichier <em>Fichier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fichier</em>' attribute.
	 * @see #getFichier()
	 * @generated
	 */
	void setFichier(String value);

	/**
	 * Returns the value of the '<em><b>Circuit Elements</b></em>' containment reference list.
	 * The list contents are of type {@link circuiteditor.ElementCircuit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Circuit Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circuit Elements</em>' containment reference list.
	 * @see circuiteditor.CircuiteditorPackage#getCircuit_CircuitElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementCircuit> getCircuitElements();

	/**
	 * Returns the value of the '<em><b>Max Porte</b></em>' attribute.
	 * The default value is <code>"50"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Porte</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Porte</em>' attribute.
	 * @see #setMaxPorte(int)
	 * @see circuiteditor.CircuiteditorPackage#getCircuit_MaxPorte()
	 * @model default="50"
	 * @generated
	 */
	int getMaxPorte();

	/**
	 * Sets the value of the '{@link circuiteditor.Circuit#getMaxPorte <em>Max Porte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Porte</em>' attribute.
	 * @see #getMaxPorte()
	 * @generated
	 */
	void setMaxPorte(int value);

	/**
	 * Returns the value of the '<em><b>Tabledeverite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tabledeverite</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tabledeverite</em>' reference.
	 * @see #setTabledeverite(TableDeVerite)
	 * @see circuiteditor.CircuiteditorPackage#getCircuit_Tabledeverite()
	 * @model required="true"
	 * @generated
	 */
	TableDeVerite getTabledeverite();

	/**
	 * Sets the value of the '{@link circuiteditor.Circuit#getTabledeverite <em>Tabledeverite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tabledeverite</em>' reference.
	 * @see #getTabledeverite()
	 * @generated
	 */
	void setTabledeverite(TableDeVerite value);

	/**
	 * Returns the value of the '<em><b>Historique</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link circuiteditor.GestionnaireHistorique#getCircuit <em>Circuit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Historique</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Historique</em>' containment reference.
	 * @see #setHistorique(GestionnaireHistorique)
	 * @see circuiteditor.CircuiteditorPackage#getCircuit_Historique()
	 * @see circuiteditor.GestionnaireHistorique#getCircuit
	 * @model opposite="circuit" containment="true" required="true"
	 * @generated
	 */
	GestionnaireHistorique getHistorique();

	/**
	 * Sets the value of the '{@link circuiteditor.Circuit#getHistorique <em>Historique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Historique</em>' containment reference.
	 * @see #getHistorique()
	 * @generated
	 */
	void setHistorique(GestionnaireHistorique value);

	/**
	 * Returns the value of the '<em><b>Max Entree</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Entree</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Entree</em>' attribute.
	 * @see #setMaxEntree(int)
	 * @see circuiteditor.CircuiteditorPackage#getCircuit_MaxEntree()
	 * @model default="5"
	 * @generated
	 */
	int getMaxEntree();

	/**
	 * Sets the value of the '{@link circuiteditor.Circuit#getMaxEntree <em>Max Entree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Entree</em>' attribute.
	 * @see #getMaxEntree()
	 * @generated
	 */
	void setMaxEntree(int value);

	/**
	 * Returns the value of the '<em><b>Max Sortie</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Sortie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Sortie</em>' attribute.
	 * @see #setMaxSortie(int)
	 * @see circuiteditor.CircuiteditorPackage#getCircuit_MaxSortie()
	 * @model default="5"
	 * @generated
	 */
	int getMaxSortie();

	/**
	 * Sets the value of the '{@link circuiteditor.Circuit#getMaxSortie <em>Max Sortie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Sortie</em>' attribute.
	 * @see #getMaxSortie()
	 * @generated
	 */
	void setMaxSortie(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean ajouter(ElementCircuit elementCircuit);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean relier(ElementCircuit elementSource, ElementCircuit elementCible);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean enlever(ElementCircuit elementCircuit);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean valider();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ElementCircuit getElement(String nomElement);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int count(ElementType type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int getMax(ElementType type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void supprimerLiaison(ElementCircuit e1, ElementCircuit e2);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void deplacer(ElementCircuit element, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean delier(ElementCircuit elementSource, ElementCircuit elementCible);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model listePorteMany="true" listeResultatMany="true"
	 * @generated
	 */
	EList<ElementCircuit> calculerListeSortie(EList<ElementCircuit> listePorte, EList<ElementCircuit> listeResultat);

} // Circuit
