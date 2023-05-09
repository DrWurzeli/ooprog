package aufgabe3;

public class TestGeräte
{
   public static void main (String[] args)
   {
      MultifunktionsGerät mg1 = new MultifunktionsGerät();
      
      mg1.testAusdruck();
      
      try {
		System.out.println(mg1.alsTextScannen());
      }
      catch (ScanException e) {
		e.printStackTrace();
      }
      
      mg1.drucken("Test");
   }
}