package lab_1;
import java.util.Scanner;

public class RangeOfNumbers {
    public static void main(String[] agrs) {
        Scanner console = new Scanner(System.in);
        System.out.print("Start? ");
        int start = console.nextInt();
        System.out.print("End? ");
        int end = console.nextInt();
        printRange(start, end);
        console.close();
    }
    public static void printRange(int start, int end) {
        //If start value was larger than end value 
        if (start > end) {
            for (int i = start; i >= end; i--) {
                if (i == end) {
                    System.out.print(i);
                } else {
                    System.out.print(i + ", ");
                }
            }
        } 
        
        else if (start < end) {
            for (int i = start; i<= end; i++) {
                if (i == end) {
                    System.out.print(i);
                } else {
                    System.out.print(i + ", ");
                }
            }
        } 
        
        else {
            System.out.print(start);
        }
        System.out.println();
    }
}
