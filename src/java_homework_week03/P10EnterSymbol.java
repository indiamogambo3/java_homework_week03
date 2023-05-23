package java_homework_week03;

/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */

import java.util.Scanner;

public class P10EnterSymbol {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int a = scanner.nextInt();
        System.out.println("Enter second number : ");
        int b = scanner.nextInt();
        System.out.println("Enter symbol +, -, * or /");
        char symbol = scanner.next().charAt(0);
        scanner.close();

        selectSymbol(a, b, symbol);

    }
    public static void selectSymbol(int a, int b, char symbol) {

        if (symbol == '+') {
            System.out.println(a + " + " + b + " = " + (a + b));
        } else if (symbol == '-') {
            System.out.println(a + " - " + b + " = " + (a - b));
        } else if (symbol == '*') {
            System.out.println(a + " * " + b + " = " + (a * b));
        } else if (symbol == '/') {
            System.out.println(a + " / " + b + " = " + (a / b));
        }else {
            System.out.println("Please enter symbols +,-,*,/ only");

        }

    }

}
