/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circuiteditor.gui;

import circuiteditor.Sortie;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 * 
 * @author Pascal
 */
public class SortieUI extends ElementUI {
	private static URL IMAGE_URI = SortieUI.class
			.getResource("images/sortie.png");
	final static ImageIcon DEFAULT_ICON = new ImageIcon(SortieUI.IMAGE_URI);

	public SortieUI(Sortie sortieModel) {
		super(DEFAULT_ICON, sortieModel);
	}

}
