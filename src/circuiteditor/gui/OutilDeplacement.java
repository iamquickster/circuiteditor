package circuiteditor.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 
 * @author Pascal et Maxime
 */
public class OutilDeplacement extends Outil {

	private static final String NOM_OUTIL = "Deplacer Element";
	OutilPanel parent;

	public OutilDeplacement(final OutilPanel parent) {
		super(NOM_OUTIL);
		this.parent = (OutilPanel) this.getParent();

		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				parent.setSelection(Outil.DEPLACER);
			}
		});
	}

}
