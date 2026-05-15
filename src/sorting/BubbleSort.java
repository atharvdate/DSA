//this program is modular, as u can see throughout the program
package sorting;

public class BubbleSort {

    public static void sort(int[] nums){
        for(int turn=0; turn< nums.length-1; turn++){
            boolean swapped = false;
            for(int j=0; j<=nums.length-2-turn; j++){
                if(nums[j]>nums[j+1]){
                    // swap them
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;

                    swapped =true;
                }
            }
            //if no swapping happened, that means our array was already sorted
            if(!swapped){
                break;
            }
        }
    }
    //lets print our sorted array here using new fresh method
    public static void printSort(int[] nums){
        for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }

    public static void main(String[] args){
        int[] nums = {3,2,5,6,9,8,7,1,4};

        sort(nums);
        printSort(nums);
    }
}