package good;

public class Penguin implements SwimmingCreature, FeatheredCreature{
	
	String currentLocation;
	int numberOfFeathers;
	
	public Penguin(int initialNumberOfFeatherCount) {
		this.numberOfFeathers = initialNumberOfFeatherCount;
		
	}
	
	public void swim() {
		this.currentLocation = "in the air";
	}
	
	public void molt() {
		this.numberOfFeathers -= 4;
	}
	
}
