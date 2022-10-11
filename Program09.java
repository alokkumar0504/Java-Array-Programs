/*
Program-9

Write a method that takes one-dimensional array of integers and 
return the first repeating element  index position in an array of integers

Method Name :getFirstRepeatingElement() 
Argument	: int[]
Return type: int

For Example
Input:
{“1”,”2”,”3”,”4”,”2”}

Output:
1
*/
import java.util.*;
public class Program09{
		public static int getFirstRepeatingElement(Integer[] arr){
			int index=-1;
			for(int i=0;i<arr.length-1;i++){
				for(int j=i+1;j<arr.length;j++){
						if(arr[i]==arr[j]){
						index=i;
						break;	
					}
					
				}
				if(index!=-1)
						break;
					
			}
			return index;	
		}
		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the String array size::");
			int size=sc.nextInt();
			Integer arr[]=new Integer[size];
			System.out.println("Enter the String array element");
			for(int i=0;i<arr.length;i++){
					arr[i]=sc.nextInt();
				}
			int  index=getFirstRepeatingElement(arr);
			System.out.print(index);
		
		}
}
