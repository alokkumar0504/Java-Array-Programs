/*Program-8

Write a method that takes one-dimensional array of integers and
 pass another integer to the method and
 check if this integer is present in the array and if present 
 return how many times it is present else return 0

Method Name :checkForGivenNumber() 
Argument	: int[], int
Return type: int[]

For Example
Input:
{“1”,”2”,”3”,”4”,”2”}, 2

Output:
2

Input:
{“1”,”2”,”3”,”4”,”2”}, 6

Output:
0
*/
import java.util.*;
public class Program08{
		public static int checkForGivenNumber(Integer[] arr,int key){
			int cnt=0;
			for(int i=0;i<arr.length;i++){
					if(arr[i]==key ){
						cnt++;
						
					}
			}		
			return cnt;
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
			System.out.println("Enter the key element you want to count::");
			int key=sc.nextInt();	
			int  count=checkForGivenNumber(arr,key);
			System.out.print(count);
		
		}
}
