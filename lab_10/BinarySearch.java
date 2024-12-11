package lab_10;

public class BinarySearch {
    public static int binarySearch(int[] array, int target) {
        return binarySearch(array, target, 0, array.length - 1);
    }

    private static int binarySearch(int[] array, int target, int left, int right) {
        if (left > right) {
            return -1; // Base case: target is not in the array
        }
        int mid = left + (right - left) / 2; // Prevents  overflow
        if (array[mid] == target) {
            return mid; // Target found
        } else if (array[mid] > target) {
            return binarySearch(array, target, left, mid - 1); // Search in the left half
        } else {
            return binarySearch(array, target, mid + 1, right); // Search in the right half
        }
    }

    public static void main(String[] args) {
        int[] a = {-4, 2, 7, 10, 15, 20, 22, 25, 30, 36, 42, 50, 56, 68, 85, 92, 103};

        System.out.println(binarySearch(a, 42)); // Output: 10
        System.out.println(binarySearch(a, 66)); // Output: -1
        System.out.println();
        System.out.println("Lab 10, Dereck Chetram, CET3640 - HD80");
        System.out.println("In this lab I learned how look though an array to identify a target numbers index");
        System.out.println("In this lab I struggled using using 2 methods to determine the needed information to complete the search");
    }
}
