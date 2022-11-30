/*
WAP to print repeatedly occurring characters in the given String.
*/

package pr;
import java.util.*;

public class RepeatedCharacter
{
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 String str1=sc.nextLine();
		 int count;
	  System.out.println("The given string is: " + str1);
	  char[] string = str1.toCharArray();
      System.out.print("Repeated Characters in string are: ");
      for (int i = 0; i < str1.length(); i++) {
    	 count = 0;
         for (int j = i + 1; j < str1.length(); j++) {
        	 if(string[i] == string[j] && string[i] != ' ') {  
                 count++;
                 string[j] = '0';
             }  
         }    
         if(count > 0 && string[i] != '0')  
             System.out.println(string[i]); 
      }
	 }
}
