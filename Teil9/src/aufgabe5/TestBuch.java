package aufgabe5;

public class TestBuch {

	public static void main(String[] args) {
		
		System.out.println("Anzahl verschiedener Bücher: " + Buch.getBestand());

		Buch meinBuch = new Buch("Test", "123-4567-8910", 1);
		
		meinBuch.ausgeben();
		
		meinBuch = new Buch("Test2", "Untertitel1", "123-456-789", 2);
		
		meinBuch.ausgeben();
		
		System.out.println("Anzahl verschiedener Bücher: " + Buch.getBestand());
		
	}

}
