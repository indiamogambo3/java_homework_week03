package java_homework_week03;

/**
 * 8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */

import java.util.Scanner;

public class P8CityNames {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an alphabet in uppercase from A to F: ");
        char alphabet = input.next().charAt(0);

        P8CityNames cityNames = new P8CityNames();
        cityNames.cityName(alphabet);

    }

    public void cityName(char alphabet) {

        if (alphabet == 'A') {
            System.out.println("Aberdeen");
        } else if (alphabet == 'B') {
            System.out.println("Bath");
        } else if (alphabet == 'C') {
            System.out.println("Cambridge");
        } else if (alphabet == 'D') {
            System.out.println("Dover");
        } else if (alphabet == 'E') {
            System.out.println("Exeter");
        } else if (alphabet == 'F') {
            System.out.println("Finchley");
        } else {
            System.out.println("Invalid entry!");

        }

    }

}