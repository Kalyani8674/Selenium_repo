package programming;

import java.util.Scanner;

public class sumofdigitsinstring 
{

	public static void main(String[] args) 
	{

		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		String s1=s.nextLine();//abcde
		int sum =0;

		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch=s1.charAt(i);
			if(ch>='0'&&ch<='9')
			{
				sum = sum+ch-48;
			}
		}
		System.out.println("sum");
		

	
	}

}
