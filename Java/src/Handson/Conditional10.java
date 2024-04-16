package Handson;

import java.util.Scanner;

public class Conditional10 {
	public static void main(String[] args)
	{
		double sq;
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		sq=Math.pow(a,2)+Math.pow(b, 2);
		System.out.println(sq);
		if(sq>=60)
		{
			System.out.println("sum of powers greater");
		}
		else
		{
			System.out.println("Lesser");
		}
	}

}
