package ExceptionHandler;

public class ExceptionHandle {
	public static void main(String[] args)
	{
		int a=10;
		int b=0;
		System.out.println("Exceution started");
		try
		{
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			
			System.out.println("Arithmetic Exception:b should not be 0");
		}
		System.out.println("Exceution completed");
	}

}
