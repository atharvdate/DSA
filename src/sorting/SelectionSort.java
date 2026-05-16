package sorting;

public class SelectionSort {
    public static void sort(int[] nums){
        for(int turn=0; turn< nums.length-1; turn++){
            //lets take current turn's position as min
            int minPos = turn;

            // lets check if which number is MINIMUM next to minPos
            for(int j=turn+1; j<nums.length; j++){
                if(nums[minPos]>nums[j]){
                    minPos = j;    // take it as minPosition
                }
            }
            //swap here
            int temp = nums[minPos];
            nums[minPos] = nums[turn];
            nums[turn] = temp;
        }
    }
    //print sorted array
    public static void printSort(int[] nums){
        for(int i=0; i< nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    }


    public static void main(String[] args){
        int[] nums = {2,5,1,6,9,3,7};

        //call methods
        sort(nums);
        printSort(nums);
    }
}