package aufgabe4;

/**
 * 
 * @author msander
 * @version 2.0
 *
 */
public class Buch {
	private String titel;
	private String untertitel;
	private String isbn;
	private int anzahlExemplare;
	
	public Buch(String titel, String isbn, int anzahlExemplare) {
		this(titel, null, isbn, anzahlExemplare);
	}
	
	public Buch(String titel, String untertitel, String isbn, int anzahlExemplare) {
		this.titel = titel;
		this.untertitel = untertitel;
		this.isbn = isbn;
		this.anzahlExemplare = anzahlExemplare;
	}
	
	public void ausgeben() {
		if(untertitel == null) {
			System.out.println("Titel: " + titel + "\nISBN: " + isbn + "\nAnzahl: " + anzahlExemplare);
		}
		else {
			System.out.println("Titel: " + titel + "\nUntertitel: " + untertitel + "\nISBN: " + isbn + "\nAnzahl: " + anzahlExemplare);
		}
	}
}
