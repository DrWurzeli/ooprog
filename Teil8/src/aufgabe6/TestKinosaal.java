package aufgabe6;

public class TestKinosaal {

	public static void main(String[] args) {
		// 2 Kinosäle mit 50 bzw. 100 Plätzen
		Kinosaal test = new Kinosaal();
		test.setAnzahlSitzplaetzeSaal(10);
		
		System.out.println("Saal: " + test.getAnzahlSitzplaetzeSaal() + " " + test.getSaalNummer());
		System.out.println("Kino: " + Kinosaal.getAnzahlSitzplaetzeKino() + " " + Kinosaal.getAnzahlKinosaele());
	}

}
