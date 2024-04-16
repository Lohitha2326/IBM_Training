package CarProject;

public class Model1 {

}
class M1B extends BaseVarient {
	void display()
	{
		BaseVarient b = new BaseVarient();
		System.out.println("Price : 5 Lakhs");
		b.music();
		b.wheels();
		b.airbags();
		b.fogLights();
		b.headLights();
		b.parkingSensors();
	}
}

class M1M extends MiddleVarient {
	void display()
	{
		MiddleVarient b = new MiddleVarient();
		System.out.println("Price : 6.5 Lakhs");
		b.music();
		b.wheels();
		b.airbags();
		b.fogLights();
		b.headLights();
		b.parkingSensors();
	}
}

class M1T extends TopVarient {
	void display()
	{
		TopVarient b = new TopVarient();
		System.out.println("Price : 8 Lakhs");
		b.music();
		b.wheels();
		b.airbags();
		b.fogLights();
		b.headLights();
		b.parkingSensors();
		System.out.println("Cruise Control");
	}
}
