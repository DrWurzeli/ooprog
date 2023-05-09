package aufgabe1;

public interface Drucker
{
public static final String TEST_AUSGABE = "Test erfolgreich";
public static final int FEHLER_DRUCKER_AUS = 1;
public static final int FEHLER_KEIN_PAPIER = 2;
public static final int DRUCK_ERFOLGREICH = 0;


public int drucken (String text);
public int testAusdruck();   
}
