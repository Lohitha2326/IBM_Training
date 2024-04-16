package ExceptionHandler;

public class ThreadingExample extends Thread{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}

}
class ThreadingExample1 extends Thread
{
	public void run() // if there are many methods then we use as void m1(){...} void run{ this.m1();}
	{
		for(int j=10;j<=20;j++)
		{
			System.out.println(j);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args)
	{
		ThreadingExample t1=new ThreadingExample();
		ThreadingExample1 t2=new ThreadingExample1();
		t1.start();
		t2.start();
	}
}
