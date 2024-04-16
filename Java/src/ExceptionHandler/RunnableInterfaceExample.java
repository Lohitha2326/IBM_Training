package ExceptionHandler;

public class RunnableInterfaceExample implements Runnable {
	public void m1()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
	}
	public void run()
	{
		this.m1();
	}

}
class RunnableInterface implements Runnable
{
	public void m2()
	{
		for(int j=10;j<=20;j++)
		{
			System.out.println(j);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
	}
	public void run()
	{
		this.m2();
	}
	public static void main(String[] args) throws InterruptedException
	{
		RunnableInterface r1=new RunnableInterface();
		RunnableInterfaceExample r2=new RunnableInterfaceExample();
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		t1.start();
		t2.start();
		t1.join();//to print the below statement at end we use join()
		t2.join();
		System.out.println("Execution completed");
	}
}
