package java_homework_week03;

/**
 * 18. Write a Java program to sum values of an array.
 */

public class P18SumOfArray {

    public static void main(String[] args) {

        int [] number = {
                20,35,632,129,459,126,223,556,359,956,842};
        int sum = 0;

        for (int i : number) {
            sum =   sum + i;
        }

        System.out.println("Sum of array is : " + sum);
    }

}
