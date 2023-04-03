package aufgabe1_2;

public class TestPerson2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person[] refPerson = new Person[3];
		
		for(int x = 0; x < refPerson.length; x++) {
			refPerson[x] = new Person();
		}
		
		refPerson[0].setVorname("Max");
		refPerson[1].setVorname("Peter");
		refPerson[2].setVorname("Hans");
		
		refPerson[0].setNachname("Mustermann");
		refPerson[1].setNachname("Pan");
		refPerson[2].setNachname("Glück");
		
		for(int i = 0; i < refPerson.length; i++) {
			System.out.println("" + refPerson[i].getVorname() + " " + refPerson[i].getNachname() + "");
		}
		
	}

}
