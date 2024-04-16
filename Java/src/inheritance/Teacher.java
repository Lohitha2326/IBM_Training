//Hierarichal Inheritance

package inheritance;

public class Teacher {
	void maths()
	{
		System.out.println("Mathematics");
	}

}
class Student1 extends Teacher
{
	void english()
	{
		System.out.println("English");
	}
}
class Student2 extends Teacher
{
	void hindi()
	{
		System.out.println("Hindi");
	}
}
class Test
{
	public static void main(String[] args)
	{
	Student1 s1=new Student1();
	Student2 s2=new Student2();
	s1.maths();
	s1.english();
	s2.hindi();
	}
}
