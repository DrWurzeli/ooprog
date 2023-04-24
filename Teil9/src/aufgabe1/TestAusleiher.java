package aufgabe1;

public class TestAusleiher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ausleiher a1 = new Ausleiher("Max", "Mustermann", 100);
		
		a1.ausgeben();
		System.out.println("\nNummer: " + a1.getAusleiherNummer());
	}

}
