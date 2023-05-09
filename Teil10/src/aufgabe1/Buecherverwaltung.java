package aufgabe1;

import java.util.Scanner;

public class Buecherverwaltung
{
   private Buch[] arr = new Buch [100];

   public void auswahlAnzeigen(){
      System.out.println("\nBitte Zahl und dann RETURN eingeben:");
      System.out.println ("<1> Buch anlegen");
      System.out.println ("<2> Bestand ausgeben");
      System.out.println ("<3> Beenden");
      auswahlAuswerten();
   }

   private void auswahlAuswerten(){
      Scanner eingabe = new Scanner (System.in);
      int auswahl = eingabe.nextInt();
      eingabe.nextLine();

      switch (auswahl){
         case 1:{
            arr [Buch.getBuchBestand()] = new Buch(eingabe);
            auswahlAnzeigen();
            break;
         }
         case 2:{
            bestandAusgeben();
            auswahlAnzeigen();
            break;
         }
         case 3:
            break;

         default:
            System.out.println ("Falsche Eingabe");
       }
      
      eingabe.close();
   }

   private void bestandAusgeben(){
      for (int i = 0; i < Buch.getBuchBestand(); i++)
         System.out.println (arr[i]);
   }

   public static void main (String args[]){
      Buecherverwaltung bibliothek = new Buecherverwaltung();
      bibliothek.auswahlAnzeigen();
   }
}

