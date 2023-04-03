package zusatzAufgaben;

import java.util.Scanner;

public class ZahlenVergleich
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.print ("Gib die erste Zahl ein: ");
      int zahl1 = scan.nextInt();
      System.out.print ("Gib die zweite Zahl ein: ");
      int zahl2 = scan.nextInt();

      scan.close();
      
      if (zahl1 > zahl2)
      {
         System.out.println("Zahl 1 ist größer als Zahl 2");
      } 
      else if (zahl2 > zahl1)
      {
         System.out.println("Zahl 2 ist größer als Zahl 1");
      }
      else
      {
         System.out.println("Die Zahlen sind gleich groß.");
      }
   }
}
