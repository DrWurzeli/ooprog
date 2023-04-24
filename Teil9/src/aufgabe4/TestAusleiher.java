package aufgabe4;

public class TestAusleiher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ausleiher a1 = new Ausleiher("Max", "Mustermann", 100);
		
		a1.ausgeben();
		
		Person p1 = a1;
		p1.ausgeben();
		
	}

}
