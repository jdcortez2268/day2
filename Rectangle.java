

public class Rectangle implements Shape {
	
	double area;
	double length;
	double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
		calculateArea();
	} 
	
	@Override
	public void calculateArea() {
		area = length * width;
		
	}

	@Override
	public void display() {
		System.out.println("The total area for this rectangle is: " + area);
	}
}
