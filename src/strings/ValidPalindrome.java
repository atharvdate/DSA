package strings;

public class ValidPalindrome {
    public static boolean palindrome(String s){
        //convert 's' to lowercase
        s = s.toLowerCase();

        //create a empty mutable string
        StringBuilder cleaned = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            //only letters/digits are allowed to store
            if(Character.isLetterOrDigit(ch)){
                cleaned.append(ch);
            }
        }

        //fresh cleaned immutable string for better readability
        String str = cleaned.toString();

        //for empty string
        if(str.length()==0){
            return true;
        }
        int n = str.length()-1;
        for(int i=0; i<=n/2; i++){
            if(str.charAt(i) != str.charAt(n-i)){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";

        //call function here
        System.out.println(palindrome(s));
    }
}
