package lab_9;

public class ComputePower {

    public static int power(int base, int exponent) {
        // Case for exponent = (Negative INT)
        if (exponent < 0) {
            throw new IllegalArgumentException("n must not be negative");
        }
        // Case if any number to power of 0 is 1
        if (exponent == 0) {
            return 1;
        }
        // Recursive case Multipy base with the result of base^(exponent - 1)
        return base * power(base, exponent - 1);
    }
    public static void main(String[] args) {
        System.out.println(power(3, 4));
        System.out.println(power(2, 5));
        System.out.println(power(5, 0));
        System.out.println(power(7, 1));
    }
}
