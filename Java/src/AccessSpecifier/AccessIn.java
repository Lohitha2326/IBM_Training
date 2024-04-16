package AccessSpecifier;

public class AccessIn {
	public static void main(String[] args)
	{
	AccessExample obj1=new AccessExample();//within the pacakge
	//System.out.println(obj1.vPrivate);
	System.out.println(obj1.vDefault);
	System.out.println(obj1.vProtected);
	System.out.println(obj1.vPublic);
	}

}
