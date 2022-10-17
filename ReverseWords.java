/*
WAP to reverse a sentence while preserving the position.
Input : “Think Twice”
Output : “kniht eciwt”
*/

package pr;
import java.util.*;

public class ReverseWords {
	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	String s = sc.nextLine();
	        System.out.println(reverseWords(s));
	    }

	        public static String reverseWords(String s) {
	            String[] words = s.split(" ");
	            String ss = "";
	            for(String word : words){
	                ss += reverseWord(word);
	                ss += " ";
	            }

	            return String.join(" ", ss);
	        }



	        public static String reverseWord(String s){
	            char[] letters = s.toCharArray();
	            s="";
	            for(int i=letters.length-1;i>=0;i--){
	                s=s + letters[i];
	            }
	            return s;
	        }
	        
}
