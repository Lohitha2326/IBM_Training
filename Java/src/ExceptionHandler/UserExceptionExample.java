package ExceptionHandler;

class EligibleException extends Exception
{
	public EligibleException(String str) {
		super(str);
	}
}

public class UserExceptionExample  {
	void eligible(int age,int percentage) throws Exception
	{
		if(age<17 || percentage<60)
		{
			throw new EligibleException("Not Eligible");
		}
		else
		{
			System.out.println("Student registartion success");		}
	}
	public static void main(String[] args) throws Exception
	{
		UserExceptionExample obj1=new UserExceptionExample();
		try {
			obj1.eligible(18,65);
		}
		catch(EligibleException e)
		{
			System.out.println(e);
		}
		System.out.println("Execution completed");
	}

}
