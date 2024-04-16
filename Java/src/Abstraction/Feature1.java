package Abstraction;

public class Feature1 {
	void message()
	{
		System.out.println("Method1");
	}

}
class Feature2 extends Feature1
{
	void message()
	{
		System.out.println("Method2");
	}
}
abstract class Feature3 extends Feature2
{
	void message()
	{
		System.out.println("Method3");
	}
	//abstract void images(); If we want another class to execute then we should close the method with ;
	void images()//If we extend feature3 then we should not use abstract keyword
	{
		
	}
}
class Whatsapp extends Feature3
{
	public static void main(String[] args)
	{
		Whatsapp w=new Whatsapp();
		w.message();
	}
}
