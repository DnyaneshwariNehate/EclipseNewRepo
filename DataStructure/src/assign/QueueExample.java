package assign;

public class QueueExample {
	public static void main(String[] args) 
	{
		MyQueue que = new MyQueue(5);
		System.out.println("Adding first passenger...");
		que.add(10);
		que.add(20);
		que.add(30);
		que.add(40);
		que.add(50);
		
		System.out.println("First removed element is: "+que.remove());
//		System.out.println(que.remove());
//		System.out.println(que.remove());
//		System.out.println(que.remove());
//		System.out.println(que.remove());
	}
}

class MyQueue
{
	int front=0;
	int index=0;	
	int length;
	int[] array;
	
		MyQueue(int length) {
	 	this.length=length;
		array = new int[length];
	}

	void add(int item)
	{
		System.out.println("Adding "+item +" at "+" index : "+index);
		if(index>length-1)
			throw new MyQueueOverflowException("Queue size is full...");
		array[index++] = item;
	}
	
	int remove()
	{
		if(front > index )
			throw new MyQueueEmptyException("Queue is empty...");
		return array[front++];
	}
	
}
class MyQueueOverflowException extends RuntimeException
{
	public MyQueueOverflowException(String str) {
		super(str);
	}
}

class MyQueueEmptyException extends RuntimeException
{
	public MyQueueEmptyException(String str) {
		super(str);
	}

}
