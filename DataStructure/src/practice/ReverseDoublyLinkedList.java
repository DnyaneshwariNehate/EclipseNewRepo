package practice;

public class ReverseDoublyLinkedList {

	class node {
		int data;
		node next;
		node prev;
		public node(int data) {
			this.data=data;
		}
	}
	node head,tail=null;		//DLL head tail
	
	public void addNode(int data) {		//new node creation of DLL
		node NewNode= new node(data);
		
		if(head==null) {			//if the list is empty
			head=tail=NewNode;		//head and tail will point to NewNode
			
			head.prev=null;			//head previous and tail's next will 
			tail.next=null;			//point to null 
		}
		else {
			tail.next=NewNode;		//previous node's tail next will now point to newnode
			NewNode.prev=tail;		//newnode's previous will point to tail
			tail=NewNode;			//now new node will become tail and it will
			tail.next=null;			//point to null.
		}
	}
	public void ReverseList() {
		node current= head;
		node temp=null;
		while(current!=null) {
			temp = current.next;  
            current.next = current.prev;  
            current.prev = temp;  
            current = current.prev; 
		}
		temp = head;  
        head = tail;  
        tail = temp;  
	}
	public void originalList() {
		node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }
        while(current!= null) {
        	 System.out.print(current.data + " ");  
             current = current.next;  
        }
	}
	
	public static void main(String[] args) {
		ReverseDoublyLinkedList dll= new ReverseDoublyLinkedList();
		dll.addNode(5);
		dll.addNode(4);
		dll.addNode(3);
		dll.addNode(2);
		dll.addNode(1);
		System.out.print("Original list is:");
		dll.originalList();
		
		dll.ReverseList();
		
		System.out.print("\nReversed list is:");
		dll.originalList();
	}
}
