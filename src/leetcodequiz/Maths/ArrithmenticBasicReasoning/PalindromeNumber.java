package leetcodequiz.Maths.ArrithmenticBasicReasoning;

public class PalindromeNumber{
    public static boolean isPalindrome(int x) {
        if(x< 0) {
            return false;
        }
        int original =x;
        int reverse = 0;
        while(x != 0){
            int digit = x % 10;
            reverse =reverse * 10 + digit;
            x /=10;
        }
        return original == reverse;
    }

    public static void main(String[] args){
        int x = 12821;

        //call method
        System.out.println(isPalindrome(x));
    }
}
