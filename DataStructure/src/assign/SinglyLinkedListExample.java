package assign;

public class SinglyLinkedListExample {
	public static void main(String[] args) {
		Kite k1 = new Kite("Red","Jack",50,true);
		Kite k2 = new Kite("Green","Jane",60,true);
		Kite k3 = new Kite("Blue","John",80,true);
		Kite k4 = new Kite("Yellow","Julie",90,true);
		Kite k5 = new Kite("Black","Jim",75,true);
		Kite k6 = new Kite("White","Jackie",175,true);	
		
		MyLinkedList myList = new MyLinkedList();
	
		myList.add(k1);
		myList.add(k2);
		myList.add(k3);
		myList.add(k4);
		myList.add(k5);
		myList.addAtBegining(k6);
					
		System.out.println("===========================================================================================");
		System.out.println("New List is : ");
		myList.showList();
		
		myList.countItems();
	
		System.out.println("===========================================================================================");		
		System.out.println("Searching Kite by length");
		myList.searchKiteByLength(80);
		
		System.out.println("===========================================================================================");		
		System.out.println("Searching Kite by owner");
		myList.searchKiteByOwner("Jim");
	
		System.out.println("===========================================================================================");		
		System.out.println("Changing Kite Owner");
	    myList.changeOwner("Julie", "Dnyaneshwari");
		
		System.out.println("===========================================================================================");		
		System.out.println("Deleting Kite by owner's name");
		myList.deleteKite("Dnyaneshwari");
		System.out.println("\nUpdated List is : ");
		myList.showList();
		
		myList.showList();
		System.out.println("===========================================================================================");		
		System.out.println("Adding a Kite before Julie");
		myList.insertKite("John", k6);
		System.out.println("\nUpdated List is : ");
		myList.showList();
		
		System.out.println("Searching kite by colour");
		myList.searchKitebyColour("Black");
		
	}
}


class MyLinkedList
{
	Kite start,ptr,prev;
	
	void insertKite(String ownerToFind, Kite newKite)	//julie, k6. add k6 before julie
	{
boolean found=false;
		
		if(start==null) 
			System.out.println("List is empty..nothing to search");
		
		else if(start.owner.equals(ownerToFind)) 
		{
			addAtBegining(newKite);
		}
		else 
		{
			System.out.println("Searching...");
			ptr = start;
			while(ptr!=null) 
			{
				
				if(ptr.owner.equals(ownerToFind)) 
				{
					found=true;
					break;	
				}	
				prev = ptr;
				ptr=ptr.next;
			}
			
			if(found == true)
			{
				System.out.println("Kite found : "+ptr);
				prev.next = newKite;
				newKite.next=ptr;
			}			
			if(found!=true) 
			{
				System.out.println("Kite not found....");
			}
		}
	}
	void deleteKite(String ownerName)
	{
		boolean found=false;
		
		if(start==null) 
			System.out.println("List is empty..nothing to search");
		else 
		{
			System.out.println("Searching...");
			ptr = start;
			while(ptr!=null) 
			{
				if(ptr.owner.equals(ownerName)) 
				{
					System.out.println("Kite found : "+ptr);
					prev.next = ptr.next;
					found=true;
					System.out.println("Kite of owner : " +ownerName +" is deleted successfully");
					break;
				}
				prev = ptr;
				ptr=ptr.next;
			}		
			if(found!=true) 
			{
				System.out.println("Kite not found....");
			}
		}
	}
	void searchKiteByLength(int lengthToSearch) {
		
		boolean found=false;
		
		if(start==null) {
			System.out.println("List is empty..nothing to search");
		}
		else {
			System.out.println("Searching...");
			ptr = start;
			while(ptr!=null) {
				if(ptr.length == lengthToSearch) {
					System.out.println("Kite Found :"+ptr);
					found=true;
					break;
				}
				ptr=ptr.next;
			}
			if(found!=true) {
				System.out.println("Kite not found... of this length : "+lengthToSearch);
			}
		}
	}
	void searchKiteByOwner(String ownerToSearch) {
		
		boolean found=false;
		
		if(start==null) {
			System.out.println("List is empty..nothing to search");
		}
		else {
			System.out.println("Searching...");
			ptr = start;
			while(ptr!=null) {
				if(ptr.owner.equals(ownerToSearch)) {
					System.out.println("Kite Owner Found :"+ptr);
					found=true;
					break;
				}
				ptr=ptr.next;
			}
			if(found!=true) {
				System.out.println("Kite Owner "+ownerToSearch +" was not found..");
			}
		}
	}
	void changeOwner(String currentOwner, String newOwner) {
	
	boolean found=false;
	
	if(start==null) {
		System.out.println("List is empty..nothing to search");
	}
	else {
		System.out.println("Searching...");
		ptr = start;
		while(ptr!=null) {
			if(ptr.owner.equals(currentOwner)) {
				System.out.println("Kite Owner Found :"+ptr);
				found=true;
				ptr.owner = newOwner;
				System.out.println("Updated Kite details : "+ptr);
				break;
			}
			ptr=ptr.next;
		}
		if(found!=true) {
			System.out.println("Kite Owner "+currentOwner +" was not found..");
		}
	}
}
	void addAtBegining(Kite newKite) {
		if(start!=null) {
			System.out.println("The kite of owner " +newKite.owner +" is added at the beginning of the existing list of kites...");
			newKite.next = start;
			start = newKite;
		}
		else {
			System.out.println("You are the first kite..");
			start = newKite;
		}
	}
	
	void showList() {
		if(start==null) {
			System.out.println("List is empty");
		}
		else {
			System.out.println("Printing List........");
			ptr = start;
			while(ptr!=null) {
				System.out.println(ptr);
				ptr=ptr.next;
			}
		}
	}
	void add(Kite newKite) { 
		if(start==null) {
			System.out.println("Adding first node...");
			start = newKite;
		}
		else {		
			System.out.println("Adding internal node...");
			ptr=start;
			while(ptr!=null) {
				System.out.println("Searching....");
				prev = ptr;
				ptr=ptr.next;
			}
			prev.next = newKite;
			newKite.next = null;
		}
	}
	void countItems()
	{
		int itemCount=0;
		if(start==null) 
		{
			System.out.println("No items in the List");
		}
		else 
		{		
			System.out.println("Counting Items in List..");
			ptr=start;
			while(ptr!=null) {
				System.out.println("Searching....");
				ptr=ptr.next;
				itemCount++;
			}
			System.out.println("Number of Items in List are : "+itemCount);
		}
	}
	void searchKitebyColour(String colour) {
		boolean found=false;
		if(start==null) {
			System.out.println("List is empty..nothing to search");
		}
		else {
			System.out.println("Searching...");
			ptr = start;
			while(ptr!=null) {
				if(ptr.color.equals(colour)) {
					System.out.println("Kite found..."+ptr);
					found=true;
					break;
					}
					ptr=ptr.next;
				}
				if(found!=true) {
					System.out.println("Kite of the Colour "+colour +" was not found..");
					}
				}
			}		
	}

