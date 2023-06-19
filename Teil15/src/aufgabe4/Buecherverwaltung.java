package aufgabe4;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import aufgabe4.entitaeten.MediumVerwaltung;

public class Buecherverwaltung extends JFrame {
   private static final long serialVersionUID = 1L;

   public Buecherverwaltung() {
      // Konstruktor der Vaterklasse JFrame aufrufen.
      super ("Bücherverwaltung");

      // Layout-Manager für das Hauptfenster setzen.
      setLayout (new GridLayout (6, 1));

      dialogAufbauen();

      // Window-Listener zum Hauptfenster hinzufügen, um das
      // Ereignis abzufangen, das beim Schließen des Fensters
      // ausgelöst wird.
      addWindowListener (new WindowAdapter() {
         public void windowClosing (WindowEvent e) {
            // Referenz auf Objekt vom Typ MediumVerwaltung holen.
            MediumVerwaltung buecher = MediumVerwaltung.getRefToInstance();
            
            // Bücherbestand mit Hilfe des Objektes vom Typ
            // MediumVerwaltung in der Datei speichern.
            buecher.bestandSpeichern();
         }
      });

      setSize (new Dimension (250, 250));
      setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      setVisible (true);
   }

   private void dialogAufbauen() {
      // Controller-Objekt vom Typ ButtonController erzeugen.
      ButtonController controller = new ButtonController();

      JButton buchAufnehmen = new JButton ("Buch aufnehmen");
      buchAufnehmen.setActionCommand ("addBook");
      buchAufnehmen.addActionListener(controller);

      JButton ausleiherAufnehmen = new JButton ("Ausleiher aufnehmen");
      /*
      ausleiherAufnehmen.setActionCommand("addAusleiher");
      ausleiherAufnehmen.addActionListener(controller);
      */

      JButton bestandAnzeigen = new JButton ("Bestand anzeigen");
      bestandAnzeigen.setActionCommand("getBooks");
      bestandAnzeigen.addActionListener(controller);

      JButton ausleihe = new JButton ("Buchausleihe erfassen");
      JButton rueckgabe = new JButton ("Buchrückgabe erfassen");
      
      JButton close = new JButton("Programm beenden");
      close.setActionCommand("quitApp");
      close.addActionListener(controller);

      // 5 Schaltflächen dem Hauptfenster hinzufügen.
      add(buchAufnehmen);
      add(ausleiherAufnehmen);
      add(bestandAnzeigen);
      add(ausleihe);
      add(rueckgabe);
      add(close);
   }

   public static void main (String args[]) {
      new Buecherverwaltung();
   }

   class ButtonController implements ActionListener {
	   public void actionPerformed (ActionEvent e) {
		  switch(e.getActionCommand()) {
		  	case "addBook" -> new BuchAufnehmenGUI(Buecherverwaltung.this);
		  	//case "addAusleiher" -> ;
		  	case "getBooks" -> new BestandAnzeigenGUI(Buecherverwaltung.this);
		  	case "quitApp" -> {
		  		MediumVerwaltung.getRefToInstance().bestandSpeichern();
		  		dispose();
		  	}
		    default -> new ErrorGUI(new IllegalArgumentException("Error on click: " + e.getActionCommand()));
		  }
	   }
	}
}
