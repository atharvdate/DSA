package sorting;

import java.util.Arrays;

public class ArrayPartition {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0; //final ans
        for (int i = 0; i < nums.length; i = i + 2) {
            sum = sum + nums[i];
        }
        return sum;
    }


    public static void main(){
        int[] nums = {1,4,3,2};

        //call
        System.out.println("Maximum possible sum from all possible parings is :"+arrayPairSum(nums));
    }
}
