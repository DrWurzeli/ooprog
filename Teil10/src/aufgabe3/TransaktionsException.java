package aufgabe3;

public class TransaktionsException extends Exception {

public TransaktionsException(){
      super ("Betrag liegt im Minus oder das Guthaben reicht nicht aus");
   }
   
}
