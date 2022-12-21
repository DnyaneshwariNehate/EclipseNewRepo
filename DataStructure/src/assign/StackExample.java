package assign;

public class StackExample {
	public static void main(String[] args) 
	{
		MyStack theStack = new MyStack(5);
		theStack.push(10);
		theStack.push(20);
		theStack.push(30);
		theStack.push(40);
		theStack.push(50);
//		theStack.push(60);
		
		System.out.println("\nCurrent Element at the top is : " +theStack.peek());
		
		System.out.println(theStack.pop());
		System.out.println("\nCurrent Element at the top is : " +theStack.peek());
		
		System.out.println(theStack.pop());
		System.out.println(theStack.pop());
		System.out.println(theStack.pop());
		System.out.println(theStack.pop());
		System.out.println(theStack.pop());
//		System.out.println(theStack.pop());
	}
}

class MyStack
{
	int index = -1;
	int size;
	int array[];	//just a reference to int array
	
	MyStack(int size) 
	{
		System.out.println("MyStack created with size : "+size);
		this.size=size;
		array = new int[size];	//allocation of the ints
	}
	
	void push(int item)
	{
		System.out.println("Pushing "+item +" to the stack..");
		if(index > size-2)
		{
			throw new MyStackOverflowException("Stack size is overflown...");
		}
		array[++index] = item;
	}
	
	int pop()
	{
		if(index < 0)
		{
			throw new MyStackEmptyException("Stack is empty...");
		}
		System.out.print("Popping item from the stack..");
		return array[index --];
	}
	
	int peek()
	{
		return array[index];
	}
}


class MyStackOverflowException extends RuntimeException
{
	public MyStackOverflowException(String str) {
		super(str);
	}
}

class MyStackEmptyException extends RuntimeException
{
	public MyStackEmptyException(String str) {
		super(str);
	}

}
