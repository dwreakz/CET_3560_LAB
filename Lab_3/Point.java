package Lab_3;

public class Point {
	private int x;
	private int y;
	
	// Cosntructor
	public Point(int initX, int initY) {
		this.x = initX;
		this.y = initY;
	}
	public int getX() {
		return x; 
	}
	public int getY() {
		return y; 
	}
	public double distanceFromOrigin() {
		return Math.sqrt(x * x + y * y);
	}
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	public void translate(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}
	public static void main(String[] args) {
        Point p = new Point(3, 4);
        System.out.println("Point: " + p);
        System.out.println("X: " + p.getX());
        System.out.println("Y: " + p.getY());
        System.out.println("Distance from origin: " + p.distanceFromOrigin());
        
        p.translate(1, 1);
        System.out.println("After translating by (1, 1): " + p);
    }
}
