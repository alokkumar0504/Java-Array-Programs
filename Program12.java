/*Program-12	
Write a program that takes integer or string array with repeated 
elements and determine the elements that are repeated odd number of times in the array.
Example:
Input:
int[]  x = {2,2,3,2,3,4,1,5,5,7}
Output:
The elements that are repeated odd number of times
2 repeated 3 times
4 repeated 1 time
1 repeated 1 time
7 repeated 1 time
*/
import java.util.*;
public class Program12{
		public static void getResult(Integer[] arr){
			Integer count[]=new Integer[];
			int  n=arr.length;
			for(int i=0;i<n;i++){
				for( int j=0;j<n;j++){
					if(arr[i]+arr[j]==0){
						arr2[0]=arr[i];
						arr2[1]=arr[j];
						return arr2;
					}
				}		
			}
			arr3[0]=0;
			return arr3;
				
		}
		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Integer array size::");
			int size=sc.nextInt();
			Integer arr[]=new Integer[size];
			System.out.println("Enter the Integer array element");
			for(int i=0;i<arr.length;i++){
					arr[i]=sc.nextInt();
				}
			Integer  index[]=getZeroElement(arr);
			for(int i=0;i<index.length;i++){
					System.out.print(index[i]+" ");
			}
			
		
		}
}
