
class Day3 {
    public static void main(String[] args) {
        // printList(nums);
        // printList(nums2);

        // printLine(nums);
        // printLine(nums2);

        // Creating arrays
        int[] nums = new int[4];
        int[] nums2 = {6, 3, 8, 3, 1, 0};
        //             0  1  2  3  4  5
        
        // Algorithms
        // Search
        System.out.println(hawaiianIndexOf(nums2, 3));
        System.out.println(hawaiianCount(nums2, 3));

        // Reduce
        System.out.println(hawaiianSum(nums2));
        System.out.println(hawaiianAverage(nums2));
        System.out.println(Math.round(hawaiianStandardDeviation(nums2)*1000)/1000.0);


    }

    public static void printList(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + ". " + arr[i]);
        }
    }
    public static void printLine(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    // Search Methods
    public static int hawaiianIndexOf(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static int hawaiianCount(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }

    // Reduce Methods
    public static int hawaiianSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    
    // calculate average of an array
    // requirement: use hawaiianSum()
    public static double hawaiianAverage(int[] arr) {
        // average = add them up      / number of items
        // average = hawaiianSum(arr) / arr.length
        return (double) hawaiianSum(arr) / arr.length;
    }

    public static double hawaiianStandardDeviation(int[] arr) {
        double mean = hawaiianAverage(arr);
        double numerator = 0.0;
        for (int i = 0; i < arr.length; i++) {
            numerator += Math.pow(arr[i] - mean, 2);
        }
        return Math.sqrt(numerator / arr.length);
    }

}