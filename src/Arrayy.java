import java.util.Scanner;

public class Arrayy {
    public static void main(String[] args) {
        int[] numbers = {2, 29, 33, 4, 15, 62, 7, 81, 9, 10};

// Declare sum variable, assign it initial value of zero
        int total = 0;
        int sum = 0;

        for (int i = 1; i <= numbers.length; ++i) {
            // sum = sum + i;
            sum += i;
        }

        System.out.println("Sum = " + sum);

        int[] numList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < 10; i++) {

            System.out.println(numList);
        }

        for (int i = 0; i < 10; i++) {
            total += i;
        }
        System.out.println("The total of the numbers is " + total);
    }
}







