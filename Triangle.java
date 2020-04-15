
public class Triangle implements Shape {

	double area;
	double height;
	double base;
	
	public Triangle(double height, double base) {
		this.height = height;
		this.base = base;
		calculateArea();
	} 
	
	@Override
	public void calculateArea() {
		area = (height * base)/2;
	}

	@Override
	public void display() {
		System.out.println("The total area for this triangle is: " + area);
	}
}