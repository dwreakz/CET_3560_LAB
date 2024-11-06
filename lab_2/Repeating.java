package lab_2;

public class Repeating {
	public static void main (String [] agrs) {
		String message = "hello";
		int repetitions = 3 ;
		String output = repeat(message, repetitions);
		System.out.println(output);
	}
    public static String repeat(String message, int repetitions) {
        String product = "";
        for (int i = 0; i < repetitions; i++) {
        	product += message;
        }
       return product;
    }
}