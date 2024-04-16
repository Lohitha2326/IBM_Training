package inheritance;
class GrandParent
{
	void gold()
	{
		System.out.println("2kg gold");
	}
}
class Parent extends GrandParent{
	void home()
	{
		System.out.println("Home usage");	
	}
	void savings()
	{
		System.out.println("savings remained");
	}
}
class Child extends Parent
	{
		void job()
		{
			System.out.println("2 lakhs for job");
		}
		public static void main(String args[]) {
			Child c=new Child();
			c.home();
			c.savings();
			c.job();
			c.gold();
		}
	}


