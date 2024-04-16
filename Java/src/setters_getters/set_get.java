package setters_getters;

public class set_get {
	private String name="java";
	
	public void setName(String sname)
	{
		this.name=sname;
	}
	public String getName()
	{
		return name;
	}

}
class Test
{
	public static void main(String[] args)
	{
		set_get s1=new set_get();
		s1.setName("core java");
		System.out.println(s1.getName());
	}
}
