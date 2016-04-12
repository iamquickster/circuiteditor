/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circuiteditor.gui;

import static circuiteditor.gui.CircuitCanvas.ICON_HEIGHT;
import static circuiteditor.gui.CircuitCanvas.ICON_WIDTH;
import circuiteditor.ElementCircuit;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 * 
 * @author Pascal
 */
public class ElementUI extends JLabel {

	private ElementCircuit model;
	private static String IMAGE_URI = "images/elementGeneric.png";
	final static ImageIcon DEFAULT_ICON = new ImageIcon(ElementUI.IMAGE_URI);
	private ImageIcon currentIcon = DEFAULT_ICON;

	public ElementUI(ImageIcon icon, ElementCircuit elementModel) {
		super(icon);
		model = elementModel;
		setBounds(model.getEmplacementX() - ICON_WIDTH / 2, getEmplacementY()
				- ICON_WIDTH / 2, ICON_WIDTH, ICON_HEIGHT);
		repaint();
	}

	public ElementUI(ElementCircuit elementModel) {
		super(new ImageIcon(DEFAULT_ICON.getImage().getScaledInstance(
				ICON_WIDTH, ICON_HEIGHT, Image.SCALE_DEFAULT)));
		model = elementModel;
		setBounds(model.getEmplacementX() - ICON_WIDTH / 2, getEmplacementY()
				- ICON_WIDTH / 2, ICON_WIDTH, ICON_HEIGHT);
		repaint();
	}

	public ElementCircuit getElementCircuit() {
		return model;
	}

	public int getEmplacementX() {
		return model.getEmplacementX() + (ICON_WIDTH / 2);
	}

	public int getEmplacementY() {
		return model.getEmplacementY() + (ICON_HEIGHT / 2);
	}
}
