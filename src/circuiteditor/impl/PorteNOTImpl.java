/**
 */
package circuiteditor.impl;

import java.util.List;
import circuiteditor.CircuiteditorPackage;
import circuiteditor.ElementCircuit;
import circuiteditor.ElementTableVerite;
import circuiteditor.LigneTableDeVerite;
import circuiteditor.PorteNOT;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Porte NOT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PorteNOTImpl extends PorteStandardImpl implements PorteNOT {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PorteNOTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircuiteditorPackage.Literals.PORTE_NOT;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<LigneTableDeVerite> evaluer() {
		int nbLignes = (int) Math.round(Math.pow(2, getEntree().size()));
		BasicEList<LigneTableDeVerite> result = new BasicEList<LigneTableDeVerite>(
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

						LigneTableDeVerite ltv = CircuiteditorFactoryImpl.eINSTANCE.createLigneTableDeVerite();
						ltv.getEntrees().addAll(ligne1.getSorties());
						ltv.getSorties().add(evaluer(ltv.getEntrees()));
						
						result.add(ltv);

			}
		}
		

		return result;
	}

	private boolean evaluer(EList<Boolean> entrees) {
		return !entrees.get(0);
	}
	

	@Override
	public boolean valider() {
		if(getEntree().size() == 1 && getSortie().size() > 0) {
			return true;
		}
		return false;
	}


} //PorteNOTImpl
