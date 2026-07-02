package recursion;

public class FriendsPairing2 {
    public static int pair(int n){
        //base case
        if(n==1 || n==2){
            return n;
        }
        //recursion
        return pair(n-1) + (n-1)*pair(n-2);
    }

    public static void main(String[] args){
        int n = 3;
        System.out.print(pair(n));
    }
}
