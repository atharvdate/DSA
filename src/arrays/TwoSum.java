package arrays;
import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            // check which will be combine perfectly to find target value
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }


    public static void main(String[] args){
        int[] nums = {2,11,7,15};
        int target = 9;

        System.out.print(Arrays.toString(twoSum(nums, target)));
    }
}
