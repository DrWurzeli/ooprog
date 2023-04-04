package vertiefendeAufgaben;

//Datei: IntArrayTest.java

public class IntArrayTest
{
public static void main (String[] args)
{
   int[] array = {4, 19, 20, 7, 36, 18, 1, 5};
   IntArray intArray = new IntArray();

   // Das intArray mit den Werten von array füllen
   for (int i = 0; i < array.length; i++)
      intArray.put (i, array [i]);
   
   intArray.print();
   
   System.out.println ("Minimum: " + intArray.min());
   System.out.println ("Maximum: " + intArray.max());
   System.out.println ("Average: " + intArray.average());
   
   intArray.sort();
   intArray.print();
}
}
