package aufgabe4;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import aufgabe4.entitaeten.MediumVerwaltung;
import aufgabe4.entitaeten.Buch;

public class BuchAufnehmenGUI extends JDialog {
   private JButton aufnehmen;
   private JButton abbrechen;
   private JTextField titel = new JTextField(30);
   private JTextField unterTitel = new JTextField(30);
   private JTextField isbn = new JTextField(30);
   private JTextField anzahl = new JTextField(30);

   private static final long serialVersionUID = 1L;

   private MediumVerwaltung buecher;

   public BuchAufnehmenGUI(JFrame parent) {
	  super (parent, "Buch aufnehmen", true);

      buecher = MediumVerwaltung.getRefToInstance();
      
      GridLayout formGrid = new GridLayout(5,1);   	  
      formGrid.setVgap(10);
      setLayout (formGrid);    
      
      dialogAufbauen();
      controllerHinzufuegen();
      
      setPreferredSize(new Dimension(300, 300));
      setMinimumSize(new Dimension(300,300));
      
      setVisible (true);
   }

   private void dialogAufbauen() {
	  FlowLayout center = new FlowLayout(FlowLayout.CENTER);
      
      addDuoPanel("Titel:          ", titel);      
      addDuoPanel("Untertitel: ", unterTitel);
      addDuoPanel("ISBN:         ", isbn);    
      addDuoPanel("Anzahl:    ", anzahl);

      JPanel panelBtn = new JPanel();
      panelBtn.setLayout (center);
      aufnehmen = new JButton("Buch aufnehmen");
      panelBtn.add (aufnehmen);
      abbrechen = new JButton("Abbrechen");
      panelBtn.add (abbrechen);
      add (panelBtn);

   }

   private void controllerHinzufuegen() {
	   
      aufnehmen.addActionListener(e -> {
    	  	try {
	            // Methode buchAufnehmen() der Klasse MediumVerwaltung aufrufen.   
	            Buch guiBuch = new Buch(titel.getText(), unterTitel.getText(), isbn.getText(), Integer.parseInt(anzahl.getText()));
	            buecher.buchAufnehmen(guiBuch);
	            dispose();
    	  	}
    	  	catch(Exception error) {
    	  		new ErrorGUI(error);
    	  	}
         });

      abbrechen.addActionListener(e -> {
            dispose();
         });
   }
   
   private void addDuoPanel(String labelText, JTextField textFieldName){
	   FlowLayout left = new FlowLayout(FlowLayout.LEFT);
	   JPanel newPanel = new JPanel(left);
	   newPanel.add(new JLabel (labelText));
	   newPanel.add(textFieldName);
	   add(newPanel);   
   }
}
