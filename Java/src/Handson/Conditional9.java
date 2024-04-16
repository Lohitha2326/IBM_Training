package Handson;

import java.util.Scanner;

public class Conditional9 {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	if((n%10)==(Math.pow(n, 2)%10))
	{
		System.out.println("Same");
	}
	else
	{
		System.out.println("No");
	}
	
}
}
