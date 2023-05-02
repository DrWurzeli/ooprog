package aufgabe3;

@SuppressWarnings("serial")
public class TransaktionsException extends Exception {

public TransaktionsException(){
      super ("Betrag liegt im Minus oder das Guthaben reicht nicht aus");
   }
   
}
