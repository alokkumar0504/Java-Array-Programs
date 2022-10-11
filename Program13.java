/*
There are 2 arrays with integers, write a method that takes input as
 these 2 arrays and find the common elements or intersection between these 2 arrays
Example:
int[] x1 = {2,4,5,7,8}
int[] x2 = {1,2,8}
Output:
Common elements: {2,8}
*/
import java.util.*;
public class Program13{
		public static void getResult(Integer[] arr1,Integer arr2[]){
			int  n1=arr1.length;
			int  n2=arr2.length;
			System.out.println("Common elements:");
			for(int i=0;i<n1;i++){
				for( int j=0;j<n2;j++){
					if(arr1[i]==arr2[j]){
						System.out.print(arr1[i]+" ");
					}
				}		
			}		
		}
		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the 1st Integer array size::");
			int size1=sc.nextInt();
			System.out.println("Enter the 2nd Integer array size::");
			int size2=sc.nextInt();
			Integer arr1[]=new Integer[size1];
			System.out.println("Enter the  1st Integer array element");
			for(int i=0;i<arr1.length;i++){
					arr1[i]=sc.nextInt();
				}
			Integer arr2[]=new Integer[size2];
			System.out.println("Enter the 2nd Integer array element");
			for(int i=0;i<arr2.length;i++){
					arr2[i]=sc.nextInt();
				}	
			getResult(arr1,arr2);
		
		}
}
