package zusatzAufgaben;

import java.util.Scanner;

public class Zahlen
	{
	   public static void main (String[] args)
	   {
	  
		  System.out.println("Bitte eine Zahl eingeben: ");
		  
	      Scanner scan = new Scanner (System.in);

	      int zahl = scan.nextInt();
	      
	      System.out.print ("Die eingegebene Zahl ist ");
	      
	      scan.close();
	      
	      switch(zahl) {
	      case (1): System.out.println("EINS"); break;
	      case (2): System.out.println("ZWEI");	break;
	      case (3): System.out.println("DREI");	break;
	      case (4): System.out.println("VIER");	break;
	      case (5): System.out.println("FUENF");	break;
	      default:	System.out.println ("UNBEKANNT");	break;
	      }
	   }
	}