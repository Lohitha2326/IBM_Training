package ExceptionHandler;

public class FinallyExample {
	public static void main(String[] args)
	{
		int a=10;
		int b=0;
		int i[]=new int[5];
		i[0]=100;
		i[1]=200;
		i[2]=300;
		i[3]=400;
		i[4]=500;
		System.out.println("Exceution started");
		try
		{
			System.out.println(i[5]);
		}catch(NullPointerException e)
		{
			System.out.println(e);
		}
		catch(ArithmeticException e)
		{
			
			System.out.println("Arithmetic Exception:b should not be 0");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Array handling completed");
		}
		System.out.println("Exceution completed");
	}

}
