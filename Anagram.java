package pr;

import java.util.Scanner;

public class Anagram

{
    public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First String : ");
		String s1 = sc.nextLine();

		System.out.print("Enter the second String : ");
		String s2 = sc.nextLine();

        s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
 
        if (s1.length() != s2.length())
            System.out.println("Not Anagram");
		else
		{
			for (int i = 0; i < s1.length(); i++)
			{
				for (int j = 0; j < s2.length(); j++)
				{
					if (s1.charAt(i) == s2.charAt(j))
					{
						s2 = s2.substring(0, j) + s2.substring(j + 1);
						break;
					}
				}
			}

			if (s2.length() == 0)
			{
				System.out.println("Anagram");
			} 
			else
			{
				System.out.println("Not Anagram");
			}
		}
	}
}