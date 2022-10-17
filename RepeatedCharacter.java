package pr;
import java.util.*;

public class RepeatedCharacter
{
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 String str1=sc.nextLine();
	  System.out.println("The given string is: " + str1);
	  char[] carray = str1.toCharArray();
      System.out.print("Repeated Characters in string are: ");
      for (int i = 0; i < str1.length(); i++) {
         for (int j = i + 1; j < str1.length(); j++) {
            if (carray[i] == carray[j]) {
               System.out.print(carray[j] + " ");
               break;
            }
         }
      }
	 }
}