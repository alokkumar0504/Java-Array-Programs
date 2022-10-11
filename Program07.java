/*
Write a method that takes one-dimensional array of integers and return an array with only max and min element in that array

Method Name :returnMaxAndMin() 
Argument	: int[]
Return type: int[]

For Example
Input:
{“1”,”5”,”3”,”4”,”2”}

Output:
{“5”,”1”}
*/
import java.util.*;
public class Program07{
		public static Integer[] returnMaxAndMin(Integer[] arr,int size){
			//int index=0;
			Integer arr2[]=new Integer[2];
			int max=arr[0];
			int min=arr[0];
			for(int i=0;i<arr.length;i++){
					if(arr[i]>max ){
						max=arr[i];
						
					}
					if(arr[i]<min){
						min=arr[i];
					}
			
			}
			arr2[0]=max;
			arr2[1]=min;			//index++;
			return arr2;
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
			Integer newArr[]=returnMaxAndMin(arr,size);
			for(int i=0;i<newArr.length;i++){
						System.out.print(newArr[i]+" ");
					}
		
		}
}