/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circuiteditor.gui;

import static circuiteditor.gui.CircuitCanvas.ICON_HEIGHT;
import static circuiteditor.gui.CircuitCanvas.ICON_WIDTH;
import circuiteditor.Porte;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 * 
 * @author Pascal
 */
public class PorteUI extends ElementUI {
	private static URL IMAGE_URI = PorteUI.class
			.getResource("images/porte.png");
	final static ImageIcon DEFAULT_ICON = new ImageIcon(PorteUI.IMAGE_URI);

	PorteUI(Porte porteModel) {
		super(new ImageIcon(DEFAULT_ICON.getImage().getScaledInstance(
				ICON_WIDTH, ICON_HEIGHT, Image.SCALE_DEFAULT)), porteModel);
	}

}
