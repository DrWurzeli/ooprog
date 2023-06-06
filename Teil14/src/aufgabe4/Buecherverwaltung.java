package aufgabe4;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//ToDo: read all saved books from file - with custom constructor. 2. save all books into file daten.txt on quit with printstream
public class Buecherverwaltung
{
   private ArrayList<Buch> arr = new ArrayList<Buch>();

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
            arr.add(new Buch(eingabe));
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
	  Collections.sort(arr);
      for (Buch x : arr)
         System.out.println (x);
   }

   public static void main (String args[]){
      Buecherverwaltung bibliothek = new Buecherverwaltung();
      bibliothek.auswahlAnzeigen();
   }
}

