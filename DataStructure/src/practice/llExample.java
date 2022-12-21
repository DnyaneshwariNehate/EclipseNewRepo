package practice;

public class llExample {
	Node head;
	
	class Node{
	String data;
	Node next;	//type of next is node bcoz it will point to next node of LL.
		
		Node(String data){
			this.data=data;
			this.next=null;
		}
	}
	//add opeartion-at first,last
	 public void addFirst(String data) {
		Node newNode= new Node(data);
			if(head==null) {
				head=newNode;
				return ;
			}	
			}
	 public void printList() {
		 
	 }
				
	public static void main(String[] args) {
		llExample list= new llExample();
		list.addFirst("a");
		list.addFirst("list");
		
	}
}
