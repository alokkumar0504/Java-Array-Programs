/*
Program-16
Write a program to rotate array by k elements clockwise. 
The method takes an integer array and k as input parameters and print the rotated array
Example:
int[] = {10,2,8,1,7,9,11,5,3}
k=2(rotate 2 elements clockwise)
Output:
{8, 1,7,9,11,5,3,10,2}
*/
import java.util.*;
public class Program16{
		public static void getRotateArray(Integer arr[],int k){
			int n=arr.length;
			int cnt=0;
			Integer arr2[]=new Integer[k];
			for(int i=0;i<k;i++){
				arr2[i]=arr[i];	
			}
			for(int i=k;i<n;i++){
					arr[i-k]=arr[i];
			}
			for(int i=n-k;i<n;i++){
				arr[i]=arr2[cnt];
				cnt++;
			}
			for(int i=0;i<n;i++){
				System.out.print(arr[i]+" ");
			}
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
			System.out.println("Enter the no of rotation you want::");
			int k=sc.nextInt();
			getRotateArray(arr,k);
		}
}