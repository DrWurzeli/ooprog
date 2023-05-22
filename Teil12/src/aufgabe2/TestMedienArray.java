package aufgabe2;

public class TestMedienArray
{
   public static void main (String[] args)
   {
      Buch buch1 = new Buch ("Lehrbuch der SW-Technik", "SW-Management", "978-3-8274-1161-7", 5);
      Buch buch2 = new Buch ("Blabla", "blabla", "123-4-5678-9101-1", 1);
      Zeitschrift z1 = new Zeitschrift ("Informatik Spektrum", "Java Modeling Language", "0170-6012", 2);
      
      System.out.println ("Nur Bücher erlaubt:");
      
      MedienArray<Buch> buchArr = new MedienArray<Buch>();
      buchArr.einfuegen (buch1);
      buchArr.einfuegen (buch2);
      buchArr.ausgeben();
      
      System.out.println ("\nNur Zeitschriften erlaubt:");
      MedienArray<Zeitschrift> zeitArr = new MedienArray<Zeitschrift>();
      zeitArr.einfuegen(z1);
      
      System.out.println ("\nBücher und Zeitschriften erlaubt:");
      MedienArray<Medium> medArr = new MedienArray<Medium>();
      medArr.einfuegen(buch1);
      medArr.einfuegen(z1);
   }
}