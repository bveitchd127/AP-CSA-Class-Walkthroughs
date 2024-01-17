import java.util.Arrays;

public class Day2C {
    public static void main(String[] args) {
        // Arrays
        // Fixed in length

        // Two ways to create arrays
        // Option 1: Create an empty array
        //int[] scores = new int[5]; // [0,0,0,0,0]

        // Option 2: Intialize the array when declared
        //double[] grades = {89.3, 78.1, 84.9};

        // Common errors
        // Out of bounds errors
        // - negative indices are not valid
        // - indices equal or greater than the size 
        //   of the array are also not valid

        // nth to last element
        // int n = 2;
        // System.out.println(grades[grades.length-n]);

        // Looping through an array
        // Very similar to looping through a String
        // for (int i = 0; i < grades.length; i++) {
        //     System.out.println(grades[i]);
        // }

        // Common problems in CodeHS
        // int[] nums = {8,4,7};

        // System.out.println( Arrays.toString(nums) );

        // for (int i = 0; i < nums.length; i++) {
        //     System.out.println(nums[i]);
        // }

        // System.out.println();
        // nums[1] = 0;
        // nums[2] = 0;

        // for (int i = 0; i < nums.length; i++) {
        //     System.out.println(nums[i]);
        // }

        // {8,0,0}


        double[] finalGrades = new double[20];

        for (int i = 0; i < finalGrades.length; i++) {
            // 60 ≤ grade < 100
            
            finalGrades[i] = Math.round(100*(Math.random()*40 + 60))/100.0; 
        }

        System.out.println(Arrays.toString(finalGrades));

    }
}
