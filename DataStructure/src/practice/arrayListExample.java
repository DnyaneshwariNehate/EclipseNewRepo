package practice;

import java.util.ArrayList;
import java.util.Collections;

public class arrayListExample {

	public static void main(String[] args) {
		ArrayList<Integer> ar= new ArrayList<Integer>();
		//Adding and printing arraylist elements
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		ar.add(5);
	System.out.println("Elements in an arraylist are: "+ar);
		
	//getting an element
	try {
		System.out.println("Required element is: "+ar.get(5));	
	}
	catch(IndexOutOfBoundsException e) {
		System.out.println("Element not found...please enter valid number between 0 to 4");
	}
	
	//Adding element in between arraylist
		ar.add(0, 5);
		System.out.println("added element is: "+ar);
		
	//setting an element at existing element's place
		ar.set(0, 0);
		System.out.println("set element at number 0: "+ar);
		
	//removing an element
		ar.remove(5);
		System.out.println("Arraylist after removing an element: "+ar);
	
	//checking size of an arraylist
		System.out.println("Size of an arraylist is: "+ar.size());
		
	//loops in arraylist
		for(Integer arl : ar) {
			System.out.println(arl);
		}
		
	//sorting
		ar.add(3, 6);
		//System.out.println(ar);
		Collections.sort(ar);
		System.out.println(ar);		
	}
}
