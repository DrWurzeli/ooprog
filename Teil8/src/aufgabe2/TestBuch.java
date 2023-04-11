package aufgabe2;

public class TestBuch {

	public static void main(String[] args) {

		Buch meinBuch = new Buch();
		
		meinBuch.setTitel("Hello world!");
		meinBuch.setIsbn("123-45678-90101");
		meinBuch.setAnzahlExemplare(1);
		
		System.out.println("Mein Buch hat den Titel: " + meinBuch.getTitel()
			+ "\nund die ISBN: " + meinBuch.getIsbn()
			+ "\nes gibt " + meinBuch.getAnzahlExemplare() + " Examplare.");
		
	}

}
