package aufgabe1;
import java.io.*;
import java.util.Scanner;

public class TestPrintStream {

	public static void main(String[] args) throws FileNotFoundException {
		FileOutputStream fos = new FileOutputStream("Lesbar.txt");
		PrintStream pos = new PrintStream(fos);
			
		for(int i=0;i<10;i++) {
			pos.println(i);
		}

		pos.close();
		
		FileInputStream fis = new FileInputStream("Lesbar.txt");
		Scanner input = new Scanner(fis);
		
		while(input.hasNextInt()){
			System.out.println(input.nextInt());
		}
		
		input.close();
	}
}
