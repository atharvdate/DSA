package arrays_2D;

public class CountOccurence {
    public static int count(int[][] matrix, int k){
        int ans = 0;

        for(int row=0; row< matrix.length; row++){
            for(int col=0; col<matrix[0].length; col++){
                if(k==matrix[row][col]){
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(){
        int[][] matrix = {
                {1,3,3,4},
                {7,3,4,2},
                {8,5,7,2},
                {8,9,5,7}
        };

        int k = 7;

        //call function
        System.out.println(count(matrix, k));
    }
}
