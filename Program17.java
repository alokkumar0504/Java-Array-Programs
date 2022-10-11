/*Program-17
There is an array of integers, write a method that takes this array as input, 
rearrange the array such that elements at even index (even starts from 0) are greater than 
elements at odd index
Example:
int[] = {10,2,8,1,7,9,11,5,3}
Output:
{11, 1,10,2,9,3,8,5,7}

*/
import java.util.*;
public class Program17{
		public static Integer[] getRotateArray(Integer arr[]){
			int n=arr.length;
			int cnt=1;
			Integer arr2[]=new Integer[n];
			Arrays.sort(arr);
			for(int i=0;i<arr2.length;i++){
				if(i%2==0){
					arr2[i]=arr[n-1];
					n--;
					
				}
				else{
					arr2[i]=arr[i-cnt];
					cnt++;
				}	
			}
			return arr2;
		}
		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Integer array size::");
			int size=sc.nextInt();
			Integer arr[]=new Integer[size];
			System.out.println("Enter the Integer array element::");
			for(int i=0;i<arr.length;i++){
					arr[i]=sc.nextInt();
				}
			getRotateArray(arr);
			Integer k[]=getRotateArray(arr);
			for(int i=0;i<k.length;i++){
				System.out.print(k[i]+" ");
			}
		}
}