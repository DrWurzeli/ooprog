package aufgabe4;

public class Quadrat extends GeometrischeFigur{
	
	private int seitenlaenge;
	
	public Quadrat(int seitenlaenge) {
		this.seitenlaenge = seitenlaenge;
	}
	
	@Override
	protected double berechneFlaeche() {
		return Math.pow(seitenlaenge, 2);
	}

	@Override
	protected double berechneUmfang() {
		return 4*seitenlaenge;
	}

}
