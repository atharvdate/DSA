package arrays_2D;

public class TransposeTheMatrix {
    public static void transpose(int[][] matrix){
        int[][] ans = new int[matrix[0].length][matrix.length];

        for(int row=0; row< matrix.length; row++){
            for(int col=0; col< matrix[0].length; col++){
                ans[col][row] = matrix[row][col];
            }
        }
        for(int row=0; row< ans.length; row++){
            for(int col=0; col< ans[0].length; col++){
                System.out.print(ans[row][col]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8}
        };

        //call functions here
        transpose(matrix);
    }
}
