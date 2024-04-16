package Handson;

import java.util.Scanner;

public class Loop5 {
	public static void main(String[] args)
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}

}
