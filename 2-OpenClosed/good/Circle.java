package good;

public class Circle implements Shape{

	public double radius;

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return (22/7) * radius * radius;
	}

}
