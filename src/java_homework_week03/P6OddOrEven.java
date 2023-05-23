package java_homework_week03;

import java.util.Scanner;

/**
 * 6. Write a java program to input any number and find out if it’s odd or even
 */

public class P6OddOrEven {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number: ");
        int num = scanner.nextInt();
        scanner.close();

        oddOrEven(num);

    }
    public static void oddOrEven(int num) {
        if (num % 2 == 0)  {
            System.out.println(num + " is even ");
        }else{
            System.out.println(num + " is odd ");
        }

    }

}
