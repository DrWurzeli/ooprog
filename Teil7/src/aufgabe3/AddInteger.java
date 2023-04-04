package aufgabe3;

public class AddInteger {

	public static void main(String[] args) {
		
		if(args.length != 2) {
			System.out.println("Nicht zwei Zahlen.");
		}
		else {
			int zahl1 = Integer.parseInt(args[0]);
			int zahl2 = Integer.parseInt(args[1]);
			System.out.println(zahl1+zahl2);
		}

	}

}
