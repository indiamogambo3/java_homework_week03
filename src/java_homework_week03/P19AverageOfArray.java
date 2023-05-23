package java_homework_week03;

/**
 * 19. Write a Java program to calculate the average value of array elements.
 */

import java.util.Arrays;

public class P19AverageOfArray {

    public static void main(String[] args) {

        int[] numbers = {
                20, 35, 129, 459, 126, 223, 556, 359, 956, 840};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        int average = sum / numbers.length;

        System.out.println("Values of arrays are :" + Arrays.toString(numbers));
        System.out.println("Average of arrays is :" + average);

    }

}
