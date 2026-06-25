package recursion;

public class PowerNOptimized {
    public static int powerOpt(int x, int n){
        if(n==0){
            return 1;
        }

        int halfPower = powerOpt(x, n/2);
        int halfPowerSq = halfPower * halfPower;
        if(n%2 != 0){
            return x * halfPowerSq;
        }
        return halfPowerSq;
    }


    public static void main(String[] args){
        System.out.println(powerOpt(2, 4));
    }
}
