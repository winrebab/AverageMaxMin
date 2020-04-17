import java.util.Scanner;

public class AverageMaxMin {
    public static void main(String args[]) {

        /*Write a program to get 10 test scores from a user, save each score into an array, and find the highest score, lowest score, and compute the average.
                Output should look like:
        Enter a score (1/10): 95
        Enter a score (2/10): 90
        Enter a score (3/10): 83
        Enter a score (4/10): 78
        Enter a score (5/10): 91
        Enter a score (6/10): 100
        Enter a score (7/10): 89
        Enter a score (8/10): 51
        Enter a score (9/10): 82
        Enter a score (10/10): 79

        The highest score is 100.
        The lowest score is 51.
        The average score is 83.8.
                All the scores are [95, 90, 83, 78, 91, 100, 89, 51, 82, 79]

         */

        int [] scores = new int [10];
        double  sum = 0;
        double average=0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter a score " + "(" + (i+1) + "/10" + ")" + ": ");
            scores[i] = scanner.nextInt();
        }
        int  largest = scores[0];
        int   smallest = scores[0];
        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
            average =  sum / scores.length;

            if (scores[i] < smallest) {
                smallest = scores[i];
            }
            if (scores[i] > largest) {
                largest = scores[i];
            }
        }
            System.out.println("the highest score is:" + largest);
            System.out.println("The lowest score is is:" + smallest);
            System.out.println("The average score is:" + average);

        }

    }

