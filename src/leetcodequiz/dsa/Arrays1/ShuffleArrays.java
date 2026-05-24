package leetcodequiz.dsa.Arrays1;
import java.util.Arrays;

public class ShuffleArrays {
    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        int index = 0;
        for(int i=0; i<n; i++){
            ans[index] = nums[i];
            ans[index+1] = nums[i+n];
            index +=2;
        }
        return ans;
    }

    public static void main(String[] ans){
        int[] nums = {1,2,3,4,4,3,2,1};
        int n = 4;

        //call
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }
}