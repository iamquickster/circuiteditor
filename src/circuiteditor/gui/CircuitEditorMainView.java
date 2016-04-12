package circuiteditor.gui;

import circuiteditor.Circuit;
import circuiteditor.CircuitEditor;
import circuiteditor.impl.CircuiteditorFactoryImpl;
import circuiteditor.util.CircuiteditorAdapterFactory;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.management.Notification;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;


public class CircuitEditorMainView extends JFrame {

	private static final long serialVersionUID = 1L;
	public final static int LARGEUR_FENETRE_SAVE = 300;
	public final static int HAUTEUR_FENETRE_SAVE = 200;
	public final static int LARG_BTN_SAVE = 120;
	public final static int HAUT_BTN_SAVE = 60;
	public final static int LARG_ECRAN = Toolkit.getDefaultToolkit().getScreenSize().width;
	public final static int HAUT_ECRAN = Toolkit.getDefaultToolkit().getScreenSize().height;
	private final static String TITLE = "Circuit Editor";
	private static CircuitEditorMainView mainView;
	private CircuitEditor controller = null;
	private Circuit model = null;
	private CircuiteditorAdapterFactory adaterFac = new CircuiteditorAdapterFactory();
	private final TableVeriteView tableVeriteView;
	private final CircuitCanvas canvas;
	private String path = null;
	private String operation = null;

	private final JMenuBar menuBar;
	private final OutilPanel outilPanel;
	private final JFrame erreur;
	private final JFrame confirmer;
	private final JFrame aPropos;
	private final JFrame save;
	private JFileChooser charger;
	private JFileChooser sauvegarder;
	private JMenuItem nouveauMenuItem;
	private JMenuItem chargerMenuItem;
	private JMenuItem fermerMenuItem;
	private JMenuItem sauvegarderMenuItem;
	private JMenuItem sauvegarderSousMenuItem;
	private JMenuItem imprimerMenuItem;
	private JMenuItem exporterCircuitImageMenuItem;
	private JMenuItem exporterTableVeriteMenuItem;
	private JMenuItem quitterMenuItem;
	private JMenuItem annulerMenuItem;
	private JMenuItem retablirMenuItem;
	private JButton oui_save;
	private JButton non_save;
	private JLabel textLabelSave;
	private JButton oui_confirmer;
	private JButton non_confirmer;
	private JLabel textLabelConfirmer;
	private Resource res;

	private CircuitEditorMainView() {
		super(CircuitEditorMainView.TITLE);
		mainView = this;
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container container = this.getContentPane();
		container.setLayout(new BorderLayout());
		this.menuBar = new JMenuBar();
		erreur = new JFrame("erreur");
		confirmer = new JFrame("confirmer");
		aPropos = new JFrame(" A propos");
		save = new JFrame("Sauvegarder");
		this.outilPanel = new OutilPanel();
		this.tableVeriteView = new TableVeriteView();
		this.controller = CircuiteditorFactoryImpl.eINSTANCE.createCircuitEditor();
		this.canvas = new CircuitCanvas(controller);
		container.add(canvas.getPanel(), BorderLayout.CENTER);
		this.configurerMenuFenetre();
		setJMenuBar(menuBar);
		setSize(new Dimension(1000, 600));
		setMinimumSize(new Dimension(750, 450));
		setLocationRelativeTo(null);
		nouveau();
		setVisible(true);
		this.outilPanel.setVisible(true);
	}

