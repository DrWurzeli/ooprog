package aufgabe4;

public abstract class GeometrischeFigur
{
   protected abstract double berechneFlaeche();
   protected abstract double berechneUmfang();

   public void print()
   {
      System.out.println("Die Fläche beträgt: " + berechneFlaeche());
      System.out.println("Der Umfang beträgt: " + berechneUmfang());
      System.out.println();
   }
}
