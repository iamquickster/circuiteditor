/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circuiteditor.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 
 * @author Pascal
 */
public class OutilEnleverElement extends Outil {
	private static final String NOM_OUTIL = "Enlever Element";
	OutilPanel parent;

	public OutilEnleverElement(final OutilPanel parent) {
		super(NOM_OUTIL);
		this.parent = (OutilPanel) this.getParent();

		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				parent.setSelection(Outil.ENLEVER_ELEMENT);
			}
		});
	}
}
