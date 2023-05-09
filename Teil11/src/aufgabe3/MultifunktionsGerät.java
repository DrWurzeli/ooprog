package aufgabe3;

public class MultifunktionsGerät implements Drucker, Scanner {
	private int nummer;
	private static int anzahl = 0;
	
	public MultifunktionsGerät() {
		nummer = ++anzahl;
	}
	public int drucken (String text) {
		System.out.println("MG Nr" + nummer + ":");
		System.out.println(text);
		return DRUCK_ERFOLGREICH;
	}
	public int testAusdruck() {
		System.out.println("MG Nr" + nummer + ":");
		System.out.println(TEST_AUSGABE);
		return DRUCK_ERFOLGREICH;
	}
	public String alsTextScannen () throws ScanException {
		return KEIN_DOKUMENT;
	}
}
