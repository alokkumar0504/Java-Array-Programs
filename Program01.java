/*
Program-1
Create a class 'IncreaseDecrease' containing  amethod method that creates and returns array of numbers for a given integer as parameter in a format like one is small next number is big....
Method Name :getIncreaseDecrease
Arguments : One Integer 
Return Type :int Array
For Example
Input : 5
Output: array with values: {1,5,2,4,3}
*/
import java.util.*;
public class Program01{
		public static Integer[] getIncreaseDecrease(int input){
			Integer  arr[]=new Integer[input];
			int count=1;
			for(int i=0;i<arr.length;i++){
				if(i%2==0){
					arr[i]=count;
					count++;
				}
				else{
					arr[i]=input;
					input--;	
				}
				
				
			
			}
			return arr;
		}
		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the array size::");
			int inputNum=sc.nextInt();
			Integer arr[]=getIncreaseDecrease(inputNum);
			System.out.print("{");
			for(int i=0;i<arr.length;i++){
				if(i==arr.length-1){
					System.out.print(arr[i]);
					
				}
				else{
					System.out.print(arr[i]+",");
				}
				
			}
			System.out.print("}");
		
		}

}