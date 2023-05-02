package aufgabe10;

import java.util.*;

class Fahrzeug {
	private float preis;
	private String herstellerName;
	protected static Scanner eingabe = new Scanner (System.in);

	public Fahrzeug() {
		System.out.println();
		System.out.print ("Geben Sie den Herstellernamen ein: ");
		herstellerName = eingabe.next();
		System.out.print ("Geben Sie den Preis ein: ");
		preis = eingabe.nextFloat();
	}

	public void print() {
		System.out.println();
		System.out.println ("Herstellername: " + herstellerName);
		System.out.println ("Preis: " + preis);
	}

	// Methode getPreis();
	public float getPreis() {
		return preis;
	}

}