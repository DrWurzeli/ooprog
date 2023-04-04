package aufgabe1;

public class TestParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person();
		p1.setNachname("Mustermann");
		p1.setVorname("Max");
		
		System.out.println("Ausgabe Person vor Methodenaufruf: ");
		System.out.println(p1.getNachname() + " " + p1.getVorname());
		
		veränderePerson(p1);
		
		System.out.println("Ausgabe Person nach Methodenaufruf: ");
		System.out.println(p1.getNachname() + " " + p1.getVorname());

	}
	
	public static void veränderePerson(Person ref) {
		ref.setNachname("Weihnachtsmann");
		System.out.println("Ausgabe der Person in der Methode: ");
		System.out.println(ref.getNachname() + " " + ref.getVorname());
	}

}
