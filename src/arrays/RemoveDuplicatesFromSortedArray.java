package arrays;

public class RemoveDuplicatesFromSortedArray {
    public static int duplicates(int[] nums){
        int index = 0;

        for(int i=1; i<nums.length; i++){
            if(nums[index] != nums[i]){
                index++;
                nums[index] = nums[i];
            }
        }
        return index+1;
    }
    public static void printUniqueArray(int[] nums,int k){
        for(int i=0; i< k; i++){
            System.out.print(nums[i]+" ");
        }
    }

    public static void main(String[] args){
        int[] nums = {0,1,1,1,2,2,3,4,4,4};

        int k= duplicates(nums);
        System.out.println("K : "+k);
        printUniqueArray(nums,k);
    }
}
