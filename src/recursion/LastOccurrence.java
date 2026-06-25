package recursion;

public class LastOccurrence {
    public static int recurseFind(int[] arr, int key, int i){
        if(i<0){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return recurseFind(arr, key, i-1);
    }

    public static void main(String[] args){
        int[] arr = {2,5,6,3,1,7,5,5,8};
        int key = 5;
        int i = arr.length-1;

        System.out.println(recurseFind(arr, key, i));
    }
}
