package java_homework_week03;

/**
 * 7. Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 *  Sales amount >= 50,000 35%
 *  Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */

import java.util.Scanner;

public class P7SalesCommission {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Seller Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Seller ID:");
        int sellerId = scanner.nextInt();
        System.out.println("Enter Sales Amount:");
        int salesAmount = scanner.nextInt();
        System.out.println("Enter Basic Salary: ");
        int basicSalary = scanner.nextInt();
        scanner.close();

        P7SalesCommission salesCommission = new P7SalesCommission();
        int grossSalary = salesCommission.calculateCommission(salesAmount);

    }

    public int calculateCommission(int salesAmount) {
        int commission;
        if (salesAmount >= 50000) {
            commission = (salesAmount * 35) / 100;
            System.out.println("Sales Commission is " + commission);
        } else if (salesAmount >= 30000) {
            commission = (salesAmount * 20) / 100;
            System.out.println("Sales Commission is " + commission);
        } else if (salesAmount >= 20000) {
            commission = (salesAmount * 10) / 100;
            System.out.println("Sales Commission is " + commission);
        } else if (salesAmount >= 10000) {
            commission = (salesAmount * 5) / 100;
            System.out.println("Sales Commission is " + commission);
        } else {
            commission = (salesAmount * 2) / 100;
            System.out.println("Sales Commission is " + commission);
        }
        return commission;

    }

}






















