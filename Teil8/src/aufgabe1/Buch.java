package aufgabe1;

public class Buch {
	private String titel;
	private String isbn;
	private int anzahlExemplare;
	
	public void setTitel(String neuerTitel) {
		titel = neuerTitel;
	}
	
	public void setIsbn(String neueIsbn) {
		isbn = neueIsbn;
	}
	
	public void setAnzahlExemplare(int neueAnzahl) {
		anzahlExemplare = neueAnzahl;
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
