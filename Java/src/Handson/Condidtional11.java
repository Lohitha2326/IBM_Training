package Handson;

import java.util.Scanner;

public class Condidtional11 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int units=sc.nextInt();
		 double bill=0;
		 double total;
		 if(units<=50)
		 {
			 bill=50*2;
		 }
		 else if(units>50 && units<=150)
		 {
			 bill=50*2+(units-50)*3;
		 }
		 else if(units>150 && units<=250)
		 {
			 bill=50*2+100*3+(units-150)*5;
		 }
		 else if(units>250)
		 {
			 bill=50*2+100*3+100*5+(units-250)*8;
		 }
		 total=(0.2*bill)+bill;
		 
		 System.out.println(total);
	}

}
