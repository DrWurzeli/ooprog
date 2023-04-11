package aufgabe6;

public class TestKinosaal {

	public static void main(String[] args) {
		// 2 Kinosäle mit 50 bzw. 100 Plätzen
		Kinosaal[] saele = new Kinosaal[2];
		saele[0] = new Kinosaal();
		saele[1] = new Kinosaal();
		saele[0].setAnzahlSitzplaetzeSaal(50);
		saele[1].setAnzahlSitzplaetzeSaal(100);
		
		for(Kinosaal x : saele) {
			System.out.println("Saal: " + x.getSaalNummer() + " Plaetze: " + x.getAnzahlSitzplaetzeSaal());
		}
		
		System.out.println("Kinoplaetze: " + Kinosaal.getAnzahlSitzplaetzeKino() + " Saele: " + Kinosaal.getAnzahlKinosaele());
	
	}

}
