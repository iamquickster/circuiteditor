/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circuiteditor.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * 
 * @author Pascal
 */
public class Outil extends JButton {

	public Outil(String nomOutil) {
		this.setText(nomOutil);
	}

	protected static final int DEPLACER = 0;
	protected static final int AJOUTER_ELEMENT = 1;
	protected static final int ENLEVER_ELEMENT = 2;
	protected static final int LIER_ELEMENT = 3;

}
