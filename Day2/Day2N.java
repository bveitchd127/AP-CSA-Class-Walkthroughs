public class Day2N {
    public static void main(String[] args) {
        // Creating arrays
        int[] scores = new int[5];
        double[] grades = new double[10];

        int[] idNumbers = {827, 958, 918};

        // Modifying arrays
        scores[3] = 8;
        grades[2] = 9.4;
        idNumbers[0] = 713;

        // Printing arrays
        System.out.println("My id number is: " + idNumbers[1]);


        // Example CodeHS question
        // Create an array of your top three friends
        // Create another array of their favorite numbers
        String[] friends = {"John", "Sarah", "Justin", "Eleanor"};
        int[] numbers =    {8,      14,      3,        9};

        for (int i = 0; i < friends.length; i++) {
            System.out.println(friends[i] + "'s favorite number is " + numbers[i] + ".");
        }

        numbers[2] = 17;
        System.out.println("");

        for (int i = 0; i < friends.length; i++) {
            System.out.println(friends[i] + "'s favorite number is " + numbers[i] + ".");
        }
        



    }
}
