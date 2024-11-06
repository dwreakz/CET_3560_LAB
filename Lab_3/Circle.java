package Lab_3;

public class Circle {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	public double area() {
		return Math.PI * radius * radius; 
	}
	public double circumference() {
		return 2 * Math.PI * radius;
	}
	public double getRadius() {
		return radius;
	}
	public String toString() {
		return "Circle{radius=" + radius + "}";
	}
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			double randomRadius = Math.random() * 10 ;
			Circle circle = new Circle(randomRadius);
	        System.out.println(circle.toString() + " - Area: " + circle.area() + " - Circumference: " + circle.circumference());
	    }
	}
}
