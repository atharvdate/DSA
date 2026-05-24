package leetcodequiz.Maths.ArrithmenticBasicReasoning;
import java.util.Arrays;

public class CanMakeArithmeticProgressionFromSequence{
    public static boolean ArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff =arr[1] - arr[0];
        for(int i= 2; i<arr.length; i++) {
            if(arr[i] - arr[i - 1] != diff) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args){
        int[] arr = {3,5,1};

        //call method
        System.out.println(ArithmeticProgression(arr));
    }
}
