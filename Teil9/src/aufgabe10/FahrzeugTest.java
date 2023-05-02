package aufgabe10;

public class FahrzeugTest
{
   public static void main (String args[])
   {
      System.out.println ("Start des Programms");

      // Anlegen eines Arrays aus 6 Fahrzeugen
      Fahrzeug[] fahrzeuge = new Fahrzeug[6];

      // Die ersten 3 Elemente des Arrays sollen mit Pkws
      // gefuellt werden
      System.out.println();
      System.out.println ("3 Pkws");

      for(int i=0; i<3; i++) {
    	  fahrzeuge[i] = new Pkw();
      }
      
      // Die drei letzten Elemente mit Motorraedern fuellen 
      System.out.println();
      System.out.println ("3 Motorraeder");
      
      for(int j = 3; j <6; j++) {
    	  fahrzeuge[j] = new Motorrad();
      }   

      // Geben Sie in einer Schleife fuer alle Array-Elemente 
      // die entsprechenden Datenfelder aus

     for (Fahrzeug x : fahrzeuge) {
    	 x.print();
     }

      // Ermittlung des Gesamtwerts aller Fahrzeuge

      int summe = 0;
      
      for (Fahrzeug y : fahrzeuge) {
    	  summe += y.getPreis();
      }

      System.out.println();
      System.out.println ("Gesamtwert aller Fahrzeuge: " + summe);
   }
}

