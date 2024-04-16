package Handson;

import java.util.Scanner;

public class Loop2 {
	public static void main(String[] args)
	{
		int sum=0;
		int avg;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		avg=sum/n;
		System.out.println(avg);
	}

}
