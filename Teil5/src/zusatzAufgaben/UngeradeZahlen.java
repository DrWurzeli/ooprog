package zusatzAufgaben;

import java.util.Scanner;

public class UngeradeZahlen
{
public static void main (String[] args)
{
   int startwert, endwert;
   Scanner scan = new Scanner (System.in);

   System.out.println ("Dieses Programm gibt alle " +
                       "ungeraden Zahlen zwischen " +
                       "dem Startwert und Endwert aus.");
   System.out.print ("Gib den Startwert ein: ");
   startwert = scan.nextInt();

   do
   {
      System.out.print ("Gib den Endwert ein: ");
      endwert = scan.nextInt();
      System.out.println();
   } while (endwert < startwert);

   scan.close();
   
   int i = startwert;
   
   while(i <= endwert){      
	  if (i % 2 == 0) {
		  i++;
	      continue;
	  }
	  else {
		  System.out.println ("Die Zahl " + i + " ist ungerade!");
		  i++;
	  }
   }
}
}
