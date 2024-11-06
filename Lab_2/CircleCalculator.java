package Lab_2;

public class CircleCalculator {
	public static void main (String [] agrs) {
		double radius = 2.0;
		double area = circleArea(radius);
		System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }

    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
}