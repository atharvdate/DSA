package recursion;

public class FriendsPairing {
    public static int pair(int n){
        //base case
        if(n==1 || n==2){
            return n;
        }
        //recursion work
        int fnm1 = pair(n-1);

        int fnm2 = pair(n-2);
        int pairWay = (n-1) * fnm2;

        int totalWays = fnm1 + pairWay;
        return totalWays;
    }

    public static void main(String[] args){
        int n= 3;
        System.out.println(pair(n));
    }
}
