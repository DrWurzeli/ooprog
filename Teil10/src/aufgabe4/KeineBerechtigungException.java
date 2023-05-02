package aufgabe4;

@SuppressWarnings("serial")
public class KeineBerechtigungException extends Exception{
	
	public KeineBerechtigungException(String message) {
		super(message);
	}
}
