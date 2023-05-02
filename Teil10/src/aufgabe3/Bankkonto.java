package aufgabe3;

public class Bankkonto {

	private double konto;
	   
	public void einzahlen (double betrag) throws TransaktionsException{
		if (betrag < 0) {
	         throw new TransaktionsException();
		}
		this.konto = konto + betrag;
	}
	   
	public void auszahlen (double betrag) throws TransaktionsException{
		if (betrag < 0 || (konto-betrag < 0)){
	         throw new TransaktionsException();
	    }
	      
	    this.konto = konto - betrag;
	}
	   
	public double getKontostand(){
	    return konto;
	}
	   
}
