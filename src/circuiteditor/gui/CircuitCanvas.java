package circuiteditor.gui;

import circuiteditor.Circuit;
import circuiteditor.CircuitEditor;
import circuiteditor.ElementCircuit;
import circuiteditor.ElementType;
import circuiteditor.Entree;
import circuiteditor.PorteStandard;
import circuiteditor.Sortie;
import circuiteditor.Porte;
import circuiteditor.impl.CircuiteditorFactoryImpl;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class CircuitCanvas extends AdapterImpl implements MouseListener {

	public class CanvasPanel extends JPanel {
		/**
		 * 
		 */
		private static final long serialVersionUID = 9130651340523094654L;

		public CanvasPanel() {
			super(null);
			super.setOpaque(false);
			super.setBackground(Color.WHITE);
		}

		@Override
		protected void paintComponent(Graphics g) {
			elementGraphic.clear();
			canvasPnl.removeAll();
			Circuit model = CircuitEditorMainView.getInstance()
					.getMainCircuit();
			if (model == null)
				return;
			g.setColor(Color.BLACK);
			for (ElementCircuit e : model.getCircuitElements()) {
				ElementUI ge = GraphicalElement.getInstance(e);
				elementGraphic.add(ge);
				canvasPnl.add(ge);
				g.drawString(e.getName(), e.getEmplacementX(),
						e.getEmplacementY() + ICON_HEIGHT + 10);
				for (ElementCircuit sortie : e.getSortie()) {
					if (!(sortie instanceof Circuit)) {

						ElementUI sortieUI = GraphicalElement
								.getInstance(sortie);
						g.drawLine((int) ge.getBounds().getCenterX(), (int) ge
								.getBounds().getCenterY(), (int) sortieUI
								.getBounds().getCenterX(), (int) sortieUI
								.getBounds().getCenterY());
					}
				}
			}
			super.paintComponent(g);
		}
	}

	private static final String MSG_ILLEGAL_OPERATION = "Operation Illegal";

	private CanvasPanel canvasPnl;
	private CircuitEditor controller;
	private ArrayList<ElementUI> elementGraphic;
	private ElementCircuit selection;
	private JPanel nameBar;

	protected static int ICON_WIDTH = 50;
	protected static int ICON_HEIGHT = 50;

	public CircuitCanvas(CircuitEditor controller) {
		this.canvasPnl = new CanvasPanel();
		this.controller = controller;
		elementGraphic = new ArrayList<ElementUI>();
	}

	public ElementUI get(Object elem) {
		if (elem instanceof ElementUI) {
			return elementGraphic.get(elementGraphic.indexOf((ElementUI) elem));
		} else if (elem instanceof ElementCircuit) {
			for (ElementUI eUI : elementGraphic) {
				if (eUI.getElementCircuit().equals((ElementCircuit) elem)) {
					return eUI;
				}
			}
		}
		return null;
	}

	protected void draw() {

		canvasPnl.repaint();
	}

	private static class GraphicalElement {

		private static ElementUI getInstance(ElementCircuit e) {
			if (e instanceof Entree) {
				return new EntreeUI((Entree) e);
			} else if (e instanceof Sortie) {
				return new SortieUI((Sortie) e);
			} else if (e instanceof Porte) {
				return new PorteUI((Porte) e);
			} else
				return new ElementUI((ElementCircuit) e);
		}
	}

	@Override
	public void notifyChanged(Notification notification) {
		System.out.println("Model Changed");
		draw();
	}

	public Component getPanel() {
		return canvasPnl;
	}

	public void setSelection(ElementCircuit selection) {
		this.selection = selection;

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		Component source = canvasPnl.getComponentAt(e.getX(), e.getY());
		int outilSelectionner = CircuitEditorMainView.getInstance()
				.getOutilPanel().getOutilSelectioner();
		if (selection != null) {
			if (outilSelectionner == Outil.DEPLACER) {
				CircuitEditorMainView.getInstance().getController()
						.deplacer(selection, e.getX(), e.getY());
				CircuitEditorMainView.getInstance().getCanvas()
						.setSelection(null);
				canvasPnl.repaint();

			} else if (outilSelectionner == Outil.ENLEVER_ELEMENT) {
				if (selection != null
						&& selection.getType() == ElementType.ENTREE
						|| selection.getType() == ElementType.SORTIE) {
					if (CircuitEditorMainView.getInstance().getController()
							.getMainCircuit().count(selection.getType()) > 1) {
						CircuitEditorMainView.getInstance().getController()
								.enlever(selection.getName());

					} else {
						JOptionPane
								.showMessageDialog(canvasPnl,
										"Un circuit doit avoir au moin une entr�e et une sortie");
					}

				} else {
					CircuitEditorMainView.getInstance().getController()
							.enlever(selection.getName());
				}
			} else if (outilSelectionner == Outil.LIER_ELEMENT) {
				if (source instanceof ElementUI) {
					if (!(selection instanceof Sortie)
							&& !(source instanceof Entree)) {
						ElementUI sourceUI = (ElementUI) source;
						CircuitEditorMainView
								.getInstance()
								.getController()
								.getMainCircuit()
								.relier(selection, sourceUI.getElementCircuit());
						canvasPnl.repaint();
					} else {
						JOptionPane.showMessageDialog(canvasPnl,
								MSG_ILLEGAL_OPERATION);
					}
				}
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		Component source = canvasPnl.getComponentAt(e.getX(), e.getY());
		if (source instanceof ElementUI) {
			ElementUI sourceUI = (ElementUI) source;
			CircuitEditorMainView.getInstance().getCanvas()
					.setSelection(sourceUI.getElementCircuit());
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public ElementCircuit getSelection() {
		return selection;
	}

}