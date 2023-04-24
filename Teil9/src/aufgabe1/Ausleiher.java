package aufgabe1;

public class Ausleiher extends Person {
	private int ausleiherNummer;
	
	public Ausleiher(String vorname, String name, int ausleiherNummer) {
		super(vorname, name);
		this.ausleiherNummer = ausleiherNummer;
	}
	
	public int getAusleiherNummer() {
		return ausleiherNummer;
	}
	
}
