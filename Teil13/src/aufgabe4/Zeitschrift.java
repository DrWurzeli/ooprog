package aufgabe4;

public class Zeitschrift extends Medium{
	
	private static int zeitschriftBestand;
	
	public Zeitschrift(String titel, String untertitel, String mediumNummer, int anzahlExemplare) {
		super(titel, untertitel, mediumNummer, anzahlExemplare);
		zeitschriftBestand++;
	}
	
	public Zeitschrift(String titel, String mediumNummer, int anzahlExemplare) {
		this(titel, "", mediumNummer, anzahlExemplare);
	}
	
	public static int getZeitschriftBestand() {
		return zeitschriftBestand;
	}
	
	@Override
	public String toString() {
		return "[Zeitschrift]: " + super.toString().replace("Nummer", "ISSN");
	}
}