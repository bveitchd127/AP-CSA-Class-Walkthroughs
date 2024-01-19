import java.util.Arrays;

public class Day1 {
    public static void main(String[] args) {
        // It seems my original code from class was lost so here is a 
        // better version of what I went over :). Email me if you have
        // any questions on anything that pops up here.


        // Arrays
        // Store many values of the same type in a single variable.

        // Examples:
        //   Storing a list of grades as doubles
        //   Storing a list of ingredients as Strings

        // Two ways to create an array (kinda three...)
        // Option 1: Create an empty array
        int[] nums = new int[5]; // = {0, 0, 0, 0, 0}

        // Option 2: Create an array with predetermined 
        //           values at runtime*
        //                                 * just means that we type the values in the code
        double[] scores = {87.3, 89.1, 68.3};

        // Option 2.5: Create an array with predetermined 
        //             values without storing it in array

        // Why do we need option 2.5?
        // Immediately print an array
        System.out.println(new String[]{"This", "is", "weird"});

        // Pass in a newly created array to an object's constructor (or any method)
        Example example = new Example(new boolean[]{false, true, false, false});

        // Returning a new array in a method
        // Can't show it here but look at the method returnArray at the bottom!




        // Accessing and Modifying Elements
        // Arrays will keep the order of their elements which means 
        // we can access elements if we know where they are!

        // Similar to Strings, Arrays use indices starting at 0 to
        // define where elements are stored.

        // Let's create a new int array with some random values
        int[] values = {7, 2, 4, 6, 3, 1};
        //     Indices: 0  1  2  3  4  5

        // If we want to access the 6, we need to ask the values array
        // for it's value at index 3
        System.out.println( values[3] ); // prints 6

        // If we want to modify a value, we use the exact same syntax
        // and assign a value to it, like a variable.
        values[1] = 9; // values changes from {7, 2, 4, 6, 3, 1} to {7, 9, 4, 6, 3, 1}
        //                                        ^                     ^



        // Viewing array contents
        // Printing out an array is similar to printing out an object
        // that doesn't have a toString implemented specific to that object
        System.out.println(values); // Mine prints: "[I@6b95977"

        // The easiest way to view the contents of an array is to use Arrays.toString(arr).
        // Only downside is that you have to add "import java.util.Arrays;" to the 
        // top of our program similar to when we want to use Scanner.
        System.out.println(Arrays.toString(values)); // Prints: "[7, 9, 4, 6, 3, 1]"

        // Sometimes the formatting of the output isn't ideal for what we want.
        // This is where using loops to print out the elements exactly as we'd like
        // comes into play.
    }

    // I can create arrays using custom objects! Neat!
    public static Example[] returnArray() {
        return new Example[]{new Example(), new Example()};
    }
}