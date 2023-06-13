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
   private JButton aufnehmen = new JButton("Buch aufnehmen");
   private JButton abbrechen = new JButton("Abbrechen");
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
	  FlowLayout left = new FlowLayout(FlowLayout.LEADING);
	  FlowLayout center = new FlowLayout(FlowLayout.CENTER);
      
      JPanel pane1 = new JPanel();
      pane1.setLayout(left);
      pane1.add (new JLabel ("Titel:          "));
      pane1.add (titel);
      add (pane1);
      
      JPanel pane2 = new JPanel();
      pane2.setLayout(left);
      pane2.add (new JLabel ("Untertitel: "));
      pane2.add (unterTitel);
      add (pane2);

      JPanel pane3 = new JPanel();
      pane3.setLayout(left);
      pane3.add (new JLabel ("ISBN:         "));
      pane3.add (isbn);
      add (pane3);
      
      JPanel pane4 = new JPanel();
      pane4.setLayout(left);
      pane4.add (new JLabel ("Anzahl:     "));
      pane4.add (anzahl);
      add (pane4);

      JPanel pane5 = new JPanel();
      pane5.setLayout (center);
      pane5.add (aufnehmen);
      pane5.add (abbrechen);
      add (pane5);

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
}
