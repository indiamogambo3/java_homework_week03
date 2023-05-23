package java_homework_week03;

/**
 * 11. Write a java program to print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately.
 */

public class P11DivisibleBy3And5 {


    public static void main(String[] args) {
        System.out.println("Numbers divisible by 3 are: ");
        division3();
        System.out.println("         ");
        System.out.println("Numbers divisible by 5 are: ");
        division5();

    }
    public static void division3() {

        for (int a = 1; a < 100; a++)
            if (a % 3 == 0)
                System.out.print(a + ", ");
    }
    public static void division5() {

        for (int a = 1; a < 100; a++)
            if (a % 5 == 0)
                System.out.print(a + " , ");
    }

}
