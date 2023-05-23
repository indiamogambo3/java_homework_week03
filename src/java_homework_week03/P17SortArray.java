package java_homework_week03;

/**
 * 17. Write a Java program to sort a numeric array and a string array.
 */

import java.util.Arrays;

public class P17SortArray {

    public static void main(String[] args) {

        int[] numberArray = {
                25, 251, 362, 78, 12, 524, 362, 115, 63, 2};
        System.out.println("Actual numerical array : ");
        for (int i : numberArray) {
            System.out.print(i + " ");
        }

        System.out.println("                                 ");
        System.out.println("Numerical array sorted: ");
        Arrays.sort(numberArray);
        System.out.print(Arrays.toString(numberArray));

        String[] stringArray = {
                "Cat", "Ape", "Zebra", "Giraffe", "Monkey", "Pig", "Buffalo", "Cow", "Elephant", "Lion"};
        System.out.println("                                 ");
        System.out.println("Actual string array : ");
        for (String i : stringArray) {
            System.out.print(i + " ");
        }

        System.out.println("                                 ");
        System.out.println("String array sorted :");
        Arrays.sort(stringArray);
        System.out.print(Arrays.toString(stringArray));

    }

}









