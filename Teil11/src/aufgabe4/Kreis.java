package aufgabe4;

import java.lang.Math;

public class Kreis extends GeometrischeFigur{
	
	private int radius;
	
	public Kreis(int radius) {
		this.radius = radius;
	}
	
	@Override
	protected double berechneFlaeche() {
		return Math.PI*(Math.pow(radius, 2));
	}

	@Override
	protected double berechneUmfang() {
		return Math.PI*radius*2;
	}

}
