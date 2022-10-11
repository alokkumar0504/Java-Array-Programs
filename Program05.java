/* Write a method that takes an array of strings, from the array determine the equal strings,
 put in another String array, and return the result.
 If there are no equal strings found return empty array

Method Name :getEqualStrings() 
Argument	: String[]
Return type: String[]

For Example
Input:
{“hello”,”how”,”hello”,”test”,”how”}
Output:
{“hello”,”how”}
*/
import java.util.*;
public class Program05{
		public static String[] getEqualStrings(String[] str,int size){
			int index=0;
			String restr[]=new String[size];
			for(int i=0;i<str.length-1;i++){
				for(int j=i+1;j<str.length;j++){
					if(str[i].equals(str[j]) && (i!=j)){
						//cnt++;
						restr[index]=str[i];
						index++;
					}	
				}
			
			}
			return restr;
		}
		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the String array size::");
			int size=sc.nextInt();
			String str[]=new String[size];
			System.out.println("Enter the String array element");
			for(int i=0;i<str.length;i++){
					str[i]=sc.next();
				}
			String restr[]=getEqualStrings(str,size);
			for(int i=0;i<=restr.length;i++){
						System.out.println(restr[i]+" ");
					}
		
		}
}