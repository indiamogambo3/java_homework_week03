package java_homework_week03;

/**
 * 20. Write a Java program to test if an array contains a specific value.
 */

public class P20ArraySpecificValue {


    public static void main(String[] args) {
        int[] my_array1 = {
                1788, 2569, 4589, 1256, 598745, 2365, 788, 256987, 12698, 25,};

        System.out.println(specific(my_array1, 4589));
        System.out.println(specific(my_array1, 54056));
    }

    public static boolean specific(int[] array, int item) {
        for (int n : array) {
            if (item == n) {
                return true;
            }

        }
        return false;
    }

}
