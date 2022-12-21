package practice;

import java.util.ArrayList;
import java.util.Stack;

public class stackExample {
	//STACK using LinkedList
//	static class node{
//		int data;
//		node next;
//		public node(int data) {
//			this.data = data;
//			next=null;
//		}
//	}
//	
//	static class stack{
//		public static node head;
//		
//		//for checking if linked list is empty or not; it will return true or false
//		public static boolean isEmpty() {		
//			return head==null;
//		}
//		
//		public static void push(int data) {
//			//creating new node in which data to be added
//			node newNode= new node(data);
//			
//			//if list is empty then make newNode as head element
//			if (isEmpty()) {
//				head=newNode ;
//				return;
//			}
//			else {
//				//In this next of newNode will point to the head of existing element in list. 
//				newNode.next=head;
//				//and now our newNode will become new head of the list.
//				head=newNode;
//			}
//		}
//		public static int pop() {
//			if(isEmpty()) {
//				return -1; //this will tell us if stack is empty or not
//			}
//			//this will give us top most element of stack
//			int top= head.data;
//			//deleting top element of stack
//			head= head.next;
//			return top;
//		}
//		public static int peek() {
//			if (isEmpty()) {
//				return -1;
//			}
//			return head.data;	
//		}
//	}
	
	//STACK using ArrayList
	static class Stack{
		static ArrayList<Integer> list= new ArrayList<Integer>();
		//empty arraylist condition 
		public static boolean isEmpty() {
			return list.size()==0; 
		}
		
		//push function
		public static void push(int data) {
			list.add(data);
	}
		public static int pop() {
			//checking if arraylist is empty or not 
			if(isEmpty()) {
				return -1;
			}
	//we have to get data of last index of array list, so we will get last index by size-1(list size).
			int top=list.get(list.size()-1);
			list.remove(list.size()-1);
			return top;
		}
		public static int peek() {
			if(isEmpty()) {
				return -1;
			}
			return list.remove(list.size()-1);
		}
	}
	
public static void main(String[] args) {
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
		}
}
