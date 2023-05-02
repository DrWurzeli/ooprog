package aufgabe10;

class Motorrad extends Fahrzeug
{
   private String fahrzeugtyp = "Motorrad";

   public void print(){
	   super.print();
	   System.out.println("Fahrzeugtyp: " + fahrzeugtyp);
   }
}
