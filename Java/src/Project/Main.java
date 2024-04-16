package Project;

import java.util.Scanner;

public class Main {
public static void main(String[] args)
{
	Scanner scanner=new Scanner(System.in);
	int s=scanner.nextInt();
	if(s==1)
	{
	Model1 m1=new Model1();
	m1.show();
	m1.BV1();
	m1.MV1();
	m1.TV1();
	}
	else if(s==2)
	{
	Model2 m2=new Model2();
	m2.show();
	m2.BV2();
	m2.MV2();
	m2.TV2();
	}
	else
	{
	Model3 m3=new Model3();
	m3.show();
	m3.BV3();
	m3.MV3();
	m3.TV3();
	}
	
}
}
