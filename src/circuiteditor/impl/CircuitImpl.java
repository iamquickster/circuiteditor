/**
 */
package circuiteditor.impl;

import circuiteditor.ActionDeplacerElement;
import circuiteditor.ActionLiaison;
import circuiteditor.Circuit;
import circuiteditor.CircuiteditorPackage;
import circuiteditor.ElementCircuit;
import circuiteditor.ElementTableVerite;
import circuiteditor.ElementType;
import circuiteditor.Entree;
import circuiteditor.GestionnaireHistorique;
import circuiteditor.LigneTableDeVerite;
import circuiteditor.Sortie;
import circuiteditor.TableDeVerite;
import circuiteditor.TypeAction;
import circuiteditor.gui.CircuitEditorMainView;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Circuit</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link circuiteditor.impl.CircuitImpl#getTableVerite <em>Table Verite</em>}</li>
 *   <li>{@link circuiteditor.impl.CircuitImpl#getFichier <em>Fichier</em>}</li>
 *   <li>{@link circuiteditor.impl.CircuitImpl#getCircuitElements <em>Circuit Elements</em>}</li>
 *   <li>{@link circuiteditor.impl.CircuitImpl#getMaxPorte <em>Max Porte</em>}</li>
 *   <li>{@link circuiteditor.impl.CircuitImpl#getTabledeverite <em>Tabledeverite</em>}</li>
 *   <li>{@link circuiteditor.impl.CircuitImpl#getHistorique <em>Historique</em>}</li>
 *   <li>{@link circuiteditor.impl.CircuitImpl#getMaxEntree <em>Max Entree</em>}</li>
 *   <li>{@link circuiteditor.impl.CircuitImpl#getMaxSortie <em>Max Sortie</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CircuitImpl extends ElementCircuitImpl implements Circuit {
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
	 * The default value of the '{@link #getFichier() <em>Fichier</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFichier()
	 * @generated
	 * @ordered
	 */
	protected static final String FICHIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFichier() <em>Fichier</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFichier()
	 * @generated
	 * @ordered
	 */
	protected String fichier = FICHIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCircuitElements()
	 * <em>Circuit Elements</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCircuitElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementCircuit> circuitElements;

	/**
	 * The default value of the '{@link #getMaxPorte() <em>Max Porte</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMaxPorte()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_PORTE_EDEFAULT = 50;

	/**
	 * The cached value of the '{@link #getMaxPorte() <em>Max Porte</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMaxPorte()
	 * @generated
	 * @ordered
	 */
	protected int maxPorte = MAX_PORTE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTabledeverite() <em>Tabledeverite</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getTabledeverite()
	 * @generated
	 * @ordered
	 */
	protected TableDeVerite tabledeverite;

	/**
	 * The cached value of the '{@link #getHistorique() <em>Historique</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getHistorique()
	 * @generated
	 * @ordered
	 */
	protected GestionnaireHistorique historique;

	/**
	 * The default value of the '{@link #getMaxEntree() <em>Max Entree</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMaxEntree()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_ENTREE_EDEFAULT = 5;

	/**
	 * The cached value of the '{@link #getMaxEntree() <em>Max Entree</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMaxEntree()
	 * @generated
	 * @ordered
	 */
	protected int maxEntree = MAX_ENTREE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxSortie() <em>Max Sortie</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMaxSortie()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_SORTIE_EDEFAULT = 5;

	/**
	 * The cached value of the '{@link #getMaxSortie() <em>Max Sortie</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMaxSortie()
	 * @generated
	 * @ordered
	 */
	protected int maxSortie = MAX_SORTIE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected CircuitImpl() {
		super();
		setHistorique(CircuiteditorFactoryImpl.eINSTANCE
				.createGestionnaireHistorique());
		setTableVerite(CircuiteditorFactoryImpl.eINSTANCE.createTableDeVerite());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircuiteditorPackage.Literals.CIRCUIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableDeVerite getTableVerite() {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CircuiteditorPackage.CIRCUIT__TABLE_VERITE, oldTableVerite, newTableVerite);
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
			eNotify(new ENotificationImpl(this, Notification.SET, CircuiteditorPackage.CIRCUIT__TABLE_VERITE, newTableVerite, newTableVerite));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getFichier() {
		return fichier;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setFichier(String newFichier) {
		String oldFichier = fichier;
		fichier = newFichier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircuiteditorPackage.CIRCUIT__FICHIER, oldFichier, fichier));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementCircuit> getCircuitElements() {
		if (circuitElements == null) {
			circuitElements = new EObjectContainmentEList<ElementCircuit>(ElementCircuit.class, this, CircuiteditorPackage.CIRCUIT__CIRCUIT_ELEMENTS);
		}
		return circuitElements;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxPorte() {
		return maxPorte;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxPorte(int newMaxPorte) {
		int oldMaxPorte = maxPorte;
		maxPorte = newMaxPorte;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircuiteditorPackage.CIRCUIT__MAX_PORTE, oldMaxPorte, maxPorte));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TableDeVerite getTabledeverite() {
		if (tabledeverite != null && tabledeverite.eIsProxy()) {
			InternalEObject oldTabledeverite = (InternalEObject)tabledeverite;
			tabledeverite = (TableDeVerite)eResolveProxy(oldTabledeverite);
			if (tabledeverite != oldTabledeverite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CircuiteditorPackage.CIRCUIT__TABLEDEVERITE, oldTabledeverite, tabledeverite));
			}
		}
		return tabledeverite;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TableDeVerite basicGetTabledeverite() {
		return tabledeverite;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTabledeverite(TableDeVerite newTabledeverite) {
		TableDeVerite oldTabledeverite = tabledeverite;
		tabledeverite = newTabledeverite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircuiteditorPackage.CIRCUIT__TABLEDEVERITE, oldTabledeverite, tabledeverite));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public GestionnaireHistorique getHistorique() {
		return historique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHistorique(GestionnaireHistorique newHistorique, NotificationChain msgs) {
		GestionnaireHistorique oldHistorique = historique;
		historique = newHistorique;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CircuiteditorPackage.CIRCUIT__HISTORIQUE, oldHistorique, newHistorique);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setHistorique(GestionnaireHistorique newHistorique) {
		if (newHistorique != historique) {
			NotificationChain msgs = null;
			if (historique != null)
				msgs = ((InternalEObject)historique).eInverseRemove(this, CircuiteditorPackage.GESTIONNAIRE_HISTORIQUE__CIRCUIT, GestionnaireHistorique.class, msgs);
			if (newHistorique != null)
				msgs = ((InternalEObject)newHistorique).eInverseAdd(this, CircuiteditorPackage.GESTIONNAIRE_HISTORIQUE__CIRCUIT, GestionnaireHistorique.class, msgs);
			msgs = basicSetHistorique(newHistorique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircuiteditorPackage.CIRCUIT__HISTORIQUE, newHistorique, newHistorique));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxEntree() {
		return maxEntree;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxEntree(int newMaxEntree) {
		int oldMaxEntree = maxEntree;
		maxEntree = newMaxEntree;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircuiteditorPackage.CIRCUIT__MAX_ENTREE, oldMaxEntree, maxEntree));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxSortie() {
		return maxSortie;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxSortie(int newMaxSortie) {
		int oldMaxSortie = maxSortie;
		maxSortie = newMaxSortie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CircuiteditorPackage.CIRCUIT__MAX_SORTIE, oldMaxSortie, maxSortie));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean ajouter(ElementCircuit elementCircuit) {
		int nbType = count(elementCircuit.getType());
		if (nbType < max(elementCircuit.getType())) {

			getCircuitElements().add(elementCircuit);

			if(elementCircuit instanceof Entree) {
				elementCircuit.getSortie().add(this);
			} else if(elementCircuit instanceof Sortie) {
				elementCircuit.getEntree().add(this);
			}
			

			return true;
		} else {
			return false;
		}
	}

	private int max(ElementType type) {
		if (type == ElementType.ENTREE) {
			return maxEntree;
		} else if (type == ElementType.SORTIE) {
			return maxSortie;
		} else if (type == ElementType.PORTE_STANDARD) {
			return maxPorte;
		} else if (type == ElementType.PORTE_PERSONALISE) {
			return maxPorte;
		}
		return 0;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean relier(ElementCircuit elementSource,
			ElementCircuit elementCible) {
		
		List<List<ElementCircuit>> oldElements = new ArrayList<List<ElementCircuit>>(2);
		oldElements.add(new ArrayList<ElementCircuit>(elementSource.getSortie()));
		oldElements.add(new ArrayList<ElementCircuit>(elementSource.getEntree()));
		ActionLiaison a1 = CircuiteditorFactoryImpl.eINSTANCE
				.createActionLiaison();
		a1.setSource(elementSource);
		a1.setCible(elementCible);
		getHistorique().enregistrerAction(a1);
		
		elementSource.getSortie().add(elementCible);
		elementCible.getEntree().add(elementSource);
		List<List<ElementCircuit>> newElements = new ArrayList<List<ElementCircuit>>(2);
		newElements.add(elementSource.getSortie());
		newElements.add(elementCible.getEntree());
		
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.ADD, CircuiteditorPackage.ACTION_ELEMENT_CIRCUIT__LIAISONS_MODIFIEES, oldElements, maxSortie));

		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean enlever(ElementCircuit elementCircuit) {

		EList<ElementCircuit> entrees = elementCircuit.getEntree();
		for (int i = entrees.size() ; i > 0 ; i--) {
			ElementCircuit entree = entrees.get(i-1);
			if(entree == this){
				continue;
			} else {
				entree.getSortie().remove(elementCircuit);
			}
		}
		EList<ElementCircuit> sorties = elementCircuit.getSortie();
		for (int i = sorties.size(); i > 0 ; i--) {
			ElementCircuit sortie = sorties.get(i-1);
			if(sortie == this){
				continue;
			} else {
				sortie.getEntree().remove(elementCircuit);
			}
		}
		
		getEntree().remove(elementCircuit);
		getSortie().remove(elementCircuit);
		
		getCircuitElements().remove(elementCircuit);

		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public ElementCircuit getElement(String nomElement) {

		for (ElementCircuit element : getCircuitElements()) {
			if (element.getName().equals(nomElement)) {
				return element;
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public int count(ElementType type) {
		int compteur = 0;

		for (ListIterator<ElementCircuit> iter = getCircuitElements()
				.listIterator(); iter.hasNext();) {
			ElementCircuit element = iter.next();
			if (element.getType().equals(type)) {
				compteur++;
			}
		}

		return compteur;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public int getMax(ElementType type) {
		if (type.equals(ElementType.SORTIE))
			return maxSortie;
		if (type.equals(ElementType.ENTREE))
			return maxEntree;
		if (type.equals(ElementType.PORTE_STANDARD)
				|| type.equals(ElementType.PORTE_PERSONALISE))
			return maxPorte;

		return 0;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void supprimerLiaison(ElementCircuit e1, ElementCircuit e2) {
		ActionLiaison a1 = CircuiteditorFactoryImpl.eINSTANCE
				.createActionLiaison();
		a1.setType(TypeAction.SUPPRIMER);
		a1.setCible(e1);
		a1.setSource(e2);
		historique.enregistrerAction(a1);

		e1.getLiaisons().remove(e2);
		e2.getLiaisons().remove(e1);

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void deplacer(ElementCircuit element, int x, int y) {
		int oldX = element.getEmplacementX();
		int oldY = element.getEmplacementY();
		
		ElementCircuit elem = getElement(element.getName());
		elem.setEmplacementX(x);
		elem.setEmplacementY(y);
		
		ActionDeplacerElement a1 = CircuiteditorFactoryImpl.eINSTANCE.createActionDeplacerElement();
		a1.setElementModifie(element);
		a1.setType(TypeAction.DEPLACER);
		a1.setX(oldX);
		a1.setY(oldY);
		a1.setDone(true);
		getHistorique().enregistrerAction(a1);

		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					CircuiteditorPackage.CIRCUIT___DEPLACER__ELEMENTCIRCUIT_INT_INT,
					element, elem));

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean delier(ElementCircuit elementSource, ElementCircuit elementCible) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}


	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public boolean valider() {
		ElementCircuit element = null;

		for (ListIterator<ElementCircuit> iter = getCircuitElements().listIterator(); iter
				.hasNext();) {
			element = iter.next();
			if (!element.valider())
				return false;
		}

		return true;

	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<LigneTableDeVerite> evaluer() {
		EList<LigneTableDeVerite> lignes = new BasicEList<LigneTableDeVerite>();
		
		for(ElementCircuit elem: getSortie()) {
			for(ElementCircuit entree : elem.getEntree()) {
				if(!(entree instanceof Circuit) && (entree instanceof ElementTableVerite)) {
					ElementTableVerite elemTV = (ElementTableVerite) entree;
					lignes.addAll(elemTV.evaluer());
				}
			}
		}
		
		return lignes;
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
	public EList<ElementCircuit> calculerListeSortie(EList<ElementCircuit> listePorte, EList<ElementCircuit> listeResultat) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}
	
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CircuiteditorPackage.CIRCUIT__TABLE_VERITE:
				if (tableVerite != null)
					msgs = ((InternalEObject)tableVerite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CircuiteditorPackage.CIRCUIT__TABLE_VERITE, null, msgs);
				return basicSetTableVerite((TableDeVerite)otherEnd, msgs);
			case CircuiteditorPackage.CIRCUIT__HISTORIQUE:
				if (historique != null)
					msgs = ((InternalEObject)historique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CircuiteditorPackage.CIRCUIT__HISTORIQUE, null, msgs);
				return basicSetHistorique((GestionnaireHistorique)otherEnd, msgs);
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
			case CircuiteditorPackage.CIRCUIT__TABLE_VERITE:
				return basicSetTableVerite(null, msgs);
			case CircuiteditorPackage.CIRCUIT__CIRCUIT_ELEMENTS:
				return ((InternalEList<?>)getCircuitElements()).basicRemove(otherEnd, msgs);
			case CircuiteditorPackage.CIRCUIT__HISTORIQUE:
				return basicSetHistorique(null, msgs);
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
			case CircuiteditorPackage.CIRCUIT__TABLE_VERITE:
				return getTableVerite();
			case CircuiteditorPackage.CIRCUIT__FICHIER:
				return getFichier();
			case CircuiteditorPackage.CIRCUIT__CIRCUIT_ELEMENTS:
				return getCircuitElements();
			case CircuiteditorPackage.CIRCUIT__MAX_PORTE:
				return getMaxPorte();
			case CircuiteditorPackage.CIRCUIT__TABLEDEVERITE:
				if (resolve) return getTabledeverite();
				return basicGetTabledeverite();
			case CircuiteditorPackage.CIRCUIT__HISTORIQUE:
				return getHistorique();
			case CircuiteditorPackage.CIRCUIT__MAX_ENTREE:
				return getMaxEntree();
			case CircuiteditorPackage.CIRCUIT__MAX_SORTIE:
				return getMaxSortie();
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
			case CircuiteditorPackage.CIRCUIT__TABLE_VERITE:
				setTableVerite((TableDeVerite)newValue);
				return;
			case CircuiteditorPackage.CIRCUIT__FICHIER:
				setFichier((String)newValue);
				return;
			case CircuiteditorPackage.CIRCUIT__CIRCUIT_ELEMENTS:
				getCircuitElements().clear();
				getCircuitElements().addAll((Collection<? extends ElementCircuit>)newValue);
				return;
			case CircuiteditorPackage.CIRCUIT__MAX_PORTE:
				setMaxPorte((Integer)newValue);
				return;
			case CircuiteditorPackage.CIRCUIT__TABLEDEVERITE:
				setTabledeverite((TableDeVerite)newValue);
				return;
			case CircuiteditorPackage.CIRCUIT__HISTORIQUE:
				setHistorique((GestionnaireHistorique)newValue);
				return;
			case CircuiteditorPackage.CIRCUIT__MAX_ENTREE:
				setMaxEntree((Integer)newValue);
				return;
			case CircuiteditorPackage.CIRCUIT__MAX_SORTIE:
				setMaxSortie((Integer)newValue);
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
			case CircuiteditorPackage.CIRCUIT__TABLE_VERITE:
				setTableVerite((TableDeVerite)null);
				return;
			case CircuiteditorPackage.CIRCUIT__FICHIER:
				setFichier(FICHIER_EDEFAULT);
				return;
			case CircuiteditorPackage.CIRCUIT__CIRCUIT_ELEMENTS:
				getCircuitElements().clear();
				return;
			case CircuiteditorPackage.CIRCUIT__MAX_PORTE:
				setMaxPorte(MAX_PORTE_EDEFAULT);
				return;
			case CircuiteditorPackage.CIRCUIT__TABLEDEVERITE:
				setTabledeverite((TableDeVerite)null);
				return;
			case CircuiteditorPackage.CIRCUIT__HISTORIQUE:
				setHistorique((GestionnaireHistorique)null);
				return;
			case CircuiteditorPackage.CIRCUIT__MAX_ENTREE:
				setMaxEntree(MAX_ENTREE_EDEFAULT);
				return;
			case CircuiteditorPackage.CIRCUIT__MAX_SORTIE:
				setMaxSortie(MAX_SORTIE_EDEFAULT);
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
			case CircuiteditorPackage.CIRCUIT__TABLE_VERITE:
				return tableVerite != null;
			case CircuiteditorPackage.CIRCUIT__FICHIER:
				return FICHIER_EDEFAULT == null ? fichier != null : !FICHIER_EDEFAULT.equals(fichier);
			case CircuiteditorPackage.CIRCUIT__CIRCUIT_ELEMENTS:
				return circuitElements != null && !circuitElements.isEmpty();
			case CircuiteditorPackage.CIRCUIT__MAX_PORTE:
				return maxPorte != MAX_PORTE_EDEFAULT;
			case CircuiteditorPackage.CIRCUIT__TABLEDEVERITE:
				return tabledeverite != null;
			case CircuiteditorPackage.CIRCUIT__HISTORIQUE:
				return historique != null;
			case CircuiteditorPackage.CIRCUIT__MAX_ENTREE:
				return maxEntree != MAX_ENTREE_EDEFAULT;
			case CircuiteditorPackage.CIRCUIT__MAX_SORTIE:
				return maxSortie != MAX_SORTIE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case CircuiteditorPackage.CIRCUIT___AJOUTER__ELEMENTCIRCUIT:
				return ajouter((ElementCircuit)arguments.get(0));
			case CircuiteditorPackage.CIRCUIT___RELIER__ELEMENTCIRCUIT_ELEMENTCIRCUIT:
				return relier((ElementCircuit)arguments.get(0), (ElementCircuit)arguments.get(1));
			case CircuiteditorPackage.CIRCUIT___ENLEVER__ELEMENTCIRCUIT:
				return enlever((ElementCircuit)arguments.get(0));
			case CircuiteditorPackage.CIRCUIT___GET_ELEMENT__STRING:
				return getElement((String)arguments.get(0));
			case CircuiteditorPackage.CIRCUIT___COUNT__ELEMENTTYPE:
				return count((ElementType)arguments.get(0));
			case CircuiteditorPackage.CIRCUIT___GET_MAX__ELEMENTTYPE:
				return getMax((ElementType)arguments.get(0));
			case CircuiteditorPackage.CIRCUIT___SUPPRIMER_LIAISON__ELEMENTCIRCUIT_ELEMENTCIRCUIT:
				supprimerLiaison((ElementCircuit)arguments.get(0), (ElementCircuit)arguments.get(1));
				return null;
			case CircuiteditorPackage.CIRCUIT___DEPLACER__ELEMENTCIRCUIT_INT_INT:
				deplacer((ElementCircuit)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case CircuiteditorPackage.CIRCUIT___DELIER__ELEMENTCIRCUIT_ELEMENTCIRCUIT:
				return delier((ElementCircuit)arguments.get(0), (ElementCircuit)arguments.get(1));
			case CircuiteditorPackage.CIRCUIT___CALCULER_LISTE_SORTIE__ELIST_ELIST:
				return calculerListeSortie((EList<ElementCircuit>)arguments.get(0), (EList<ElementCircuit>)arguments.get(1));
			case CircuiteditorPackage.CIRCUIT___EVALUER:
				return evaluer();
			case CircuiteditorPackage.CIRCUIT___CALCUL_LISTE_ENTREE_BOOLEAN__INT_INT:
				return calculListeEntreeBoolean((Integer)arguments.get(0), (Integer)arguments.get(1));
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
		result.append(" (fichier: ");
		result.append(fichier);
		result.append(", maxPorte: ");
		result.append(maxPorte);
		result.append(", maxEntree: ");
		result.append(maxEntree);
		result.append(", maxSortie: ");
		result.append(maxSortie);
		result.append(')');
		return result.toString();
	}

} // CircuitImpl
