package aufgabe1;

public class TestStack
{
public static void main (String args[]){

	//Specific stack of T type, here: Medium
   Stack<Medium> stack = new Stack<>(3);
   stack.push(new Buch ("Java als erste Programmiersprache",
             "Vom Einsteiger zum Profi", "978-3-8348-0656-7", 5));
   stack.push(new Buch ("Java", "kurz & gut",
             "978-3-89721-546-7", 3));
   stack.push(new Zeitschrift ("Informatik Spektrum",
             "Java Modeling Language", "0170-6012", 2));
   System.out.println ("Anzahl verschiedene Medien: "
               + (Buch.getBestand() + Zeitschrift.getBestand()));
   
   Zeitschrift z1 = (Zeitschrift) stack.pop();

   stack.stackPrint();
}
}