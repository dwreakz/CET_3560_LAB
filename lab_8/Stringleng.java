package lab_8;

import java.util.Set;

public class Stringleng {
    public static int maxLength(Set<String> strings) {
        int maxLength = 0;
        for (String str : strings) {
            if (str.length() > maxLength) {
                maxLength = str.length();
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        // Example usage
        Set<String> testStrings = Set.of("test", "math", "food", "no", "happy");
        System.out.println(maxLength(testStrings)); // Output: 5

        Set<String> emptySet = Set.of();
        System.out.println(maxLength(emptySet)); // Output: 0
        System.out.println();
        System.out.println("Lab 8, Dereck Chetram, CET3640 - HD80");
        System.out.println("In this lab I learned traverse through a Set of arrays to find the max length of the strings");
        System.out.println("In this lab I struggled finding with determining if this is simplest approach to this problem.");
    }
}