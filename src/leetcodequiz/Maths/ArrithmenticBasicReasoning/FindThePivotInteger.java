package leetcodequiz.Maths.ArrithmenticBasicReasoning;

public class FindThePivotInteger{
    public static int pivotInteger(int n) {
        for(int i = 1; i <= n; i++) {
            int leftSum = 0;
            int rightSum = 0;
            for(int j = 1; j <= i; j++) {
                leftSum += j;
            }
            for(int j = i; j <= n; j++) {
                rightSum += j;
            }
            if(leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int n = 8;

        //call
        System.out.println(pivotInteger(n));
    }
}