package CarProject;

public class Model2 {
}
	class M2B extends BaseVarient {
		void display()
		{
			BaseVarient b = new BaseVarient();
			System.out.println("Price : 14 Lakhs");
			b.music();
			b.wheels();
			b.airbags();
			b.fogLights();
			b.headLights();
			b.parkingSensors();
		}
	}

	class M2M extends MiddleVarient {
		void display()
		{
			MiddleVarient b = new MiddleVarient();
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

	class M2T extends TopVarient {
		void display()
		{
			TopVarient b = new TopVarient();
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



