package programming;

import java.util.Scanner;

public class program1 
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		String s1=s.nextLine();//abcd
		int vc=0,cc=0;

		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch=s1.charAt(i);
			if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z')
			{
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
					vc++;
				else
					cc++;
			}
		}
		System.out.println("no of vowels are" + vc);
		System.out.println("no of cons are" + cc);

	}

}
