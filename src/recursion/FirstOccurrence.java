package recursion;

public class FirstOccurrence {
    public static int recurseFind(int[] arr, int key, int i){
        if(i== arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return recurseFind(arr, key, i+1);
    }


    public static void main(String[] args){
        int[] arr = {8,3,4,9,5,2,4,5,6,9,1};
        int key = 5;
        System.out.println(recurseFind(arr, key, 0));
    }
}
