package Lab_2;

public class DistanceCalc {
	public static void main (String [] agrs) {
		int x1 = 10, y1 = 2;
		int x2 = 3, y2 = 5;
		
		double distance = computeDistance(x1, y1, x2, y2);
        System.out.println("The distance between the points (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is: " + distance);
    }
    public static double computeDistance(int x1, int y1, int x2, int y2) {
        int dx = x2 - x1;
        int dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }
}