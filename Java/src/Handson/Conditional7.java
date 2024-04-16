package Handson;

import java.util.Scanner;

public class Conditional7 {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	if(n>=10 && n<=99)
	{
		System.out.println("Yes it is 2 digit number");
		int first=n/10;
		int last=n%10;
		if((first+last==7) || (n%7==0) || (first==7) || (last==7))
		{
			System.out.println("Special number");
		}
		else
		{
			System.out.println("Normal number");
		}
	}
	else
	{
		System.out.println("Not 2 digit number");
	}
	

}
}
