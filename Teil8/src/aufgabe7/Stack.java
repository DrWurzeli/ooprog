package aufgabe7;

public class Stack {
	
	private int[] arrayStack = null;
	
	public Stack(int size) {
		arrayStack = new int [size]; 
	}
	
	public void push(int u) {
		
	}
	
	public int pop() {
		return 0;
	}
	
	public boolean isEmpty() {
		if(arrayStack == null) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public void stackPrint() {
		for(int x : arrayStack) {
			System.out.println(x);
		}
	}
}
