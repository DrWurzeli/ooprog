package aufgabe1;

import java.util.Scanner;

public class Medium {
	private String titel;
	private String untertitel;
	protected String mediumNummer;
	private int anzahlExemplare;
	
	private static int bestand = 0;
	
	public static int getBestand() {
		return bestand;
	}
	
	public Medium(String titel, String mediumNummer, int anzahlExemplare) {
		this(titel, null, mediumNummer, anzahlExemplare);
	}
	
	public Medium(String titel, String untertitel, String mediumNummer, int anzahlExemplare) {
		bestand++;
		this.titel = titel;
		this.untertitel = untertitel;
		this.mediumNummer = mediumNummer;
		this.anzahlExemplare = anzahlExemplare;
	}
	
	public Medium(Scanner eingabe) {
		System.out.println("Bitte Titel eingeben:");
		this.titel = eingabe.nextLine();
		System.out.println("Bitte Untertitel eingeben: ");
		this.untertitel = eingabe.nextLine();
		System.out.println("Bitte Anzahl Exemplare eingeben: ");
		this.anzahlExemplare = eingabe.nextInt();
	}
	
	@Override
	public String toString() {
			if (untertitel == "" || untertitel == null) {
				return "Titel: " + titel + "\nNummer: " + mediumNummer + "\nAnzahl: " + anzahlExemplare;
			}
			else {
				return "Titel: " + titel + "\nUntertitel: " + untertitel + "\nNummer: " + mediumNummer + "\nAnzahl: " + anzahlExemplare;
			}
	}
}
