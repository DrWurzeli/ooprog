package aufgabe8;

public class TestBestandsausgabe {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Medium[] medien = new Medium[4];
		medien[0] = new Buch("Java als erste Programmiersprache", "978-3-8348-0656-7", 5);
		medien[1] = new Buch("IT-Projektmanagement", "kompakt", "978-3-8274-1937-8", 3);
		medien[2] = new Zeitschrift("Informatik Spektrum", null, "0170-6012", 2);
		medien[3] = new Zeitschrift("Testzeitschrift", "", "0123-4567", 5);
		
		for(Medium x : medien) {
			System.out.println(x);
		}
		
	}

}
