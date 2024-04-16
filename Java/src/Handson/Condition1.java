package Handson;

import java.util.Scanner;

public class Condition1 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			int a=sc.nextInt();
			if(a>50)
			{
				System.out.println("Pass");
			}
			else {
				System.out.println("Fail");
			}
		}		
	}
}

