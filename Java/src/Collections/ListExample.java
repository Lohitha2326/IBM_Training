package Collections;
import java.util.*;


//Collection of arraylist & linkedarraylist & methods & for-each,iterators
public class ListExample {
	public static void main(String[] args)
	{
		ArrayList<Object> a1=new ArrayList<Object>();
		//As the arraylist is inherited from the list using it as child class
		//List<Object> l1=new ArrayList<Object>();//executes same as above line
		
		//LinkedList<Object> l1=new LinkedList<Object>(); //same for linkedlist executes and gives same output
		a1.add(100);
		a1.add("Java");
		a1.add(10.6);
		System.out.println(a1);
		a1.add(1,"Core java");
		a1.set(3, 11.6);
		System.out.println(a1);//replaces the value
		 
		System.out.println(a1.size());
		//removes the value
		a1.remove(3);//for numerical values to remove should use index
		System.out.println(a1);
		a1.remove("Java");//for string can use both value and index
		System.out.println(a1);
		
		
		//Iterators
		
				Iterator itr=a1.iterator();
				while(itr.hasNext())
				{
					System.out.println(itr.next());
				}
				//same as for-each
				
				for(Object i:a1)
				{
					System.out.println(i);
				}
	}

}
