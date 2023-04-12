package aufgabe7;

public class TestStack
{
   public static void main(String[] args)
   {
      Stack stackRef = new Stack(5);
      stackRef.pushToStack(7,3,4,9,1);
      
      stackRef.stackPrint();

      System.out.println ("\nAusgabe der Zahlen: ");      
      while (!stackRef.isEmpty())
      {
         int rueckgabe;
         rueckgabe = stackRef.pop();
         
         System.out.println ("Die Zahl war: " + rueckgabe);
      }
   }
}
