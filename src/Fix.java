public class Fix {
    public static void main(String[] args) {
            int[] numbers = {2, 29, 33, 4, 15, 62, 7, 81, 9, 10};

// Declare sum variable, assign it initial value of zero
            int sum = 0;
            for (int i = 0; i< numbers.length; i ++){
                sum +=i;
            }
        System.out.println("The sum of the numbers is " + sum);
////1.Create an array to hold the numbers 1-10.
        int [] numList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < numList.length; i++) {
            System.out.println(numList[i]);
        }

////2.Loop through that array and sum the numbers 1-10, then print that total to the screen.
        int [] numList1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int total = 0;
        for (int i = 0; i < numList1.length; i++) {

            total += i;

        }
        System.out.println("The total of the numbers is " + total);
    }

}


