package aufgabe4;

public class Ausleiher extends Person {
	private int ausleiherNummer;
	
	public Ausleiher(String vorname, String name, int ausleiherNummer) {
		super(vorname, name);
		this.ausleiherNummer = ausleiherNummer;
	}
	
	@Override
	public void ausgeben() {
		super.ausgeben();
		System.out.println("Nummer: " + ausleiherNummer);
	}
	
}
