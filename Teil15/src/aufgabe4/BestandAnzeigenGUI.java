import javax.swing.JTable;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.Dimension;
import java.lang.reflect.Array;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableRowSorter;
import aufgabe4.entitaeten.Buch;
import aufgabe4.entitaeten.MediumVerwaltung;

public class BestandAnzeigenGUI . . . . .
{
   private static final long serialVersionUID = 1L;

   public BestandAnzeigenGUI(JFrame parent)
   {
      super (parent, "Bestand anzeigen", true);

      dialogAufbauen();

      pack();
      setVisible (true);
   }

   private void dialogAufbauen()
   {
      // Model f�r die Tabelle anlegen. Die Implementierung der Klasse
      // TableModel finden Sie unterhalb der Klasse BestandAnzeigenGUI.
      TableModel model = new TableModel();
      // Tabelle anlegen und Referenz auf Model �bergeben.
      JTable table = new JTable (model);

      // Tabelle mit Sortierfunktion ausstatten
      table.setRowSorter(new TableRowSorter<TableModel>(model));

      // Tabelle wird in einen scrollbaren GUI-Container vom
      // Typ JScrollPane gelegt.
      JScrollPane scrollingTable = new JScrollPane (table, 
                    ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                    ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
      // Die bevorzugte Gr��e des scrollbaren GUI-Containers wird gesetzt.
      scrollingTable.setPreferredSize (new Dimension (500, 100));
      // Hinzuf�gen des GUI-Containers zum Dialogfenster.
      add (scrollingTable);
   }
}


// Eigenes Model f�r die GUI-Komponente JTable. Ein Model f�r eine GUI-
// Komponten JTable muss von der abstrakten Klasse AbstractTableModel
// ableiten.
class TableModel extends AbstractTableModel
{
   // AbstractTableModel setzt eindeutige serialVersionUID voraus.
   private static final long serialVersionUID = 1L;

   // Spaltennamen f�r die Tabelle festlegen.
   private String[] columnNames = { "Titel", "Untertitel", "ISBN", "Anzahl"}; 

   private MediumVerwaltung buecher = . . . . .

   // �berschriebene Methode zur R�ckgabe des Spaltennamens.
   public String getColumnName (int col) 
   {
      return . . . . .
   }

   // �berschriebene Methode zur R�ckgabe der Spaltenanzahl.
   public int getColumnCount() 
   {
      return Array.getLength (columnNames);
   }

   // �berschriebene Methode zur R�ckgabe der Zeilenanzahl.
   public int getRowCount() 
   {
      . . . . .
   }

   // �berschriebene Methode zur R�ckgabe des Wertes einer Zelle.
   public Object getValueAt (int row, int column) 
   {
      Buch ref = buecher.getBuch (row);
      if (column == 0)
         return ref.getTitel();
      else if (. . . . .)
         return ref.getUnterTitel();
      else if (. . . . .)
         return . . . . .
      else
         return . . . . .
   }
}
