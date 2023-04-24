package aufgabe5;

public class Zeitschrift {
	private String titel;
	private String unterTitel;
	private String issn;
	int anzahlExemplare;
	
	static int bestand;
	
	public void ausgeben() {
		System.out.println("Titel: " + titel + "\nUntertitel: " + unterTitel + "\nISSN: " + issn);
	}
	
	public static int getBestand() {
		return bestand;
	}
	
}
