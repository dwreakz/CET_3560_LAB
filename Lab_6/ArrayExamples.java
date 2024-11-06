 package Lab_6;
 
 public class ArrayExamples {
	    // Method to print elements of an array
	    public void print(int[] array) {
	        for (int i = 0; i < array.length; i++) {
	            System.out.println("element [" + i + "] is " + array[i]);
	        }
	    }
	    // Method to compute the average of an integer array
	    public double computeAverage(int[] array) {
	        int total = 0;
	        for (int i = 0; i < array.length; i++) {
	            total += array[i];
	        }
	        return (double) total / array.length;
	    }
	    // Method to check if a double array is sorted
	    public boolean sorted(double[] array) {
	        for (int i = 0; i < array.length - 1; i++) {
	            if (array[i] > array[i + 1]) {
	                return false;
	            }
	        }
	        return true;
	    }
	    public int indexOf(int[] array, int target) {
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] == target) {
	                return i;
	            }
	        }
	        return -1;
	    }
	    // Main method to test all methods
	    public static void main(String[] args) {
	        ArrayExamples example = new ArrayExamples();

	        int[] intArray = {32, 5, 27, -3, 2598};
	        double[] doubleArray = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};

	        // Test print
	        System.out.println("Testing print method:");
	        example.print(intArray);

	        // Test computeAverage
	        System.out.println("\nTesting computeAverage method:");
	        System.out.println("Average: " + example.computeAverage(intArray));

	        // Test sorted
	        System.out.println("\nTesting sorted method:");
	        System.out.println("Is sorted: " + example.sorted(doubleArray));

	        // Test indexOf
	        System.out.println("\nTesting indexOf method:");
	        System.out.println("Index of 27: " + example.indexOf(intArray, 27));
	        System.out.println("Index of 42: " + example.indexOf(intArray, 42));
	        
	        System.out.println("Lab 6, Dereck Chetram, CET3640 - HD80");
	        System.out.println("In this lab I learned how to iterate through an array and analyze elements");
	        System.out.println("In this lab I struggled with determining the parameters on how to iterate through the array using .length");
	    }
	}
