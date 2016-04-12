/**
 */
package circuiteditor.impl;

import circuiteditor.Circuit;
import circuiteditor.CircuiteditorPackage;
import circuiteditor.ElementCircuit;
import circuiteditor.Sortie;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sortie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SortieImpl extends ElementCircuitImpl implements Sortie {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SortieImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircuiteditorPackage.Literals.SORTIE;
	}
	
	@Override
	public boolean valider() {
		if(getEntree().size() > 0 ) {
			for (ElementCircuit elem : getEntree()) {
				if(elem instanceof Circuit) {
					continue;
				}
				return true;
				
			}

		}
		return false;
	}

} //SortieImpl
