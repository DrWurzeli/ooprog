package aufgabe2;

public class TestDrucker
{
   public static void main (String[] args)
   {
      Drucker[] druckerArr = new Drucker[3];
      
      druckerArr[0] = new TintenstrahlDrucker();
      druckerArr[1] = new LaserDrucker();
      druckerArr[2] = new TintenstrahlDrucker();
      
      for(Drucker x : druckerArr) {
    	  x.drucken("Another one.");
    	  x.testAusdruck();
      }
   }
}
