package Polymorphism;

public class Car2023 {
	
	void roof()
	{
		System.out.println("Sunroof");
	}
	void wheels()
	{
		System.out.println("Normal wheels");
	}

}
class Car2024 extends Car2023
{
	void tracker()
	{
		System.out.println("GPS tracker");
	}
	void roof()
	{
		System.out.println("Panaromic roof");
		super.roof();//To call the parent class method
	}
	public static void main(String[] args) {
		Car2024 c1=new Car2024();
		c1.roof();
		c1.tracker();
		c1.wheels();
	}
}
