/*
Program-4

Create a class that contains a method which takes 2-dimensional array of integers and get the transpose(rows becomes columns becomes rows)

Method Name :getTranspose() 
Argument	: int[][]
Return type: int[][]

For Example
Input:
1 2 
3 4
Output:
1 3
4 2

*/
import java.util.*;
public class Program04{
		public static Integer[][] getTranspose(Integer[][] arr,int size){
			Integer  resarr[][]=new Integer[size][size];
			for(int i=0;i<size;i++){
				for(int j=0;j<size;j++){
					resarr[i][j]=arr[j][i];
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
			Integer resarr[][]=getTranspose(arr,size);
			for(int i=0;i<resarr.length;i++){
					for(int j=0;j<size;j++){
						System.out.print(resarr[i][j]+" ");
					}
					System.out.println();
				}
		
		}
}