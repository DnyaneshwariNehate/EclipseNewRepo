package Day6;

import java.util.Scanner;

public class SearchingSortingTest {

	public static void main(String[] args) {
		int arr[]= {50,52,10,20,89,98};
		
		//Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println("array is: "+arr[i]);
		}	
		int data=MyIOService.getInteger("Enter data to search: ");
		boolean found=false;
		for(int i=0;i<arr.length;i++) {
			if(data==arr[i]) {
				found=true;
			break;
			}
		}
		if(found==true)
			System.out.println("Data found: "+data);
		
		else
			System.out.println("Data not found..."+data);
	}
}
class MyIOService{
	public static int getInteger(String msgToPrint) {
		System.out.println(msgToPrint);
		Scanner sc= new Scanner(System.in);
		int temp=sc.nextInt();
		return temp;
	}
}