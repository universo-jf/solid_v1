package good;

public class Rectangle implements Shape {
	
	double length;
	double width;
	
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return length * width;
	}

}
