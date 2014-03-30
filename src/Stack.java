import java.io.*;
/*
 * v1 Implementing Simple Stack 
 * this is just for revising my Java Concepts after I worked as UI Dev
 * 
 * */
public class Stack {
	
	//note topOfStack need not be a static as It can be used by any instance of class Stack
//	private static int topOfStack;
	private int topOfStack,length;
	private char[] stackArray;
	private static int countStackObject;
	
	public static void main(String[] args) {
	
		System.out.println("in Stack ");
		//Creating an Object of Stack class
		Stack stack1 = new Stack(4);
		stack1.push('a');
		stack1.push('b');
		stack1.pop();
		stack1.push('c');
		
		stack1.push('d');
		stack1.pop();
		stack1.push('e');
		stack1.push('e');
		
		//Creating another object for Stack class
		Stack stack2 = new Stack(5);
		
		for(int i = 0 ; i <= stack1.topOfStack; i++){
			System.out.println(stack1.stackArray[i]);
		}
		System.out.println("is Empty Checking"+ stack1.isEmpty());
		System.out.println("is Full Stack ?"+ stack1.isFull());
		System.out.println("top of stack is now "+ stack1.topElement());
		getInstanceCount();
	}
	
	Stack(int lengthOfStack){
		length = lengthOfStack;
		topOfStack = -1;
		countStackObject++;
		stackArray = new char[lengthOfStack];
	}
	public void push(char element){
		 stackArray[++topOfStack] = element;
		
	}
	public char pop(){
		return stackArray[topOfStack--];
	}
	public boolean isEmpty(){
		return topOfStack < 0;	
	}
	// Condition for full must use == not >= which does not make sense
	public boolean isFull(){
		return topOfStack == length-1;
	}
	public char topElement(){
		return stackArray[topOfStack--];
	}

	/*
	 * method which prints number of objects instantiated for the Stack class 
	 * 
	 */
	public static void getInstanceCount(){
		System.out.println("Total objects of Stack Class are: "+ countStackObject);
	}
}
