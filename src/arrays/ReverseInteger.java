package arrays;

public class ReverseInteger{
    public static int reverse(int x) {
        int rev =0; //reversed number

        while(x!=0){
            int digit = x%10;

            //overflow checking
            if(rev>Integer.MAX_VALUE/10 || rev<Integer.MIN_VALUE/10){
                return 0;
            }

            // curr reversed ele
            rev =rev*10+digit;
            x = x/10;

        }
        return rev;

    }

    public static void main(String[] args){
        int x= -123;

        //call
        System.out.println(reverse(x));
    }
}