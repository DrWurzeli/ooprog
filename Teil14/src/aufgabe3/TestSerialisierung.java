package aufgabe3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerialisierung {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Ausleiher a1 = new Ausleiher("Max", "Mustermann", 1);
		Ausleiher a2 = new Ausleiher("Eric", "Cartman", 2);
		
		FileOutputStream fos = new FileOutputStream("Ausleiher.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(a1);
		oos.writeObject(a2);
		
		oos.close();
		
		FileInputStream fis = new FileInputStream("Ausleiher.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		System.out.println((Ausleiher)ois.readObject());
		System.out.println((Ausleiher)ois.readObject());
		
		ois.close();
	}
}