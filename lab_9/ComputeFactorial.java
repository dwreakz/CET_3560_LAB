package lab_9;

public class ComputeFactorial {
    public static int factorial(int n) {
        // Factorial of 0 or 1 = 1
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(factorial(0));
        System.out.println(factorial(1));
        System.out.println(factorial(5));
    }
}
