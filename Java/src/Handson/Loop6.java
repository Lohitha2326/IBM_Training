package Handson;

import java.util.Scanner;

public class Loop6 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int k=1;k<=2;k++)
		{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
				
			}
			System.out.print("\n");
		}
		}
		
			
	}

}
