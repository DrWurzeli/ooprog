package aufgabe6;

public class Buch extends Medium{
	
	private static int buchBestand;
	
	public Buch(String titel, String untertitel, String mediumNummer, int anzahlExemplare) {
		super(titel, untertitel, mediumNummer, anzahlExemplare);
		buchBestand++;
	}
	
	public Buch(String titel, String mediumNummer, int anzahlExemplare) {
		super(titel, mediumNummer, anzahlExemplare);
	}
	
	public static int getBuchBestand() {
		return buchBestand;
	}
	
	@Override
	//not really though, protected variables in Medium necessary to change output. this just calls medium ausgeben()
	public void ausgeben() {
			super.ausgeben();
	}
}
