package aufgabe7;

public class Stack {
	
	private int[] arrayStack = null;
	private int current = -1;
	
	public Stack(int size) {
		arrayStack = new int [size]; 
	}
	
	public void push(int u) {
		arrayStack[++current] = u;
	}
	
	public int pop() {
		return arrayStack[current--];
	}
	
	public boolean isEmpty() {
		return current == -1;
	}
	
	public void stackPrint() {
		for(int x : arrayStack) {
			System.out.println(x);
		}
	}
}
