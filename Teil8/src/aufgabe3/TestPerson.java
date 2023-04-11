package aufgabe3;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person refPerson = null;
		
		refPerson = new Person("Max", "Muster");
		
		refPerson.ausgeben();
		
		refPerson = new Person("Maximilian", "Mustermann");
		
		refPerson.ausgeben();
		
	}

}
