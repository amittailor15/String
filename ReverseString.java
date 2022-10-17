package pr;
import java.util.*;

public class ReverseString

{

   public static void main(String[] args) {

	   Scanner sc=new Scanner(System.in);
       String string  = sc.next() ;

       System.out.println("Original string: "+string);

       char str[] = string.toCharArray();

       int n = str.length;

       int start=0,end = n-1;

       while(start<=end){

           char temp = str[start];

           str[start] = str[end];

           str[end] = temp;

           start++;

           end--;

       }

       String reversedString = String.valueOf(str);


       System.out.println("Reversed string: "+reversedString);

   }

}