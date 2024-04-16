package FunctionalInterface;

//general procedure
/*@FunctionalInterface
public interface LambdaExample {
	int m1();

}
class LambdaExample1 implements LambdaExample
{
	@Override
	public int m1()
	{
		return 100;
	}
	public static void main(String[] args)
	{
		LambdaExample1 obj1=new LambdaExample1();
		System.out.println(obj1.m1());
	}
}
*/


@FunctionalInterface
interface LambdaExample1
{
	int m1();
}
public class LambdaExample
{
	public static void main(String[] args)
	{
		LambdaExample1 l1;
		l1=()->120;
		System.out.println(l1.m1());
	}
}







