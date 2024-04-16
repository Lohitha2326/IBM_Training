package EnumExample;

public class EnumEx {
	enum signal
	{
		RED,
		ORANGE,
		GREEN
		
	}
	public static void main(String[] args)
	{
		signal stop=signal.ORANGE;//THe value we give here will be printed if we give then it prints red
		signal redaytostart=signal.RED;
		signal go=signal.RED;
		System.out.println(stop);
	}

}
