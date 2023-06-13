import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import aufgabe4.entitaeten.MediumVerwaltung;
import aufgabe4.entitaeten.Buch;

public class BuchAufnehmenGUI . . . . .
{
   private JButton aufnehmen = . . . . .
   private JButton abbrechen = . . . . .
   private JTextField titel = new JTextField (30);
   private JTextField unterTitel = new JTextField (30);
   private JTextField isbn = new JTextField (30);
   private JTextField anzahl = new JTextField (10);

   private static final long serialVersionUID = 1L;

   private MediumVerwaltung buecher;

   public BuchAufnehmenGUI(JFrame parent)
   {
      super (parent, "Buch aufnehmen", true);

      buecher = MediumVerwaltung.getRefToInstance();

      setLayout (new GridLayout (5, 1));

      dialogAufbauen();
      controllerHinzufuegen();

      pack();
      setVisible (true);
   }

   private void dialogAufbauen()
   {
      JPanel pane1 = new JPanel();
      pane1.setLayout (new FlowLayout(FlowLayout.LEFT));
      pane1.add (new JLabel ("Titel:         "));
      pane1.add (titel);
      add (pane1);

      JPanel pane2 = new JPanel();
      . . . . .
      . . . . .
      . . . . .
      . . . . .

      JPanel pane3 = new JPanel();
      . . . . .
      . . . . .
      . . . . .
      . . . . .

      JPanel pane4 = new JPanel();
      . . . . .
      . . . . .
      . . . . .
      . . . . .

      JPanel pane5 = new JPanel();
      pane5.setLayout (new FlowLayout(FlowLayout.LEFT));
      pane5.add (aufnehmen);
      pane5.add (abbrechen);
      add (pane5);
   }

   private void controllerHinzufuegen()
   {
      aufnehmen.addActionListener(new ActionListener()
      {
         public void actionPerformed (ActionEvent e)
         {
            // Methode buchAufnehmen() der Klasse MediumVerwaltung
            // aufrufen.
            . . . . .

            // Dialog unsichtbar machen.
            setVisible (false);
            // Dialog zerst�ren.
            dispose();
         }
      });

      abbrechen.addActionListener(new ActionListener()
      {
         public void actionPerformed (ActionEvent e)
         {
            . . . . .
            . . . . .
         }
      });
   }
}
