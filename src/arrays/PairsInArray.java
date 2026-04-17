package arrays;

public class PairsInArray {
    public static void printPairs(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {    // loop for current numbers
            int current = numbers[i];             //2,4,6,8,10
            for (int j = i + 1; j < numbers.length; j++) {    // loop for printing all numbers for pair except current number
                System.out.print("(" + current + "," + numbers[j] + ")");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};

        // call the function for printing the pairs from an array
        printPairs(numbers);
    }
}