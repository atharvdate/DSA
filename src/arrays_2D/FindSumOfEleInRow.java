package arrays_2D;

public class FindSumOfEleInRow {
    public static int calculate(int[][] matrix){
        int sum=0;

        for(int col=0; col<matrix[1].length; col++){
            sum+=matrix[1][col];
        }
        return sum;
    }

    public static void main(String[] args){
        int[][] matrix ={
                {1,4,9},
                {11,4,3},
                {2,2,3}
        };

        //call fun here
        System.out.println("Sum of ele in second row is : "+calculate(matrix));
    }
}
