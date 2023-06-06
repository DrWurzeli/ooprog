package aufgabe4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Medium implements Comparable<Medium>{
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
		
	    while (true){
	    	try{
	            System.out.print("Bitte geben Sie die Exemplare ein: ");
	            anzahlExemplare = eingabe.nextInt();
	            break;
	        }
	        catch (InputMismatchException e){
	            System.out.println ("Falsche Eingabe!");
	            System.out.println ("Bitte eine ganze Zahl eingeben!");
	        }
	    	finally{
	            eingabe.nextLine();
	        }
	    }
	    bestand++;
	}
	
	@Override
	public String toString() {
			if (untertitel == "" || untertitel == null) {
				return titel + " : " + "" + " : " + mediumNummer + " : " + anzahlExemplare;
			}
			else {
				return titel + " : " + untertitel + " : " + mediumNummer + " : " + anzahlExemplare;
			}
	}

	@Override
	public int compareTo(Medium ref) {
		return titel.compareToIgnoreCase(ref.titel);
	}
}
