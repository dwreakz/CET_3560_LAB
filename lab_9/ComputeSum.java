package lab_9;

public class ComputeSum {
    public static int sumOfSquares(int n) {
        //  Case when n = Negative Int
        if (n < 0) {
            throw new IllegalArgumentException("n must not be negative");
        }
        // Case if n = 0, and will return 0
        if (n == 0) {
            return 0;
        }
        // Recursive case: Add n^2 to the sum of square of (n - 1)
        return (n * n) + sumOfSquares(n - 1);
    }
    public static void main(String[] args) {
        System.out.println(sumOfSquares(3));
        System.out.println(sumOfSquares(5));
        System.out.println(sumOfSquares(0));
    }
}