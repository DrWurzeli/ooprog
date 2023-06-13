// Datei: ModalerDialogTest.java
package aufgabe2;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ModalerDialogTest
{
   public static void main (String[] args)
   {
      JFrame frame = new JFrame ("Vaterfenster");

      // Erster Parameter: Referenz auf das Vaterfenster.
      // Zweiter Parameter: In der Titelzeile anzuzeigender Text.
      // Dritter Parameter: Gibt an, ob der Dialog in einer modalen 
      // Beziehung zu seinem Vaterfenster stehen soll.
      final JDialog dialog = new JDialog(frame, "TestDialog", true);


      JButton start = new JButton ("Dialog anzeigen");
      // Controller für die Schaltfläche des Vaterfensters implementieren.
      start.addActionListener (new ActionListener()
      {
         public void actionPerformed (ActionEvent action)
         {
            // Dialog sichtbar machen.
            dialog.setVisible (true);
         }
      });
      frame.setLayout (new FlowLayout());
      frame.add (start);
      frame.setSize (400, 100);
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      frame.setVisible (true);


      JButton close = new JButton ("Schließen");
      // Controller für die Schaltfläche des Dialogfensters implementieren.
      close.addActionListener (new ActionListener()
      {
         public void actionPerformed (ActionEvent action)
         {
            // Dialog unsichtbar machen und zerstören.
            dialog.setVisible (false);
            dialog.dispose();
         }
      });

      dialog.setLayout (new FlowLayout());
      dialog.add (close);
      dialog.setSize (200, 100);
   }
}

