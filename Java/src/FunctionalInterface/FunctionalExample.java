package FunctionalInterface;
/* We use only one abstract method
 * In functional interface we use @FunctionalInterface
 * The properties may be default or static.It contains LAMBDA expression
 * 
 */
//
@FunctionalInterface
public interface FunctionalExample {
	void m1();
	default void m2()
	{
		
	}
}

