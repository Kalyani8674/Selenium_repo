package programming;

import java.util.Arrays;
import java.util.Scanner;

public class AAaa {

	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("enter the 2 String value");
		
		String s1 = sc1.nextLine();
		String s2 = sc1.nextLine();
		
		if(isAnagram(s1,s2))
			System.out.println("anagram");
		else
			System.out.println("not");
		
		
	}
	public static boolean isAnagram(String s1,String s2)
	{
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		String s3=new String(ch1);
		String s4=new String(ch2);
		
		if(s3.equals(s4))
			return true;
		else
			return false;
		
	}

}
