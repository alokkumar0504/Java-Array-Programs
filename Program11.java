/*Program-11	

Write a method that takes integer array as input and 
find two elements in the array whose sum is equal to Zero, 
if there are no elements then return 0
*/
import java.util.*;
public class Program11{
		public static Integer[] getZeroElement(Integer[] arr){
			Integer arr2[]=new Integer[2];
			Integer arr3[]=new Integer[1];
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

