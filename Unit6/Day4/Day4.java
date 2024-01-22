package Unit6.Day4;

public class Day4 {
    public static void main(String[] args) {

        int[] nums = {8,3,5,1,8,4,7};

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                //System.out.println(i);
            }
        }

        // Enhanced for loops
        int sum = 0;
        for (int n: nums) {
            sum += n;
        }
        //System.out.println((double) sum / nums.length);


        // Enhanced for loop (doubles)
        double[] grades = new double[20];

        // Writing to an array?
        // enhanced for loop cannot write!
        for (int i = 0; i < grades.length; i++) {
            grades[i] = Math.random()*100;
        }

        // Enhanced for loops great for reading array
        for (double g: grades) {
            System.out.println(g);
        }
        
    }
}
