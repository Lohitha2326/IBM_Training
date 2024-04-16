package Handson;

import java.util.Scanner;

public class Conditional4 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		if((a>300|| b>300)&&(a+b)<500)
		{
			System.out.println("Can team up");
		}
		else
		{
			System.out.println("Cannot team up");
		}
	}

}
