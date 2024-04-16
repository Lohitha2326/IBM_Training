package Casestudy;
import java.util.*;
public class Main 
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int s=sc.nextInt();
	TV12 t=new TV12();
	TV3 t1=new TV3();
	if(s==1)
	{
		System.out.println("Model-1 Features");
		t.show();
		t.BV1();
		t.MV1();
		t.TV1();
	}
	else if(s==2)
	{
		System.out.println("Model-2 Features");
		t.show();
		t.BV2();
		t.MV2();
		t.TV2();
	}
	else
	{
		System.out.println("Model-3 Features");
		t1.show();
		t1.BV();
		t1.MV();
		t1.TV();
	}
	
}
}
