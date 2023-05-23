package java_homework_week03;

/**
 * 9. Same as above program-8 using switch statement.
 */

import java.util.Scanner;

public class P9CitySwitchStatement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char alphabet;
        System.out.print("Enter an alphabet in uppercase from A to F: ");
        alphabet = scanner.next().charAt(0);
        scanner.close();

        names(alphabet);

    }

    public static void names(char alphabet) {

        switch (alphabet) {

            case 'A':
                System.out.println("Aberdeen");
                break;
            case 'B':
                System.out.println("Bath");
                break;
            case 'C':
                System.out.println("Cambridge");
                break;
            case 'D':
                System.out.println("Dover");
                break;
            case 'E':
                System.out.println("Exeter");
                break;
            case 'F':
                System.out.println("Finchley");
                break;

            default:
                System.out.println("Invalid entry!");

        }

    }

}
