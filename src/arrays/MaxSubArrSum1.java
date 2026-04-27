package arrays;
public class MaxSubArrSum1 {
    public static void MaxSubArr(int[] arr){
//        Variable Declaration
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i< arr.length; i++){
            int start = i;
            for(int j=i; j<arr.length; j++){
                int end = j;
                int currSum =0;
                for(int k = start; k<=end; k++){
                    currSum += arr[k];
                }
                System.out.println("Curr sum = "+currSum);
                if(currSum>maxSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("\n\n Max Sum is = "+ maxSum);
    }


    public static void main(String[] args){
        int[] arr = {1,-2,6,-1,3};

        //Call function
        MaxSubArr(arr);
    }
}