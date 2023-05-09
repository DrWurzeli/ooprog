package aufgabe1;

public class TintenstrahlDrucker implements Drucker{
	private int nummer;
	private static int anzahl = 0;
	
	public TintenstrahlDrucker() {
		nummer = ++anzahl;
	}
	
	public int drucken (String text){
		System.out.println("TintenDrucker" + nummer + ":");
		System.out.println(text);
		return Drucker.DRUCK_ERFOLGREICH;
	}
	
	public int testAusdruck() {
		System.out.println("TintenDrucker" + nummer + ":");
		System.out.println(TEST_AUSGABE);
		return Drucker.DRUCK_ERFOLGREICH;
	}
}