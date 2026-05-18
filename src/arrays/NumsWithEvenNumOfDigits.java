package arrays;

public class NumsWithEvenNumOfDigits {
    public static int countDigits(int[] nums){
        int count =0;
        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            int digit = 0;

            while(num>0){
                num/=10;
                digit++;
            }
            if(digit%2==0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        int[] nums = {12,345,2,6,7896};

        //call fun
        System.out.print(countDigits(nums));
    }
}
