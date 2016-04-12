/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circuiteditor.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import circuiteditor.ElementCircuit;
import circuiteditor.ElementType;
import circuiteditor.gui.CircuitCanvas.CanvasPanel;
import circuiteditor.impl.CircuiteditorFactoryImpl;

/**
 * 
 * @author Pascal
 */
public class OutilAjouterElement extends Outil {

	private static final String NOM_OUTIL = "Ajouter Element";
	OutilPanel parent;

	public OutilAjouterElement(final OutilPanel parent) {
		super(NOM_OUTIL);
		this.parent = (OutilPanel) this.getParent();

		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				parent.setSelection(Outil.AJOUTER_ELEMENT);
				ElementCircuitView ecv = ElementCircuitView.getInstance();

			}
		});
	}
}
