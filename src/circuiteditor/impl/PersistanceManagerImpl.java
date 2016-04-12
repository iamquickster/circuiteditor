/**
 */
package circuiteditor.impl;

import circuiteditor.Circuit;
import circuiteditor.CircuiteditorPackage;
import circuiteditor.PersistanceManager;
import circuiteditor.TableDeVerite;
import java.lang.reflect.InvocationTargetException;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Persistance Manager</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PersistanceManagerImpl extends MinimalEObjectImpl.Container
		implements PersistanceManager {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PersistanceManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CircuiteditorPackage.Literals.PERSISTANCE_MANAGER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean sauvegardeXMI(Circuit circuit, String path) {
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("circuit", new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(URI.createURI(path));
		resource.getContents().add(circuit);
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void sauvegardeJPG(byte[] circuit, String path) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void sauvegardeTable(TableDeVerite table, String path) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case CircuiteditorPackage.PERSISTANCE_MANAGER___SAUVEGARDE_XMI__CIRCUIT_STRING:
				return sauvegardeXMI((Circuit)arguments.get(0), (String)arguments.get(1));
			case CircuiteditorPackage.PERSISTANCE_MANAGER___SAUVEGARDE_JPG__BYTE_STRING:
				sauvegardeJPG((byte[])arguments.get(0), (String)arguments.get(1));
				return null;
			case CircuiteditorPackage.PERSISTANCE_MANAGER___SAUVEGARDE_TABLE__TABLEDEVERITE_STRING:
				sauvegardeTable((TableDeVerite)arguments.get(0), (String)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} // PersistanceManagerImpl
