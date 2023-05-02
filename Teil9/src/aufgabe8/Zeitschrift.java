package aufgabe8;

public class Zeitschrift extends Medium{
	
	private static int zeitschriftBestand;
	
	public Zeitschrift(String titel, String untertitel, String mediumNummer, int anzahlExemplare) {
		super(titel, untertitel, mediumNummer, anzahlExemplare);
	}
	
	public Zeitschrift(String titel, String mediumNummer, int anzahlExemplare) {
		super(titel, mediumNummer, anzahlExemplare);
	}
	
	public static int getZeitschriftBestand() {
		return zeitschriftBestand;
	}
	
}