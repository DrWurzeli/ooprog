package aufgabe2;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person refPerson = null;
		
		refPerson = new Person();
		
		refPerson.setName("Mustermann");
		refPerson.setVorname("Max");
		
		System.out.println("" + refPerson.getVorname() + " " + refPerson.getName() + "");
		
		refPerson = new Person();
		
		refPerson.setName("Meister");
		refPerson.setVorname("Ralf");
		
		System.out.println("" + refPerson.getVorname() + " " + refPerson.getName() + "");
		
	}

}
