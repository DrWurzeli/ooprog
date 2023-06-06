package aufgabe3;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 1L;
	private String vorname;
	private String name;
	
	public Person(String vorname, String name) {
		this.vorname = vorname;
		this.name = name;
	}
	
	public void ausgeben() {
		System.out.println("Vorname: " + vorname + "\nNachname: " + name);
	}
	
	@Override
	public String toString() {
		return vorname + " " + name;
	}
}
