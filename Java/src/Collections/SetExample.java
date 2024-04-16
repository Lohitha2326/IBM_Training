package Collections;
import java.util.*;


//Collection of hashset & linkedhashset & methods & for-each,iterators
public class SetExample {
	public static void main(String[] args)
	{
		HashSet<Object> h1=new HashSet<Object>();//no order
		//LinkedHashSet<Object> h1=new LinkedHashSet<Object>();//maintains order

		h1.add(100);
		h1.add("Welcome");
		h1.add(10.6);
		h1.add(200);
		System.out.println(h1);
		//h1.remove(100);//we can remove using values as there is no indexing
		System.out.println(h1);
		
		
		
		//Iterators
		
		Iterator itr=h1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		for(Object i:h1)
		{
			System.out.println(i);
		}
	}

}
