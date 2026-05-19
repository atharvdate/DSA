package arrays;

public class MaxConsecutiveOnes {
    public static int streak(int[] nums){
        int currStreak = 0;
        int maxStreak = 0;

        for(int i=0; i< nums.length; i++){
            if(nums[i]==1){
                currStreak++;
                if(currStreak>maxStreak){
                    maxStreak = currStreak;
                }
            }else{
                currStreak = 0;
            }
        }
        return maxStreak;
    }


    public static void main(String[] args){
        int[] nums = {1,1,1,0,0,1,0,1,1,0,1,1,1,1,0,1};

        //call method
        System.out.print(streak(nums));
    }
}
