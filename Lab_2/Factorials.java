package Lab_2;

public class Factorials {
	
	public static void main (String [] agrs) {
		int n = 4 ;
		System.out.println(factorial(n));
	}
	
    public static int factorial(int n) {
    int result = 1;
    for (int i = 2; i <= n; i++) {
    	result *= i;
    }
    return result;
   }
}