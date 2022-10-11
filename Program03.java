/*Program-3
Create a class that contains a method which takes two-dimensional array of integers(array has equal number of rows and columns) and calculate the sum of diagonal element starting from 1st column

Method Name :getDiagonalDataSum() 
Argument	: int[][]
Return type: int
For Example
Input:
1 2 
3 4
Output:
5
*/
import java.util.*;
public class Program03{
		public static int getDiagonalDataSum(Integer[][] arr,int size){
			int sum=0;
			for(int i=0;i<size;i++){
				for(int j=0;j<size;j++){
					if(i==j){
						sum+=arr[i][j];
					}
				}
			}
			return sum;
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
			int result=getDiagonalDataSum(arr,size);
			System.out.print("Result="+result);
		}
}