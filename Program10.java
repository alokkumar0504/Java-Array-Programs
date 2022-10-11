/*Program-10	

Write a method that takes one-dimensional array of integers and return the first no-repeating element index position in an array of integers

Method Name :getFirstNonRepeatingElement() 
Argument	: int[]
Return type: int

For Example
Input:
{“1”,”2”,”3”,”4”,”2”}

Output:
0
*/
import java.util.*;
public class Program10{
		public static int getFirstNonRepeatingElement(Integer[] arr){
			int index=-1;
			int  n=arr.length;
			for(int i=0;i<arr.length;i++){
				int j;
				for(j=0;j<arr.length;j++){
					if( i!=j && arr[i]==arr[j]){
						index=-1;
						break;	
					}
					/*else if(arr[i]!=arr[j] && arr[i]==arr[i-1]){
						index=-1;
						break;	
					}
					else if(arr[i]!=arr[j]){
						index=i;
						break;	
					}*/
				}
				if(j==n){
						index=i;
						break;
					}
					
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
			int  index=getFirstNonRepeatingElement(arr);
			System.out.print(index);
		
		}
}
