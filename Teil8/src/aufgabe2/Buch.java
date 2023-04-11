package aufgabe2;

public class Buch {
	private String titel;
	private String isbn;
	private int anzahlExemplare;
	
	public void setTitel(String titel) {
		this.titel = titel;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public void setAnzahlExemplare(int anzahlExemplare) {
		this.anzahlExemplare = anzahlExemplare;
	}
	
	public String getTitel() {
		return titel;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public int getAnzahlExemplare() {
		return anzahlExemplare;
	}
}
