package aufgabe4;

public class TestBuch {

	public static void main(String[] args) {

		Buch meinBuch = new Buch("Test", "123-4567-8910", 1);
		
		meinBuch.ausgeben();
		
		meinBuch = new Buch("Test2", "Untertitel1", "123-456-789", 2);
		
		meinBuch.ausgeben();
		
	}

}
