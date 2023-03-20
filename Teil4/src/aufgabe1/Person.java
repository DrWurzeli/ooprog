package aufgabe1;

/**
 *
 * @version 2.0
 * @author me, myself and I
 *
 */

public class Person {
	
	private String vorname;
	private String nachname;
	
	/**
	 * Diese Methode setzt den Vornamen der Person.
	 * @param v Vorname der Person.
	 */
	public void setVorname(String v) {
		vorname = v;
	}
	
	/**
	 * Diese Methode setzt den Nachnamen der Person.
	 * @param n Nachname der Person.
	 */
	public void setNachname(String n) {
		nachname = n;
	}
	
	/**
	 * Die Methode getVorname() gibt den Vornamen der Person zurück.
	 * @return Vorname der Person vom Typ String.
	 */
	public String getVorname() {
		return vorname;
	}
	
	/**
	 * Die Methode gibt den Nachnamen der Person zurück.
	 * @return Nachname der Person vom Typ String.
	 */
	public String getNachname() {
		return nachname;
	}
}
