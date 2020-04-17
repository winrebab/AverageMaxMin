import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayIntializatio {
    public static void main(String[] args) {
        /*Declare, initalize and print  array of integers, Strings, characters, & booleans:

        5 numbers
        7 Strings
        5 characters
        2 booleans
        results like
        Numbers: [1, 21, 63, 4, 51]
        Strings: [Sunday, Monday, Tuesday, Wednesday, Thursday, Fridat, Saturday]
        Characters:[a, e, i, o, u]
        Booleans:[true, false]

         */
        int [] numbers = new int [] {1, 21, 63, 4, 51};
        char [] characters = new char [] {'a','e','i','o','u'};
        boolean [] booleans = new boolean[] {true, false};
        String [] strings = new String[] {"Sunday","Monday","Tuesday","Wednesday","Thursday","Fridat", "Saturday"};
        System.out.println("Numbers:" +Arrays.toString(numbers));
        System.out.println("Strings:" +Arrays.toString(strings));
        System.out.println("Characters:" +Arrays.toString(characters));
        System.out.println("Booleans:" +Arrays.toString(booleans));



    }
}
