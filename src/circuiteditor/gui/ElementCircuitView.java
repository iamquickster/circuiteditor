package circuiteditor.gui;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import circuiteditor.Circuit;
import circuiteditor.ElementCircuit;
import circuiteditor.ElementType;
import circuiteditor.Entree;
import circuiteditor.PortePersonalise;
import circuiteditor.Sortie;
import circuiteditor.impl.CircuiteditorFactoryImpl;

public class ElementCircuitView extends JFrame {

	private static final String NOM = "Nom";
	private static final int MAX_NAME_LENGTH = 5;
	private static ElementCircuitView main;
	private String nom;
	private ElementType type;
	private JComboBox<ElementType> typeBox;
	private JTextField nameField;
	private JPanel mainPnl;
	private JButton submitButton;
	private Map<ElementType, String> prefix = new HashMap<ElementType, String>();

	private static final String MSG_NOM_EXIST = "Cet element est exist d�j�";

	private static final String TITLE_ERREUR = "Erreur";

	// dimensions pour la this outil
	public final static int LARGEUR_FENETRE = 250;
	public final static int HAUTEUR_FENETRE = 250;

	// dimensions pour les boutons et variable finale barre état
	public final static int LARG_BTN = 240;
	public final static int HAUT_BTN = 60;

	// largeur de l'ecran de l'ordinateur pour centrer l'application
	public final static int LARG_ECRAN = Toolkit.getDefaultToolkit()
			.getScreenSize().width;
	// hauteur de l'ecran de l'ordinateur pour centrer l'application
	public final static int HAUT_ECRAN = Toolkit.getDefaultToolkit()
			.getScreenSize().height;
	private static final String TITLE = "Nouveau Element";

	public String getNom() {
		return nameField.getText();
	}

	public ElementType getElementType() {
		return (ElementType) typeBox.getSelectedItem();
	}

	private ElementCircuitView() {
		super(TITLE);
		mainPnl = new JPanel();
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		setLocationRelativeTo(null);
		setSize(300, 150);
		setAlwaysOnTop(true);
		
		this.prefix.put(ElementType.ENTREE, "E");
		this.prefix.put(ElementType.SORTIE, "S");
		this.prefix.put(ElementType.PORTE_STANDARD, "P");
		this.prefix.put(ElementType.PORTE_PERSONALISE, "PP");
		this.prefix.put(ElementType.PORTE_ET, "P&");
		this.prefix.put(ElementType.PORTE_OU, "P|");
		this.prefix.put(ElementType.PORTE_NOT, "P!");
		
		
		
		
		this.nameField = new JTextField(MAX_NAME_LENGTH);
		this.typeBox = new JComboBox<ElementType>(ElementType.values());
		this.typeBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ElementCircuitView.getInstance().setDefaultText();
			}
		});
		this.submitButton = new JButton("Ajouter");
		nameField.setText(getDefaultText());
		submitButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String nouveauNom = getNom();
				ElementType type = getElementType();
				
				if (nouveauNom != null) {
					ElementCircuit nouvElement = (ElementCircuit) CircuiteditorFactoryImpl.eINSTANCE
							.create(type.toEClass());
					nouvElement.setName(nouveauNom);

					if (CircuitEditorMainView.getInstance().getController()
							.getMainCircuit().getElement(nouveauNom) == null) {
						
						if(nouvElement.getType() == ElementType.PORTE_PERSONALISE) {
							JFileChooser fc = new JFileChooser();
							FileNameExtensionFilter filter = new FileNameExtensionFilter("FICHIER CIRCUIT", "circuit");
							fc.setFileFilter(filter);
							int result = fc.showOpenDialog(null);
							if(result == JFileChooser.APPROVE_OPTION) {
								File circuitFile = fc.getSelectedFile();
								PortePersonalise nouvPortePerso = (PortePersonalise) nouvElement;
								Resource resCircuit = new XMIResourceImpl(URI.createURI(circuitFile.getAbsolutePath()));

									try {
										resCircuit.load(null);
									} catch (IOException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}

								
								EObject eObject = resCircuit.getContents().get(0);
								Circuit circuit = (Circuit) eObject;
								circuit.getEntree().clear();
								circuit.getSortie().clear();
								nouvPortePerso.setCircuit(circuit);
							}
							
						}
						
						boolean estAjouter = CircuitEditorMainView
								.getInstance().getController().getMainCircuit()
								.ajouter(nouvElement);
						if (!estAjouter) {
							JOptionPane.showMessageDialog(
									ElementCircuitView.getInstance(),
									"Trop d'�l�ment de ce type");
						}
					} else {
						JOptionPane.showMessageDialog(
								CircuitEditorMainView.getInstance(),
								MSG_NOM_EXIST, TITLE_ERREUR,
								JOptionPane.ERROR_MESSAGE);
					}
				}
				ElementCircuitView.getInstance().dispose();
			}
		});
		mainPnl.add(new JLabel(NOM + ":"));
		mainPnl.add(nameField);
		mainPnl.add(typeBox);
		mainPnl.add(submitButton);
		this.add(mainPnl);
		this.setVisible(true);

	}

	protected void setDefaultText() {
		nameField.setText(getDefaultText());
	}

	private String getDefaultText() {
		
		
		return prefix.get((ElementType) typeBox.getSelectedItem()) + (CircuitEditorMainView.getInstance().getController().getMainCircuit().count((ElementType) typeBox.getSelectedItem())+ 1);
		
	}

	protected static ElementCircuitView getInstance() {
		if (main == null) {
			main = new ElementCircuitView();
		}
		main.setDefaultText();
		main.setVisible(true);
		return main;
	}

}
