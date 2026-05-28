package arrays_2D;

public class SearchElementInSorted2DMatrix {
    public static boolean search(int[][] matrix, int target){
        int row = 0;
        int col = matrix[0].length-1;

        while(row<matrix.length && col>=0){
            if(target == matrix[row][col]){
                System.out.println("Key found at : ("+row+","+col+")");
                return true;
            }else if(target<matrix[row][col]){
                col--;
            }else{
                row++;
            }
        }
        System.out.print("Key now found !");
        return false;
    }

    public static void main(String[] args){
        int[][] matrix = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        int target = 30;

        //call method
        search(matrix, target);
    }
}
