package Collections;
import java.util.*;


//Collection of hashmap & linkedhashmap & methods & for-each
public class MapExample {
	public static void main(String[] args)
	{
		HashMap<Integer,String> h1=new HashMap<Integer,String>();//sorted order
		//LinkedHashMap<Integer,String> h1=new LinkedHashMap<Integer,String>();//gives insertion order
		//h1.put(101,"abc");
		h1.put(102,"def");
		h1.put(103,"ghi");
		System.out.println(h1);
		h1.putIfAbsent(101, "klm");//if no specified key value is not present
		System.out.println(h1);
		h1.remove(103);
		System.out.println(h1);
		h1.replace(101, "ttt");
		System.out.println(h1);
		
		//for-each in Map
		for(Map.Entry<Integer,String> entry:h1.entrySet())
		{
			System.out.println(entry.getKey()+","+entry.getValue());
		}
		
	}

}
