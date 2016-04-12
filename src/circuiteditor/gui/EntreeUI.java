/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circuiteditor.gui;

import circuiteditor.Entree;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * 
 * @author Pascal
 */
public class EntreeUI extends ElementUI {

	private static URL IMAGE_URI = EntreeUI.class
			.getResource("images/entree.png");
	final static ImageIcon DEFAULT_ICON = new ImageIcon(EntreeUI.IMAGE_URI);

	public EntreeUI(Entree entreeModel) {
		super(DEFAULT_ICON, entreeModel);
	}
}
