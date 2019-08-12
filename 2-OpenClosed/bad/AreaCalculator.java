package bad;

public class AreaCalculator {
	
	//Primeiro esse
	public double calculateRectangleArea(Rectangle rectangle) {
		return rectangle.length * rectangle.width;
	}
	
	//Depois esse
	public double calculateCircleArea(Circle circle) {
		return (22/7) * circle.radius * circle.radius;
	}
	
}
