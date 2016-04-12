package circuiteditor.gui;

import circuiteditor.Circuit;

import java.awt.Color;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class OutilPanel extends JFrame {

	// dimensions pour la this outil
	public final static int LARGEUR_FENETRE = 250;
	public final static int HAUTEUR_FENETRE = 315;

	// dimensions pour les boutons et variable finale barre état
	public final static int LARG_BTN = 240;
	public final static int HAUT_BTN = 60;

	// largeur de l'ecran de l'ordinateur pour centrer l'application
	public final static int LARG_ECRAN = Toolkit.getDefaultToolkit()
			.getScreenSize().width;
	// hauteur de l'ecran de l'ordinateur pour centrer l'application
	public final static int HAUT_ECRAN = Toolkit.getDefaultToolkit()
			.getScreenSize().height;

	// Titre de la this outil
	public final static String TITRE_FENETRE = "Outil";

	// Bouton
	private Outil ajouterElement;
	private Outil deplacement;
	private Outil enleverCircuitElement;
	private int selection;
	private ArrayList<Outil> outils;
	private OutilLierElement lierElements;

	/**
	 * Constructeur sans argument qui initialise tous les composants graphiques.
	 */
	public OutilPanel() {

		super(TITRE_FENETRE);
		this.setBackground(Color.BLUE);

		// centrer la this principale de l'editeur
		this.setBounds(LARG_ECRAN / 2 - LARGEUR_FENETRE / 2, HAUT_ECRAN / 2
				- HAUTEUR_FENETRE / 2, LARGEUR_FENETRE, HAUTEUR_FENETRE);
		this.setLayout(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocation(LARG_ECRAN - this.getWidth() - 100, 500);

		// Création boutons
		outils = new ArrayList<Outil>();
		ajouterElement = new OutilAjouterElement(this);
		deplacement = new OutilDeplacement(this);
		enleverCircuitElement = new OutilEnleverElement(this);
		lierElements = new OutilLierElement(this);

		// Placer boutons
		ajouterElement.setBounds(20, 15, LARG_BTN - 30, HAUT_BTN);
		deplacement.setBounds(20, 85, LARG_BTN - 30, HAUT_BTN);
		enleverCircuitElement.setBounds(20, 155, LARG_BTN - 30, HAUT_BTN);
		lierElements.setBounds(20, 225, LARG_BTN - 30, HAUT_BTN);

		outils.add(ajouterElement);
		outils.add(deplacement);
		outils.add(enleverCircuitElement);
		outils.add(lierElements);
		// Ajouter Boutons
		for (Outil o : outils) {
			this.getContentPane().add(o);
		}

		// RENDRE LA FENETRE VISIBLE
		this.setVisible(true);

	}

	public void setSelection(int deplacer) {
		this.selection = deplacer;
	}

	public int getOutilSelectioner() {
		return selection;
	}

}