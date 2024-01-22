package Unit6.Day4;

import java.util.Arrays;

public class Day4 {
    public static void main(String[] args) {

        int[] nums = {8,3,2,1,6,5};

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        // Enhanced For loop
        // Advantages:
        // - Easy to type
        // - Easy to read

        // Disadvantages:
        // - No way to access indices
        // - No way to modify the bounds or steps of the loop
        // - No way to modify/write to array

        // If you're thinking of using an enhanced for loop,
        // make sure the disadvantages of the enhanced for loop
        // won't come into play.

        // Enhanced For loop for ints
        // Using enhanced for loop to calculate sum
        int sum = 0;
        for (int num: nums) {
            sum += num;
        }
        System.out.println(sum);
        
        // Enhanced For loop for doubles
        double[] scores = {64.2, 96.4, 57.2, 81.5};
        for (double score: scores) {
            System.out.println(score);
        }

        // Enhanced For loop for Strings
        String[] names = {"Jimmy", "Jimbo", "Jimothy", "Jimothew"};
        for (String name: names) {
            System.out.println(name);
        }
    
    }

    
}
