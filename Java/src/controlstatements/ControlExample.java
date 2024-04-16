package controlstatements;

public class ControlExample {
	public static void main(String[] args)
	{
		int a=10;
		int b=30;
		int c=20;
		if(a>b)
		{
			System.out.println("A is greater than B");
			if(a>c)
			{
				System.out.println("A is greater than C");
			}
			else
			{
				System.out.println("C is greather than A");
			}
		}
		else if(a<b)
		{
			System.out.println("A is lesser than B");
		}
		else if(a==b)
		{
			System.out.println("A is equals to B");
		}
		
	}

}
