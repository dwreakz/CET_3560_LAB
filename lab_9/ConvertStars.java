package lab_9;

public class ConvertStars {

    public static void printStars(int n) {
        // If n is 0, do nothing
        if (n == 0) {
            return;
        }
        System.out.print("*");
        printStars(n - 1);
    }
    public static void main(String[] args) {
        printStars(5);
    }
}
