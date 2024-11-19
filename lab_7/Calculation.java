package lab_7;

import java.util.ArrayList;
import java.util.Arrays;

public class Calculation {

    public static double mean(ArrayList<Double> list) {
        if (list.isEmpty()) {
            return 0.0;
        }
        double sum = 0.0;
        for (double num : list) {
            sum += num;
        }

        return sum / list.size();
    }

    public static void main(String[] args) {

        // Test Case: Mixed Positive and Negative Numbers
        ArrayList<Double> list = new ArrayList<>(Arrays.asList(-5.0, -3.0, 0.0, 3.0, 5.0));
        System.out.println("Test Case: Mixed Positive and Negative Numbers");
        System.out.println("Expected Output: 0.0");
        System.out.println("Actual Output: " + mean(list));
        System.out.println();
        System.out.println("Lab 7, Dereck Chetram, CET3640 - HD80");
        System.out.println("In this lab I learned how to use ArrayLists to and perform calculations on set of numbers");
        System.out.println("In this lab I struggled with on how to iterate through the an ArrayList using the .size() method");
    }
}
