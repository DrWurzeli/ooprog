package aufgabe2;

public class LaserDrucker implements Drucker {
	private int nummer;
	private static int anzahl = 0;
	
	public LaserDrucker() {
		nummer = ++anzahl;
	}
	
	public int drucken (String text){
		System.out.println("LaserDrucker" + nummer + ":");
		System.out.println(text);
		return Drucker.DRUCK_ERFOLGREICH;
	}
	public int testAusdruck() {
		System.out.println("LaserDrucker" + nummer + ":");
		System.out.println(TEST_AUSGABE);
		return Drucker.DRUCK_ERFOLGREICH;
	}
}
