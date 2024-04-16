package Handson;

import java.util.Scanner;

public class Conditional6 {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int salary=sc.nextInt();
	int service=sc.nextInt();
	if(service>5)
	{
		System.out.println("5% bonus");
	}
	else
	{
		System.out.println("No");
	}

}
}
