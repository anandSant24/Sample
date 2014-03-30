
public class ReverseStack extends PrintableCharStack{
// I am using only Stack class there is no need of using PrintableCharStack as I am printing in the same file and it is in reverse order
	//whereas PrintableCharStack will print only in sequential order
	
	public static void main(String[] args) {

		
		Stack stackSample = new Stack(5);
		ReverseStack rstack = new ReverseStack();

		for(int i = 0 ; i < stackSample.length-1;i++){
			//simply pushing the elements to the Stack
			stackSample.push('a');
			System.out.print(stackSample.stackArray[i]);
		}
		stackSample.push('b');
		System.out.println(stackSample.topElement());
		System.out.println(stackSample.length);
//		PrintableCharStack printStack = new PrintableCharStack();
		//I am creating an object of parent class and midparent class and child class
		rstack.printReverse(stackSample);
		
		//stackSample.printStack(stackArray);

	}
	public void printReverse(Stack stackSamp){
		System.out.println("inside reverse");
		
		for(int i = 0 ;i<stackSamp.length;i++){
			
			System.out.print(""+stackSamp.pop());
			
		}
			
	}
	
}
