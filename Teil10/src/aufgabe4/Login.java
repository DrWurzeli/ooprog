package aufgabe4;

public class Login {
	private boolean angemeldet = false;
	
	public void anmelden(String benutzer, String passwort) throws ZugriffUngueltigException {
		if (benutzer.equals("Test") && passwort.equals("12345")) {
			this.angemeldet = true;
		}
		else if (angemeldet) {
			System.out.println("Bereits angemeldet.");
		}
		else {
			throw new ZugriffUngueltigException("Ungueltige Anmeldedaten");
		}
	}
	
	public void abmelden() {
		this.angemeldet = false;
	}
	
	public void bearbeiten() throws KeineBerechtigungException {
		if (angemeldet) {
			System.out.println("Beep boop");
		}
		else {
			throw new KeineBerechtigungException("Keine Berechtigung. Sind Sie angemeldet?");
		}
	}
}
