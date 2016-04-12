package circuiteditor.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OutilLierElement extends Outil {

	private static final String NOM_OUTIL = "Lier Element";
	OutilPanel parent;

	public OutilLierElement(OutilPanel outilPanel) {
		super(NOM_OUTIL);
		this.parent = outilPanel;

		this.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				parent.setSelection(Outil.LIER_ELEMENT);
			}
		});
	}

}
