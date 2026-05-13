package arrays;


public class SearchInRoatatedSortedArray {
    public static int binarySearch(int[] arr, int target) {
        // declare start and end of the array
        int start = 0;
        int end = arr.length - 1;

        //run a loop for left sorted array and right sorted array
        while (start <= end) {
            int mid = start + (end - start) / 2; //find out the mid

            // if mid itself a target element
            if (arr[mid] == target) {
                return mid;
            }

            // if target is in left sorted array
            if (arr[start] <= arr[mid]) {
                if(arr[start]<=target && target<=arr[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }

            // if target is in right sorted array
            }else{
                if(arr[mid]<=target && target<=arr[end]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        // if target is not at all present in the array
        return -1;
    }

    public static void main(){
        int[] arr = {13,14,15,16,1,2,3,4,5,6,7,8,9,10,11,12};
        int target = 7;

        System.out.println(binarySearch(arr,target));
    }
}
