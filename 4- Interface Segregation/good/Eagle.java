package good;

public class Eagle implements FlyingCreature, FeatheredCreature{
	
	String currentLocation;
	int numberOfFeathers;
	
	public Eagle(int initialNumberOfFeather) {
		this.numberOfFeathers = initialNumberOfFeather;
	}
	
	public void fly() {
		this.currentLocation = "in the air";
	}
	
	public void molt() {
		this.numberOfFeathers -= 1;
	}

}
