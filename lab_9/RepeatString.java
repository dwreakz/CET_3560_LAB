package lab_9;

public class RepeatString {

    public static String repeatString(String str, int n) {
        // Case for n = (Negative Int)
        if (n < 0) {
            throw new IllegalArgumentException("n must not be negative");
        }
        // Case for recursion: if n is 0, return an empty string
        if (n == 0) {
            return "";
        }
        return str + repeatString(str, n-1);
    }
    public static void main(String[] args) {
        System.out.println(repeatString("hello", 3));
        System.out.println(repeatString("abc", 5));
        System.out.println(repeatString("x", 1));
    }
}
