package java_homework_week03;

/**
 * 16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */

import java.util.Scanner;

public class P16PositiveOrNegative {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        double a = scanner.nextDouble();
        scanner.close();

        numberPositiveOrNegative(a);
    }

public static void numberPositiveOrNegative(double a) {

        if (a > 0) {
            System.out.println(a + " is a positive number");
        } else if (a < 0) {
            System.out.println(a + " is a negative number");
        }else {
            System.out.println(a + " is zero");
        }
}

}
