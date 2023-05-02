package aufgabe1;

import java.util.Scanner;

public class Buch extends Medium{
	
	private static int buchBestand;
	
	public Buch(String titel, String untertitel, String mediumNummer, int anzahlExemplare) {
		super(titel, untertitel, mediumNummer, anzahlExemplare);
		buchBestand++;
	}
	
	public Buch(String titel, String mediumNummer, int anzahlExemplare) {
		super(titel, mediumNummer, anzahlExemplare);
	}
	
	public Buch(Scanner eingabe) {
		super(eingabe);
		System.out.println("Bitte ISBN eingeben: ");
		mediumNummer = eingabe.next();
		buchBestand++;
		
	}
	
	public static int getBuchBestand() {
		return buchBestand;
	}
	
	@Override
	public String toString() {
		return "[Buch]\n" + super.toString().replace("Nummer", "ISBN");
	}
}
