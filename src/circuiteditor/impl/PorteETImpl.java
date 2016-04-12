/**
 */
package circuiteditor.impl;

import java.util.List;
import circuiteditor.CircuiteditorPackage;
import circuiteditor.ElementCircuit;
import circuiteditor.ElementTableVerite;
import circuiteditor.LigneTableDeVerite;
import circuiteditor.PorteET;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Porte ET</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PorteETImpl extends PorteStandardImpl implements PorteET {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PorteETImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public EList<LigneTableDeVerite> evaluer() {
		int nbLignes = (int) Math.round(Math.pow(2, getEntree().size()));
		BasicEList<LigneTableDeVerite> result = new UniqueEList<LigneTableDeVerite>(
				nbLignes);
		List<List<LigneTableDeVerite>> tables = new BasicEList<List<LigneTableDeVerite>>();
		for (ElementCircuit entree : getEntree()) {
			if (entree instanceof ElementTableVerite) {
				ElementTableVerite etv = (ElementTableVerite) entree;
				EList<LigneTableDeVerite> tdv = etv.evaluer();
				tables.add(tdv);
			}
		}
		for (List<LigneTableDeVerite> table1 : tables) {
			for (LigneTableDeVerite ligne1 : table1) {
				for (List<LigneTableDeVerite> table2 : tables) {
					if(table2 == table1) {
						continue;
					}
					for (LigneTableDeVerite ligne2 : table2){
						LigneTableDeVerite ltv = CircuiteditorFactoryImpl.eINSTANCE.createLigneTableDeVerite();
						ltv.getEntrees().addAll(ligne1.getSorties());
						ltv.getEntrees().addAll(ligne2.getSorties());
						ltv.getSorties().add(evaluer(ltv.getEntrees()));
						
						result.add(ltv);
					}
				}
			}
		}
		

		return result;
	}

	private boolean evaluer(EList<Boolean> entrees) {

		boolean result = true;

		for (Boolean entree : entrees) {
			result &= entree;
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public EList<Boolean> calculListeEntreeBoolean(int longueurListe, int valeur) {
		EList<Boolean> liste = new EDataTypeUniqueEList<Boolean>(Boolean.class,
				this, CircuiteditorPackage.LIGNE_TABLE_DE_VERITE__ENTREES);
		String resultat = Integer.toBinaryString(valeur);

		while (longueurListe > resultat.length()) {
			liste.add(false);
			longueurListe--;
		}

		for (int i = 0; i < resultat.length(); i++) {
			if (resultat.charAt(i) == '0')
				liste.add(false);
			else
				liste.add(true);
		}

		return liste;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircuiteditorPackage.Literals.PORTE_ET;
	}
	

	@Override
	public boolean valider() {
		if(getEntree().size() == 2 && getSortie().size() > 0) {
			return true;
		}
		return false;
	}


} // PorteETImpl
