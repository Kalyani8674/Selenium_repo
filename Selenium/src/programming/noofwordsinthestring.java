package programming;

import java.util.Scanner;

public class noofwordsinthestring
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");

		String s=sc.nextLine();
		char ch[]=s.toCharArray();

		for(int i=0;i<=ch.length-1;i++)
		{
			int count=0; 
			String m="";
			while(i<=ch.length-1&&ch[i]!=' ')
			{
				count++;
				m=m+ch[i];
				i++;
			}
			System.out.println(m+" "+count);
		}

	}

}
