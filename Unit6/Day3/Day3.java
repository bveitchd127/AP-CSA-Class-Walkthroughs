
class Day3 {
    public static void main(String[] args) {
        // Creating arrays
        int[] nums1 = new int[4];
        int[] nums2 = {4,8,3,1,7 ,11, 9};
        //             0 1 2 3 4

        for (int i = 0; i < (nums2.length); i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println("");
        System.out.println(  find(nums2, 11)  );

        System.out.println(  mySum(nums2)      );
        System.out.println(  myAverage(nums2)  );

        
    }

    // Search algorithm for Arrays
    // Behaves like indexOf()
    public static int find(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Reduce Algorithms
    // Takes an array and evaluates it to a single value

    // Sum for an array
    public static int mySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // Average for an array
    // requirement: must use mySum
    public static double myAverage(int[] arr) {
        // sum / number of elements
        return (double) mySum(arr) / arr.length;
    }
}