package arrays;

// write a function
public class LargestNumber {
    public static int findLargest(int[] numbers){
        int largest = Integer.MIN_VALUE;  // declared (-infinity)
        for(int i=0; i<numbers.length; i++){
            if(largest<numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }

// call the function
    public static void main(String[] args){
        int[] numbers = {1,2,6,3,5};
        System.out.println("Largest number in given array is :"+findLargest(numbers));
    }
}