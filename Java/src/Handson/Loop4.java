package Handson;

import java.util.Scanner;

public class Loop4 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		for(int i=a+1;i<=a+b;i++)
		{
			System.out.println(i);
		}
	}
}
