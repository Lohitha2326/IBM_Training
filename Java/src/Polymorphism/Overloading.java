package Polymorphism;

public class Overloading {
	void add(int a)
	{
		System.out.println(a);
	}
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	public static void main(String[] args)
	{
		Overloading o=new Overloading();
		o.add(10,20,30);
		o.add(10);
	}

}
