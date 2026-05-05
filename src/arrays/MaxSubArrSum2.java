package arrays;

public class MaxSubArrSum2 {
    public static void prefArray(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int preFix[] = new int[arr.length];

        preFix[0]=arr[0];
        // calculate prefix
        for(int i=1; i< arr.length; i++){
            preFix[i] = preFix[i-1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                int currSum = start==0? preFix[end]: preFix[end]-preFix[start-1];

                if(maxSum<currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum is : "+maxSum);
    }

    public static void main(String[] args){
        int[] arr = {1,-2,6,-1,3};

        //CALL THE FUNCTION
        prefArray(arr);
    }
}