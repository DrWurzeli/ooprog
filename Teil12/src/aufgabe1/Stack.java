package aufgabe1;

public class Stack<T> {
	private int position;
	private Object[] stack;
	
	public Stack (int groesse) {
		stack = new Object[groesse];
		position = 0;
	}
	
	public boolean isEmpty() {
		if (position == 0) {
			return true;
		}
		return false;
	}
	
	//specification what can be pushed onto stack
	public void push (T wert){
	   stack [position] = wert;
	   
	   position++;
	}
	
	//specific return of T type
	public T pop(){
	   position--;
	   return (T)stack[position];
	}

	public void stackPrint(){
	   for (int i = 0; i < position; i++)
	   {
	      System.out.println (stack [i]);
	   }
	}
}
