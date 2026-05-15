package arrays;
import java.util.Arrays;

class Solution {
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int[] ans = new int[n];

        //lets store sq in array from left side
        for(int i=n-1; i>=0; i--){
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            // place larger square at current index
            if(leftSquare>rightSquare){
                ans[i] = leftSquare;
                left++;
            }else{
                ans[i] = rightSquare;
                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int[] nums = {-4,-2,5,6,8};

        int[] result = sortedSquares(nums);
        System.out.println(Arrays.toString(result));

    }
}