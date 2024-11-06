package lab_2;

public class SumOfRange {
	
	public static void main (String [] agrs) {
		int min = 3 ;
		int max = 7 ;
		System.out.println(sumOfRange(min,max));
	}
    public static int sumOfRange(int min, int max) {
    if (min > max) {
    	return 0;
    }
    int sum = 0;
    for (int i = min ; i <= max; i++) {
    	sum += i;
    }
    return sum;
   }
}