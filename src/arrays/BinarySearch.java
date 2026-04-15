package arrays;

public class BinarySearch {
    public static int binarySearch(int[] numbers, int key){
        int start = 0;
        int end = numbers.length-1;          // declared start & end here

        while(start<=end){
            int mid = (start+end)/2;         // declared mid here

            // comparison
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]>key){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;                             // if ele not exist in array
    }


    public static void main(String[] args){
        int[] numbers = {2,4,6,8,10,12,14};            // input array
        int key = 18;                                  // the key to search

        //result of binary search
        System.out.println("Key's Index is : "+binarySearch(numbers, key));
    }
}



























