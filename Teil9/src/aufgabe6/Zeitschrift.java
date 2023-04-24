package aufgabe6;

public class Zeitschrift extends Medium{
	
	public Zeitschrift(String titel, String untertitel, String mediumNummer, int anzahlExemplare) {
		super(titel, untertitel, mediumNummer, anzahlExemplare);
	}
	
	@Override
	public void ausgeben() {
			super.ausgeben();
	}
}