	private void configurerMenuFenetre() {

		/*
		 * Section fichier
		 */
		JMenu fichierMenu = new JMenu("Fichier");
		nouveauMenuItem = new JMenuItem("Nouveau");
		chargerMenuItem = new JMenuItem("Charger");
		charger = new JFileChooser();
		fermerMenuItem = new JMenuItem("Fermer");
		sauvegarderMenuItem = new JMenuItem("Enregistrer");
		sauvegarder = new JFileChooser();
		sauvegarderSousMenuItem = new JMenuItem("Enregistrer sous...");
		imprimerMenuItem = new JMenuItem("Imprimer...");

		save.setBackground(Color.BLUE);
		save.setBounds(LARG_ECRAN / 2 - LARGEUR_FENETRE_SAVE / 2, HAUT_ECRAN
				/ 2 - HAUTEUR_FENETRE_SAVE / 2, LARGEUR_FENETRE_SAVE,
				HAUTEUR_FENETRE_SAVE);
		save.setResizable(false);
		oui_save = new JButton("Oui");
		non_save = new JButton("Non");
		textLabelSave = new JLabel("Est-ce que vous voulez sauvegarder ?",JLabel.CENTER);
		textLabelSave.setAlignmentX(0);
		textLabelSave.setAlignmentY(0);
		oui_save.setBounds(35, 105, LARG_BTN_SAVE - 30, HAUT_BTN_SAVE);
		non_save.setBounds(155, 105, LARG_BTN_SAVE - 30, HAUT_BTN_SAVE);
		save.getContentPane().add(oui_save);
		save.getContentPane().add(non_save);
		save.getContentPane().add(textLabelSave);
		save.setVisible(false);

		confirmer.setBounds(LARG_ECRAN / 2 - LARGEUR_FENETRE_SAVE / 2,
				HAUT_ECRAN / 2 - HAUTEUR_FENETRE_SAVE / 2,
				LARGEUR_FENETRE_SAVE, HAUTEUR_FENETRE_SAVE);
		confirmer.setResizable(false);
		oui_confirmer = new JButton("Oui");
		non_confirmer = new JButton("Non");
		textLabelConfirmer = new JLabel("Est-ce que vous �tes sur de vouloir fermer ?", JLabel.CENTER);
		textLabelConfirmer.setBounds(35, 105, LARG_BTN_SAVE - 30, HAUT_BTN_SAVE);
		oui_confirmer.setBounds(40, 105, LARG_BTN_SAVE - 30, HAUT_BTN_SAVE);
		non_confirmer.setBounds(160, 105, LARG_BTN_SAVE - 30, HAUT_BTN_SAVE);
		confirmer.getContentPane().add(oui_confirmer);
		confirmer.getContentPane().add(non_confirmer);
		confirmer.getContentPane().add(textLabelConfirmer);
		confirmer.setVisible(false);

		JMenu exporterMenu = new JMenu("Exporter");
		exporterCircuitImageMenuItem = new JMenuItem("Exporter le circuit");
		exporterTableVeriteMenuItem = new JMenuItem("Exporter la table de verite");

		exporterMenu.add(exporterCircuitImageMenuItem);
		exporterMenu.add(exporterTableVeriteMenuItem);
		quitterMenuItem = new JMenuItem("Quitter");
		fichierMenu.add(nouveauMenuItem);
		fichierMenu.add(chargerMenuItem);
		fichierMenu.add(fermerMenuItem);
		fichierMenu.add(sauvegarderMenuItem);
		fichierMenu.add(sauvegarderSousMenuItem);
		fichierMenu.addSeparator();
		fichierMenu.add(imprimerMenuItem);
		fichierMenu.add(exporterMenu);
		fichierMenu.addSeparator();
		fichierMenu.add(quitterMenuItem);

		fichierMenu.setMnemonic('F');
		nouveauMenuItem.setMnemonic('N');
		chargerMenuItem.setMnemonic('C');
		fermerMenuItem.setMnemonic('F');
		sauvegarderMenuItem.setMnemonic('S');
		imprimerMenuItem.setMnemonic('I');

		nouveauMenuItem.setAccelerator(KeyStroke.getKeyStroke("control N"));
		chargerMenuItem.setAccelerator(KeyStroke.getKeyStroke("control C"));
		fermerMenuItem.setAccelerator(KeyStroke.getKeyStroke("control F"));
		sauvegarderMenuItem.setAccelerator(KeyStroke.getKeyStroke("control S"));
		sauvegarderSousMenuItem.setAccelerator(KeyStroke.getKeyStroke("control alt S"));
		imprimerMenuItem.setAccelerator(KeyStroke.getKeyStroke("control I"));

		/*
		 * ActionListener pour sauvegarder et charger/creer un circuit
		 */
		oui_save.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (path == null) {
					sauvegarderSous();
				} else {
					sauvegarder();
				}

				if (operation.equals("nouveau")) {
					nouveau();
				} else if (operation.equals("charger")) {
					charger();
				}

				save.setVisible(false);
			}

		});

		/*
		 * ActionListener charger/creer un circuit
		 */
		non_save.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (operation.equals("nouveau")) {
					nouveau();
				} else if (operation.equals("charger")) {
					charger();
				}

				save.setVisible(false);
				getCanvas().getPanel().repaint();
			}

		});

		/*
		 * ActionListener pour sauvegarder et charger/creer un circuit
		 */
		oui_confirmer.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				model = null;
				confirmer.setVisible(false);
			}

		});

		/*
		 * ActionListener charger/creer un circuit
		 */
		non_confirmer.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				confirmer.setVisible(false);
			}

		});

		/*
		 * ActionListener pour cr�er un nouveau circuit
		 */
		nouveauMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				operation = "nouveau";

				if (model != null) {
					save.setVisible(true);
				} else {
					nouveau();
				}

			}

		});

		/*
		 * ActionListener pour quitter Circuit editor
		 */
		quitterMenuItem.addActionListener(new ActionListener() {
			 
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				System.exit(DISPOSE_ON_CLOSE);
			}
		});

		/*
		 * ActionListener pour charger un nouveau circuit
		 */
		chargerMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				operation = "charger";

				if (model != null) {
					save.setVisible(true);
				} else {
					charger();
				}

			}

		});

		/*
		 * ActionListener pour fermer le circuit
		 */
		fermerMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (model != null)
					confirmer.setVisible(true);
			}
		});

		/*
		 * ActionListener pour sauvegarder le circuit
		 */
		sauvegarderMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (model != null) {
					sauvegarder();
				}
			}
		});

		/*
		 * ActionListener pour sauvegarde le circuit dans un fichier sp�cifique
		 */
		sauvegarderSousMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (model != null && path == null) {
					sauvegarderSous();
				}
			}
		});

		/*
		 * ActionListener pour exporter le circuit en format jpg
		 */
		exporterCircuitImageMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				exporterCircuit();
			}
		});

		/*
		 * ActionListener pour exporter la table de v�rit�
		 */
		exporterTableVeriteMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				exporterTable();
			}
		});

		/*
		 * Section menu historique
		 */
		JMenu historiqueMenu = new JMenu("Historique");
		annulerMenuItem = new JMenuItem("Annuler");
		retablirMenuItem = new JMenuItem("Rétablir");
		historiqueMenu.add(annulerMenuItem);
		historiqueMenu.add(retablirMenuItem);
		historiqueMenu.setMnemonic('H');
		annulerMenuItem.setMnemonic('A');
		retablirMenuItem.setMnemonic('R');
		annulerMenuItem.setAccelerator(KeyStroke.getKeyStroke("control Z"));
		retablirMenuItem.setAccelerator(KeyStroke.getKeyStroke("control Y"));

		/*
		 * ActionListener pour annuler la derni�re action
		 */
		annulerMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				controller.undo();
				canvas.getPanel().repaint();
			}
		});

		/*
		 * ActionListener pour r�tablir le circuit
		 */
		retablirMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				controller.redo();
				canvas.getPanel().repaint();
			}
		});
		;

		/*
		 * Section menu divers
		 */
		JMenu diversMenu = new JMenu("?");
		JMenuItem aProposMenuItem = new JMenuItem("À propos de Circuit Editor");

		aProposMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(aPropos, "Logiciel d�velopp� en "
						+ "2015 dans le cadre d'un travail universitaire");
			}
		});

		diversMenu.add(aProposMenuItem);

		menuBar.add(fichierMenu);
		menuBar.add(historiqueMenu);
		menuBar.add(diversMenu);

	}

	/*
	 * main
	 */
	public static void main(String[] args) {
		CircuitEditorMainView.getInstance();

	}

	/*
	 * Getters qui retourne l'instance de cette classe
	 */
	public static CircuitEditorMainView getInstance() {
		if (mainView == null) {
			mainView = new CircuitEditorMainView();
		}
		return mainView;
	}

	/*
	 * Getters qui retourne le circuit
	 */
	public Circuit getMainCircuit() {
		return getController().getMainCircuit();
	}

	/*
	 * Getters qui retourne le canvas
	 */
	public CircuitCanvas getCanvas() {
		return canvas;

	}

	/*
	 * Getters qui retourne le panneau d'outil
	 */
	public OutilPanel getOutilPanel() {
		return outilPanel;
	}

	/*
	 * Getters qui retourne le controleur
	 */
	public CircuitEditor getController() {
		return controller;
	}

	/*
	 * M�thode qui cr�er un nouveau circuit
	 */
	public void nouveau() {
		controller.nouveau();
		path = null;
		model = controller.getMainCircuit();
		model.eAdapters().add(canvas);
		model.eAdapters().add(tableVeriteView);

		tableVeriteView.actualiserTable();
		getCanvas().getPanel().addMouseListener(getCanvas());
		getCanvas().draw();
		save.setVisible(false);
		operation = null;
	}

	/*
	 * M�thode qui charge un circuit
	 */
	public void charger() {
		int resultat = charger.showOpenDialog(null);

		if (resultat == JFileChooser.APPROVE_OPTION) {
			File Fichier = charger.getSelectedFile();
			path = Fichier.getAbsolutePath();
			controller.ouvrir(path);
			getCanvas().getPanel().repaint();
			tableVeriteView.actualiserTable();
		}

		operation = null;

	}

	/*
	 * M�thode qui sauvegarde un circuit
	 */
	public void sauvegarder() {
		
		if (path == null) {
			sauvegarderSous();
		} else {
			controller.sauvegarder(path);
		}
	}

	/*
	 * M�thode qui sauvegarde un circuit dans un dossier sp�cifique
	 */
	public void sauvegarderSous() {
		int resultat = sauvegarder.showSaveDialog(null);

		if (resultat == JFileChooser.APPROVE_OPTION) {
			File cheminFichier = sauvegarder.getSelectedFile();
			path = cheminFichier.getAbsolutePath();
			controller.sauvegarder(path);
		}
	}
	
	/*
	 * M�thode qui exporte un circuit dans un dossier sp�cifique
	 */
	public void exporterCircuit () {
		
		if (model != null) {
			int resultat = sauvegarder.showSaveDialog(null);

			if (resultat == JFileChooser.APPROVE_OPTION) {
				File cheminFichier = sauvegarder.getSelectedFile();
				path = cheminFichier.getAbsolutePath();
				BufferedImage circuit = getScreenShot(mainView.getContentPane());
				//controller.exporterCircuit(path,(byte[]) circuit);
			}
		} else {
			JOptionPane.showMessageDialog(erreur, "Aucun fichier definis",
					"Erreur", JOptionPane.WARNING_MESSAGE);
		}
	}
	
	/*
	 * M�thode qui screenshot le circuit
	 */
	public static BufferedImage getScreenShot(Component component) {

		BufferedImage image = new BufferedImage(
										component.getWidth(),
										component.getHeight(),
										BufferedImage.TYPE_INT_RGB);
	    component.paint(image.getGraphics()); 
	
	    return image;
	}
	
	/*
	 * M�thode qui exporte un circuit dans un dossier sp�cifique
	 */
	public void exporterTable () {
		
		if (model != null) {
			int resultat = sauvegarder.showSaveDialog(null);

			if (resultat == JFileChooser.APPROVE_OPTION) {
				File cheminFichier = sauvegarder.getSelectedFile();
				path = cheminFichier.getAbsolutePath();
				controller.exporterTable(path);
			}
		} else {
			JOptionPane.showMessageDialog(erreur, "Aucun fichier definis",
					"Erreur", JOptionPane.WARNING_MESSAGE);
		}
	}
	
	
}
