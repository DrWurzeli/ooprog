
public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person();
		
		p1.setNachname("Mustermann");
		p1.setVorname("Max");
		
		Person p2 = new Person();
		
		p2.setNachname("Meister");
		p2.setVorname("Ralf");
		
		System.out.println("" + p1.getVorname() + " " + p1.getNachname() + "");
		System.out.println("" + p2.getVorname() + " " + p2.getNachname() + "");
		
	}

}
