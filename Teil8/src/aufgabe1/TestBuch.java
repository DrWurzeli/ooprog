package aufgabe1;

public class TestBuch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buch meinBuch = new Buch();
		
		meinBuch.setTitel("Hello world!");
		meinBuch.setIsbn("1234567890");
		meinBuch.setAnzahlExemplare(1);
		
		System.out.println("Mein Buch hat den Titel: " + meinBuch.getTitel() + "\nund die ISBN: " + meinBuch.getIsbn() + "\nes gibt " + meinBuch.getAnzahlExemplare()+ " Examplare.");
		
	}

}
