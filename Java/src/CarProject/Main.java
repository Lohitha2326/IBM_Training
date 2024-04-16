package CarProject;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int s = scanner.nextInt();
		CommonFeatures c = new CommonFeatures();
		if(s==1) {
		M1B b1 = new M1B();
		M2B b2 = new M2B();
		M3B b3 = new M3B();
		c.show();
		b1.display();
		c.show();
		b2.display();
		c.show();
		b3.display();
	}
		else if(s==2){
			M1M b1 = new M1M();
			M2M b2 = new M2M();
			M3M b3 = new M3M();
			c.show();
			b1.display();
			c.show();
			b2.display();
			c.show();
			b3.display();
		}
		else 
		{
			M1T b1 = new M1T();
			M2T b2 = new M2T();
			M3T b3 = new M3T();
			c.show();
			b1.display();
			c.show();
			b2.display();
			c.show();
			b3.display();
		}
	}
}
