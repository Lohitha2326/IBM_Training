package Polymorphism;

class Constructor {
	int z;
	Constructor(int x)
	{
		z=x;
	}

}
class Base extends Constructor
{
	int q;
	Base(int x,int y)
	{
		super(x);
		q=y;
	}
	void display()
	{
		System.out.println(z);
		System.out.println(q);
	}
}
class Test
{
	public static void main(String[] args)
	{
		Base b=new Base(10,20);
		b.display();
		
	}
}
