package strings;

import java.util.Arrays;

public class ValidAnagram {
    public static boolean anagram(String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length()==str2.length()){
            //convert
            char[] str1CharArray = str1.toCharArray();
            char[] str2CharArray = str2.toCharArray();

            //sort
            Arrays.sort(str1CharArray);
            Arrays.sort(str2CharArray);

            boolean result = Arrays.equals(str1CharArray, str2CharArray);
            if(result){
                System.out.print("Anagram :");
                return true;
            }else{
                System.out.print("Anagram : ");
                return false;
            }
        }else{
            System.out.print("Anagram : ");
            return false;
        }
    }

    public static void main(String[] args){
        String str1 = "cat";
        String str2 = "act";

        //call function here
        System.out.println(anagram(str1, str2));
    }
}
