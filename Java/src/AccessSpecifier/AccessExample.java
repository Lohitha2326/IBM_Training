package AccessSpecifier;

public class AccessExample {//within class
		private String vPrivate="Private variable";
		String vDefault="Default variable";
		protected String vProtected="Protected variable";
		public String vPublic="Public variable";
}
class Sample
{
		public static void main(String[] args)
{
AccessExample obj1=new AccessExample();//outside the class
	//System.out.println(obj1.vPrivate);
	System.out.println(obj1.vDefault);
	System.out.println(obj1.vProtected);
	System.out.println(obj1.vPublic);

}
}

