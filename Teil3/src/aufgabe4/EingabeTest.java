package aufgabe4;
import java.util.Scanner;

public class EingabeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner eingabe = new Scanner(System.in);
		
		System.out.println("Erste Zahl eingeben: ");
		int zahl1 = eingabe.nextInt();
		
		System.out.println("Zweite Zahl eingeben: ");
		int zahl2 = eingabe.nextInt();
		
		eingabe.close();
		
		int summe = zahl1 + zahl2;
		
		System.out.println("Die Summe von " + zahl1 + " und " + zahl2 + " ist: " +summe);
		

	}

}
