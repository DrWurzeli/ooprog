package aufgabe5;

public class Zeitschrift {
	private String titel;
	private String unterTitel;
	private String issn;
	int anzahlExemplare;
	
	static int bestand;
	
	public Zeitschrift(String titel, String issn, int anzahlExemplare) {
		this(titel, "", issn, anzahlExemplare);
	}
	
	public Zeitschrift(String titel, String unterTitel, String issn, int anzahlExemplare) {
		this.titel = titel;
		this.unterTitel = unterTitel;
		this.issn = issn;
		this.anzahlExemplare = anzahlExemplare;
		bestand++;
	}
	
	public void ausgeben() {
		System.out.println("Titel: " + titel + "\nUntertitel: " + unterTitel + "\nISSN: " + issn);
	}
	
	public static int getBestand() {
		return bestand;
	}
	
}
