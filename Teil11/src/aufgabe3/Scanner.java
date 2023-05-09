package aufgabe3;

public interface Scanner
{
	String GERAET_AUS = "Gerät ausgeschaltet";
	String KEIN_DOKUMENT = "Kein Dokument zum Scannen";
    public String alsTextScannen() throws ScanException;
}
