package strings;

public class LengthOfLastWord{
    public static int calculate(String s){
        int end = s.length()-1;
        int count = 0;

        while(end>=0 && s.charAt(end)==' '){
            end--;
        }
         while(end>=0 && s.charAt(end)!=' '){
             count++;
             end--;
         }
         return count;
    }


    public static void main(String[] args){
        String s = "  fyl me   to the moon    ";

        //call function
        System.out.println("Length of last word is : "+calculate(s));
    }
}
