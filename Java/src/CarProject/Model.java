package CarProject;

public class Model {

}
class M3B extends BaseVarient3 {
	void display()
	{
		BaseVarient3 b = new BaseVarient3();
		System.out.println("Price : 14 Lakhs");
		b.music();
		b.wheels();
		b.airbags();
		b.fogLights();
		b.headLights();
		b.parkingSensors();
	}
}

class M3M extends MiddleVarient3 {
	void display()
	{
		MiddleVarient3 b = new MiddleVarient3();
		System.out.println("Price : 16 Lakhs");
		b.music();
		b.wheels();
		b.airbags();
		b.fogLights();
		b.headLights();
		b.parkingSensors();
		System.out.println("Cruise Control\nWireless Charging\nBuilt in Maps");
	}
}

class M3T extends TopVarient3 {
	void display()
	{
		TopVarient3 b = new TopVarient3();
		System.out.println("Price : 17.3 Lakhs");
		b.music();
		b.wheels();
		b.airbags();
		b.fogLights();
		b.headLights();
		b.parkingSensors();
		System.out.println("Cruise Control\nWireless Charging\nBuilt in Maps\nLeather Seat Covers");
	}
}

