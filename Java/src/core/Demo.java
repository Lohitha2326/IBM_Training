package core;

public class Demo {
	Demo(int a,int b)
	{
		System.out.println(a*b);
	}
	void m1(int c,int d)
	{
		System.out.println(c+d);
	}
	void m2()
	{
		System.out.println("Method called");
	}
	public static void main(String[] args)
	{
		Demo d=new Demo(10,20);
		d.m1(5, 5);
		d.m2();
	}

}
