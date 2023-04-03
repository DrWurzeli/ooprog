package aufgabe1_2;

//import java.util.Arrays;

public class TestPerson2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person[] refPerson = new Person[3];
		
		for (int i = 0; i < refPerson.length; i++) {
			refPerson[i] = new Person();
		}
		
		refPerson[0].setVorname("Max");
		refPerson[1].setVorname("Peter");
		refPerson[2].setVorname("Hans");
		
		refPerson[0].setNachname("Mustermann");
		refPerson[1].setNachname("Pan");
		refPerson[2].setNachname("Glück");

		//Arrays.stream(refPerson).forEach(z -> System.out.println(z.getVorname() + " " + z.getNachname()));
		
		//Teil 6:
		for (Person x : refPerson) {
            System.out.println(x.getVorname() + " " + x.getNachname());
        }
	}

}
