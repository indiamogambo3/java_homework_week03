package java_homework_week03;

/**
 * 12. Write a program that tells us input value is number or an alphabet or symbol.
 */

import java.util.Scanner;

public class P12ValueOfInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character : ");
        char ch = scanner.next().charAt(0);
        scanner.close();

        P12ValueOfInput value = new P12ValueOfInput();
        value.valueInput(ch);

    }
    public void valueInput(char ch) {

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println("This is an alphabet");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("This is a number");
        } else {
            System.out.println("This is a symbol");
        }

    }

}

    

