package CarProject;

public class Model3 {

}
class BaseVarient3 implements GenericFeatures {
	
    public void music() { 
    	System.out.println("Music Player : 7' Touch");
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
		System.out.println("Parking Sensors : Yes");
	}
}

class MiddleVarient3 implements GenericFeatures {
	
    public void music() { 
    	System.out.println("Music Player : 7' Touch");
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
		System.out.println("HeadLights : LED");
	}
	
	public void parkingSensors() {
		System.out.println("Parking Sensors : Yes");
	}
}

class TopVarient3 implements GenericFeatures {
	
    public void music() { 
    	System.out.println("Music Player : 10' touch ");
    }
	
	public void wheels() {
		System.out.println("Wheels : Alloy");
	}
	
	public void airbags() {
		System.out.println("Airbags : 6");
	}
	
	public void fogLights() {
		System.out.println("FogLights");
	}
	
	public void headLights() {
		System.out.println("HeadLights : LED");
	}
	
	public void parkingSensors() {
		System.out.println("Parking Sensors : Front and Back Camera");
	}
}


