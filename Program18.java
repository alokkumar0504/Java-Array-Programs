/*Program-18
There are 2 string arrays, write a method to merge 2 arrays and 
sort the array in ascending order as per lexicographical order
Example:
String[] str1 = {“abc”,”xyz”}
String[] str2 = {“def”,”lkm”}

Output:
{“abc”,”def”,”lkm”,”xyz”}
*/
import java.util.*;
public class Program18{
		public static void getResult(String[] arr1,String arr2[]){
			int  n1=arr1.length;
			int  n2=arr2.length;
			int newlength=n1+n2;
			//arr1+=arr2;
			String str[]=new String[newlength];
			int pos=0;
			for (String element : arr1) {
            str[pos] = element;
            pos++;
			}
			for (String element : arr2) {
            str[pos] = element;
            pos++;
			}
			for(int i=0;i<newlength-1;i++){
				for( int j=i+1;j<newlength;j++){
					if( str[i].compareTo(str[j]) > 0){ 
							String temp = str[i];
							str[i] = str[j];
							str[j] = temp;
						}
				}		
			}
			System.out.println("String array in lexicographical order::");
			for(int i=0;i<str.length;i++){
				System.out.print(str[i]+" ");
			}
		}
		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the 1st String array size::");
			int size1=sc.nextInt();
			System.out.println("Enter the 2nd String array size::");
			int size2=sc.nextInt();
			String arr1[]=new String[size1];
			System.out.println("Enter the  1st String array element");
			for(int i=0;i<arr1.length;i++){
					arr1[i]=sc.next();
				}
			String arr2[]=new String[size2];
			System.out.println("Enter the 2nd String array element");
			for(int i=0;i<arr2.length;i++){
					arr2[i]=sc.next();
				}	
			getResult(arr1,arr2);
		}
}
