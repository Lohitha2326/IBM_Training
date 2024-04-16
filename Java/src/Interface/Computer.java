package Interface;

public interface Computer {
	void run();//Public abstract method

}
class Laptop implements Computer
{
	public void run()//it is mandatory to use public because in interface all are public abstract by deafult
	{
		System.out.println("Running");
	}
}
class Desktop
{
	public static void main(String[] args)
	{
		Computer c=new Laptop();
		c.run();
	}
}
