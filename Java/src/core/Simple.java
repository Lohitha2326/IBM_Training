package core;

public class Simple {
int a=10;
int b=20;
void m1() {
	System.out.println("Method called");
}
public static void main(String[] args)
{
	Simple obj1=new Simple();
	System.out.println(obj1.a+obj1.b);
	obj1.m1();
}
}
