package arrays_2D;

public class RichestCustomerWealth {
    public static int calculate(int[][] accounts){
        int rich = 0;

        for(int row=0; row<accounts.length; row++){
            int wealth =0;
            for(int col=0; col< accounts[0].length; col++){
                wealth += accounts[row][col];
            }
            if(wealth>rich){
                rich = wealth;
            }
        }
        return rich;
    }


    public static void main(String[] args){
        int[][] accounts = {
                {1,2,3,4,5},
                {2,3,4,9,1},
                {6,7,2,1,4}
        };

        //call the fun
        System.out.println(calculate(accounts));
    }
}
