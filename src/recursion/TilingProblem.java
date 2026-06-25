package recursion;

public class TilingProblem {
    public static int ways(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fnm1 = ways(n-1);
        int fnm2 = ways(n-2);
        int totWays = fnm1 + fnm2;

        return totWays;
    }

    public static void main(String[] args){
        System.out.println(ways(4));
    }
}
