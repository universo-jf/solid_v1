package bad;

public class Penguin implements Bird{
	String currentLocation;
	int numberOfFeathers;
	
	public Penguin(int initialFeatherCount) {
		this.numberOfFeathers = initialFeatherCount;
	}
	
	public void molt() {
		this.numberOfFeathers -= 4;
	}
	
	public void fly() {
		throw new UnsupportedOperationException();
	}
	
	public void swim() {
		this.currentLocation = "in the water";
	}
}
