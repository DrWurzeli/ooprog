import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import aufgabe4.entitaeten.MediumVerwaltung;

public class Buecherverwaltung extends JFrame
{
   private static final long serialVersionUID = 1L;

   public Buecherverwaltung()
   {
      // Konstruktor der Vaterklasse JFrame aufrufen.
      super ("Bücherverwaltung");

      // Layout-Manager für das Hauptfenster setzen.
      setLayout (new GridLayout (5, 1));

      dialogAufbauen();

      // Window-Listener zum Hauptfenster hinzufügen, um das
      // Ereignis abzufangen, das beim Schließen des Fensters
      // ausgelöst wird.
      addWindowListener (new WindowAdapter()
      {
         public void windowClosing (WindowEvent e)
         {
            // Referenz auf Objekt vom Typ MediumVerwaltung holen.
            MediumVerwaltung buecher = 
            // B�cherbestand mit Hilfe des Objektes vom Typ
            // MediumVerwaltung in der Datei speichern.
            . . . . .
         }
      });

      setSize (new Dimension (250, 250));
      setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      setVisible (true);
   }

   private void dialogAufbauen()
   {
      // Controller-Objekt vom Typ ButtonController erzeugen.
      ButtonController controller = . . . . .

      JButton buchAufnehmen = new JButton ("Buch aufnehmen");
      buchAufnehmen.setActionCommand ("Buch aufnehmen");
      buchAufnehmen.addActionListener(controller);

      JButton ausleiherAufnehmen = new JButton ("Ausleiher aufnehmen");

      JButton bestandAnzeigen = new JButton ("Bestand anzeigen");
      . . . . .
      . . . . .

      JButton ausleihe = new JButton ("Buchausleihe erfassen");
      JButton rueckgabe = new JButton ("Buchrückgabe erfassen");

      // 5 Schaltfl�chen dem Hauptfenster hinzuf�gen.
      add (buchAufnehmen);
      . . . . .
      . . . . .
      . . . . .
      . . . . .
   }

   public static void main (String args[])
   {
      Buecherverwaltung fenster = new Buecherverwaltung();
   }
}

class ButtonController implements ActionListener
{
   public void actionPerformed (ActionEvent e)
   {
      if (e.getActionCommand() == "Buch aufnehmen")
      {
         BuchAufnehmenGUI b = new BuchAufnehmenGUI (Buecherverwaltung.this);
      }
      // Falls Schaltfl�che "Bestand anzeigen" gedr�ckt wurde, erzeuge den
      // Dialog BestandAnzeigenGUI.
      else if (. . . . .)
      {
         . . . . .
      }
   }
}
