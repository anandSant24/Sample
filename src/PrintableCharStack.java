

public class PrintableCharStack extends Stack{

	public static void main(String[] args) {
	
		System.out.println("From Parent class Stack count object"+ countStackObject);
		System.out.println("will parent class creats or runs as usual when I simple extend the class I guess NOT since it calls only default constructor which does nothing");
		getInstanceCount();
		//enough experiments lets start the real work of instantiation of new class
		
		
		Stack stackSample = new Stack(5);
		for(int i = 0 ; i < stackSample.length;i++){
			//simply pushing the elements to the Stack
			stackSample.push('a');
		}
		
		PrintableCharStack print = new PrintableCharStack();
		
		//instead of creating object of child class(i.e PrintableCharStack and then creating object of its Parent Stack class
		//does not make sense
		//lets just create a PrintableCharStack object which will call the super class
		new PrintableCharStack(4);
		
		print.printStack(stackSample.stackArray);
		
		
	}
	PrintableCharStack(int capacity){
		
		super(capacity);//simple to make sure or assign the property correctly
		System.out.println("inside PrintableCharStack constructor");
	}
	PrintableCharStack(){
		
	}
	
	protected void printStack(char stackArray[]){
		for(int i = 0 ;i <stackArray.length;i++ ){
			System.out.println(stackArray[i]);
		}
	}
}
