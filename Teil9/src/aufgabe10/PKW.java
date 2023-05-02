package aufgabe10;

class Pkw extends Fahrzeug
{
   private String fahrzeugtyp = "Pkw";
   private String modellBezeichnung;

   public Pkw()
   {
      super();
      System.out.print ("Geben Sie die Modellbezeichnung ein: ");
      modellBezeichnung = eingabe.next();
   }

   public void print() {
		   super.print();
		   System.out.println("Fahrzeugtyp: " + fahrzeugtyp);
		   System.out.println("Modell: " + modellBezeichnung);
   }
		   
}
