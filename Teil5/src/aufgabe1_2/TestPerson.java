package aufgabe1_2;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person refPerson = null;
		
		refPerson = new Person();
		
		refPerson.setNachname("Mustermann");
		refPerson.setVorname("Max");
		
		System.out.println("" + refPerson.getVorname() + " " + refPerson.getNachname() + "");
		
		refPerson = new Person();
		
		refPerson.setNachname("Meister");
		refPerson.setVorname("Ralf");
		
		System.out.println("" + refPerson.getVorname() + " " + refPerson.getNachname() + "");
		
	}

}
