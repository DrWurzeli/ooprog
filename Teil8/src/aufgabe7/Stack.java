package aufgabe7;

public class Stack {
	
	private int[] arrayStack = null;
	private int topItemPosition = -1;
	
	public Stack(int size) {
		arrayStack = new int [size]; 
	}
	
	public void push(int newItem) {
		arrayStack[++topItemPosition] = newItem;
	}
	
	public int pop() {
		return arrayStack[topItemPosition--];
	}
	
	public boolean isEmpty() {
		return topItemPosition == -1;
	}
	
	public void stackPrint() {
		for(int element : arrayStack) {
			System.out.println(element);
		}
	}
}
