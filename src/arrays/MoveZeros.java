package arrays;

public class MoveZeros {
    public static void indexing(int[] nums){
        //pointer to store next nonzero ele
        int index = 0;

        for(int i=0; i< nums.length; i++){
            if(nums[i]!=0){
                nums[index] = nums[i];
                index++;
            }
        }
        //store '0' in remaining indexes
        while(index< nums.length){
            nums[index] = 0;
            index++;
        }
    }
    public static void printArray(int[] nums){
        for(int i=0; i< nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    }


    public static void main(String[] args){
        int[] nums = {0,4,0,6,8,0,3,7};

        //call method
        indexing(nums);
        printArray(nums);
    }
}