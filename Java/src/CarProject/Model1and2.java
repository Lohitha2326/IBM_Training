package CarProject;

public class Model1and2 {

}
class BaseVarient implements GenericFeatures {
	
    public void music() { 
    	System.out.println("Music Player : Digital");
    }
	
	public void wheels() {
		System.out.println("Wheels : Normal");
	}
	
	public void airbags() {
		System.out.println("Airbags : 2");
	}
	
	public void fogLights() {
		System.out.println("No FogLights");
	}
	
	public void headLights() {
		System.out.println("HeadLights : Normal");
	}
	
	public void parkingSensors() {
		System.out.println("Parking Sensors : No");
	}
}

class MiddleVarient implements GenericFeatures {
	
    public void music() { 
    	System.out.println("Music Player : Touch");
    }
	
	public void wheels() {
		System.out.println("Wheels : Alloy");
	}
	
	public void airbags() {
		System.out.println("Airbags : 2");
	}
	
	public void fogLights() {
		System.out.println("FogLights");
	}
	
	public void headLights() {
		System.out.println("HeadLights : Normal");
	}
	
	public void parkingSensors() {
		System.out.println("Parking Sensors : 4");
	}
}

class TopVarient implements GenericFeatures {
	
    public void music() { 
    	System.out.println("Music Player : 9' touch ");
    }
	
	public void wheels() {
		System.out.println("Wheels : Alloy");
	}
	
	public void airbags() {
		System.out.println("Airbags : 6");
	}
	
	public void fogLights() {
		System.out.println("FogLamps");
	}
	
	public void headLights() {
		System.out.println("HeadLights : LED");
	}
	
	public void parkingSensors() {
		System.out.println("Parking Sensors : 8");
	}
}


