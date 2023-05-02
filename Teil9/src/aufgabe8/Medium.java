package aufgabe8;

public class Medium {
	private String titel;
	private String untertitel;
	private String mediumNummer;
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
