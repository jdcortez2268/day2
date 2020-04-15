
public class Circle implements Shape {

	double area;
	double radius;
	
	public Circle(double radius) {
		this.radius = radius;
		calculateArea();
	} 
	
	@Override
	public void calculateArea() {
		area = 3.14 * radius * radius;
	}

	@Override
	public void display() {
		System.out.println("The total area for this circle is: " + area);
	}
}
