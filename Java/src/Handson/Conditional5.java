package Handson;

import java.util.Scanner;

public class Conditional5 {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	if((a+b+c)==180)
	{
		System.out.println("Valid triangle");
	}
	else
	{
		System.out.println("Not");
	}

}
}
