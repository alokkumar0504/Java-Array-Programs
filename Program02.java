/*Program-2
Create a class 'RowSum' containing a method that calculating row-wise sum of array of size 3 X 3
Method Name :getRowSum() 
Argument	: int[][]
Return type: int[]
For Example
Input:
1 2 3
1 2 3
1 2 3 
Output:
6 6 6
*/
import java.util.*;
public class Program02{
		public static Integer[] getRowSum(Integer[][] arr,int size){
			//Integer  arr[][]=new Integer[size][size];
			Integer  resarr[]=new Integer[size];
			for(int i=0;i<size;i++){
				resarr[i]=0;
				for(int j=0;j<size;j++){
					resarr[i]+=arr[i][j];
				}
			}
			return resarr;
		}
		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the 2d array size::");
			int size=sc.nextInt();
			Integer arr[][]=new Integer[size][size];
			System.out.println("Enter the 2d array element");
			for(int i=0;i<size;i++){
				for(int j=0;j<size;j++){
					arr[i][j]=sc.nextInt();
				}
			}
			Integer resarr[]=getRowSum(arr,size);
			System.out.print("[");
			for(int i=0;i<resarr.length;i++){
					System.out.print(resarr[i]+" ");
					
				}
			System.out.print("]");
		
		}
}
