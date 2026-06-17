package recursion;

public class IncreasingNumbers {
    public static void printReverse(int num){
        if(num==1){
            System.out.print(num+" ");
            return;
        }
        printReverse(num-1);
        System.out.print(num+" ");
    }


    public static void main(String[] args){
        int num = 10;
        printReverse(num);
    }
}
