package aufgabe3;

public class TestAusleiher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ausleiher a1 = new Ausleiher("Max", "Mustermann", 100);
		Person p1 = new Ausleiher("Test", "Ausleiher", 100);
		
		p1.ausgeben();
		Ausleiher a2 = (Ausleiher) p1;
		
		a2.ausgeben();
		System.out.println(a2.getAusleiherNummer());
		
		a1.ausgeben();
		System.out.println("\nNummer: " + a1.getAusleiherNummer());
	}

}
