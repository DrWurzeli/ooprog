package aufgabe1;

public class Person {
	private String vorname;
	private String name;
	
	public Person(String vorname, String name) {
		this.vorname = vorname;
		this.name = name;
	}
	
	public void ausgeben() {
		System.out.println("Vorname: " + vorname + "\nNachname: " + name);
	}
}
