package assign;

import java.util.Arrays;
import java.util.Scanner;

public class BSTExample {
	public static void main(String[] args) {
		
        int array[]= {10,90,80,45,75,43,65};

            for(int i=0;i<array.length;i++) {
            System.out.println("array :"+array[i]);
            }
            System.out.println("Sorting......");

            Arrays.sort(array);

            System.out.println("Sorted......");

            for(int i=0;i<array.length;i++) {
            System.out.println("array :"+array[i]);
        }
         int data=MyIooService.getInteger("Enter the data : ");

       // boolean found=false;
       // for(int i=0;i<array.length;i++)
          int first=0;
          int last=array.length-1;
          int middle=(first+last)/2;

          int count=0;
          while(first<=last) {
          count++;
          System.out.println("Executed :"+count);
          if(array[middle]<data) {

          first=middle+1;
          }
          else if(array[middle]==data) {

          System.out.println("found the data :"+data+" at location"+(middle+1));
          break;
          }
          else {
                last=middle-1;
               }
               
          middle=(first+last)/2;

               if(first>last) {
           System.out.println("data not found");
            }
        }
      }
	}
class MyIooService{

public static int getInteger(String msgToPoint) {

System.out.println(msgToPoint);

Scanner sc=new Scanner(System.in);
int temp=sc.nextInt();
return temp;
}
}

