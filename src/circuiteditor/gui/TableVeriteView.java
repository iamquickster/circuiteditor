package circuiteditor.gui;

import circuiteditor.Circuit;
import circuiteditor.ElementCircuit;
import circuiteditor.ElementTableVerite;
import circuiteditor.LigneTableDeVerite;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.TableColumnModelListener;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class TableVeriteView extends AdapterImpl {

	private final static String TITLE = "Table de v�rit�";
	private static final String NON_DISPONIBLE = "ND";
	private JFrame src;
	private JFrame frame;
	private JTable table;
	private JButton refreshButton;

	public TableVeriteView() {

		/*
		 * Fenetre comportant le tableau
		 */
		frame = new JFrame("Table V�rit�");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		/*
		 * Tableau
		 */

		table = new JTable();

		JScrollPane scrollPane = new JScrollPane(table);
		frame.add(scrollPane, BorderLayout.CENTER);
		frame.setSize(300, 150);
		frame.setVisible(true);
		
		refreshButton = new JButton("Actualiser");
		refreshButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				actualiserTable();
			}
		});
		frame.add(refreshButton, BorderLayout.PAGE_END);

	}

	/*
	 * actualiserTable
	 */
	public void actualiserTable() {

		resetData();
		refreshButton.setEnabled(false);
		Circuit circuit = (Circuit) this.getTarget();
		if (circuit.valider()) {
			refreshButton.setEnabled(true);
			circuit.getTableVerite().calculerTable();
			EList<LigneTableDeVerite> lignes = circuit.getTableVerite()
					.getPossede();

			int nbEntree = circuit.getEntree().size();
			int nbLigne = (int) Math.pow(2, nbEntree);
			int nbColonnes = circuit.getEntree().size()
					+ circuit.getSortie().size();

			DefaultTableModel model = (DefaultTableModel) table.getModel();


			for (int k = nbEntree; k > 0; --k) {
				int pos = (int) Math.pow(2, nbEntree - k + 1);

				for (int i = 0; i < nbLigne;) {

					for (int j = 0; j < pos / 2; j++) {
							model.setValueAt(true, i, k - 1);
							i++;
					}
					for (int j = 0; j < pos / 2; j++) {
					model.setValueAt(false, i, k - 1);
					i++;
					}

				}
			}

			for (int i = 0; i < nbLigne; i++) {
				for (int j = 0; j < circuit.getSortie().size(); j++) {
					model.setValueAt(lignes.get(i).getSorties(), i, circuit
							.getEntree().size() + j);

				}
			}
			table.setModel(model);
		}
	}

	private void resetData() {
		Circuit circuit = (Circuit) getTarget();
		int nbLigne = (int) (Math
				.round(Math.pow(2, circuit.getEntree().size())));
		int nbColonne = circuit.getEntree().size() + circuit.getSortie().size();
		Object data[][] = new Object[nbLigne][nbColonne];
		for (int i = 0; i < nbColonne; i++) {
			for (int j = 0; j < nbLigne; j++) {
				data[j][i] = NON_DISPONIBLE;
			}
		}
		List<Object> headers = new ArrayList<Object>();
		for (ElementCircuit elem : circuit.getEntree()) {
			headers.add(elem.getName());
		}
		for (ElementCircuit elem : circuit.getSortie()) {
			headers.add(elem.getName());
		}
		table.setModel(new DefaultTableModel(data, headers.toArray()));
	}

	/*
	 * notifyChanged
	 */
	@Override
	public void notifyChanged(Notification notification) {
		if (CircuitEditorMainView.getInstance().getOutilPanel()
				.getOutilSelectioner() == Outil.DEPLACER) {
			return;
		}
		actualiserTable();

	}

}
