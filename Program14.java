/*Program-14
Write a program that finds the kth smallest element in an integer array, which is unsorted
Example:
int[] = {10,2,8,1,7,9,11,5,3}
k=2
Output:
The 2nd smallest element is 2
*/
import java.util.*;
public class Program14{
		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Integer array size::");
			int size=sc.nextInt();
			Integer arr[]=new Integer[size];
			System.out.println("Enter the Integer array element");
			for(int i=0;i<arr.length;i++){
					arr[i]=sc.nextInt();
				}
			Arrays.sort(arr);
			System.out.println("Enter the no of smallest you want::");
			int k=sc.nextInt();
			if(k>size){
				System.out.println("Invalid input");
			}
			else{
				System.out.println(arr[k-1]+" ");
			}
		}
}
