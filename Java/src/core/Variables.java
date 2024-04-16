package core;

public class Variables {
	int a=10;//class variables
	int b=20;
	static int c=20;
	static int d=50;
	
	static String name="Java";//static variables doesn't require object
	void m1() {
		int x=100;//local variables
		int y=150;
		System.out.println(x+y);
		}
	public static void main(String args[])
	{
		Variables v=new Variables();
	    System.out.println(v.a+v.b);
	    System.out.println(c+d);
	    System.out.println(name);
	    v.m1();//if we use static for methods then no need of object reference like m1();
	}

}
