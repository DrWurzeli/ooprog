package aufgabe7;

/**
 * <h1>Stack Implementation</h1>
 * Part 8: Classes and objects
 * Task 7 - FOM OOP class.
 * <p>
 * This class represents a stack using an array of integers.
 * Stack concept: last-in first-out.
 * When an instance of this stack is created,
 * you are able to push items to the stack and pop them off the stack.
 * To avoid exceptions you are also able to check, whether the stack is empty or not.
 * The stackPrint method is also available to print out all elements in the stack.
 * <p>
 * @author msander
 * @version 1.3
 * @since 11th April 2023
 * <p>
 */
public class Stack {
	
	private int[] arrayStack;
	private int topItemPosition = -1;
	
	/**
	 * This is the constructor used when creating new Stack objects/instances.
	 * @param size This is the first and only parameter. It defines the max amounts of elements on/in your stack.
	 */
	public Stack(int size) {
		arrayStack = new int[size]; 
	}
	
	/**
	 * This method is used to push new items to the Stack.
	 * Following the last-in, first-out concept, they get placed on top of the Stack.
	 * @param newItem This is the first and only parameter for this method and represents the number you want to push onto the Stack.
	 * @return nothing
	 */
	public void push(int newItem) {
		arrayStack[++topItemPosition] = newItem;
	}
	
	/**
	 * This method is used to push multiple elements to the Stack @see public void push.
	 * Note: It was added for fun and is not part of the lecture.
	 * @param inputIntegers Those are the elements pushed onto the Stack.
	 * @return nothing
	 */
	public void pushToStack(int... inputIntegers) {
		   for(int x : inputIntegers) {
			   push(x);
		   }
	}
	
	/**
	 * This method is used to take off the top element of the Stack.
	 * @return arrayStack This returns the Stack with its index/topItemPosition lowered by one.
	 * Note: You can catch the popped element using: someInteger = yourStack.pop();
	 */
	public int pop() {
		return arrayStack[topItemPosition--];
	}
	
	/**
	 * This method can be used to check whether your Stack is empty or not.
	 * @return boolean true/false
	 */
	public boolean isEmpty() {
		return topItemPosition == -1;
	}
	
	/**
	 * This method prints out all elements of a Stack to console.
	 */
	public void stackPrint() {
		for(int element : arrayStack) {
			System.out.println(element);
		}
	}
}
