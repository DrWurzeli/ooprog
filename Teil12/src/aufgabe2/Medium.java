package aufgabe2;

public class Medium implements Comparable<Medium>{
	private String titel;
	private String untertitel;
	private String mediumNummer;
	private int anzahlExemplare;
	
	private static int bestand = 0;
	
	public static int getBestand() {
		return bestand;
	}
	
	public int compareTo(Medium ref) {
		return mediumNummer.compareTo(ref.mediumNummer);
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
