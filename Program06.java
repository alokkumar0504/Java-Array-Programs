/*Write a method that takes two one-dimensional arrays integers, and determine if one array is subset of other

Method Name :returnSubSet() 
Argument	: int[], int[]
Return type: true

For Example
Input:
{“1”,”2”,”3”,”4”,”5”}
{“1,”4”,”5”}

Output:
true
*/
import java.util.*;
public class Program06{
		public static boolean returnSubSet(Integer[] arr1,Integer[] arr2){
			boolean result=false;
			int cnt=0;
			for(int i=0;i<arr2.length;i++){
				for(int j=0;j<arr1.length;j++){
					if(arr2[i]==arr1[j]){
						cnt++;
						break;
					}	
				}
			}
			if(cnt==arr2.length){
				 result=true;
			}
			else{
				result=false;
			}
			return result;
			
		}
		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the array1 size::");
			int size1=sc.nextInt();
			System.out.println("Enter the array2 size::");
			int size2=sc.nextInt();
			Integer arr1[]=new Integer[size1];
			Integer arr2[]=new Integer[size2];
			System.out.println("Enter the first array element::");
			for(int i=0;i<size1;i++){
				arr1[i]=sc.nextInt();
			}
			System.out.println("Enter the second array element::");
			for(int i=0;i<size2;i++){
				arr2[i]=sc.nextInt();
			}
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			boolean result=returnSubSet(arr1,arr2);
			//returnSubSet(arr1,arr2);
			System.out.println(result);
			
		}

}