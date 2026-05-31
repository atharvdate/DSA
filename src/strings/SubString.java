package strings;

public class SubString {
    public static String print(String s, int si, int ei){
        String subStr="";

        for(int i=si; i<=ei; i++){
            subStr += s.charAt(i);
        }
        return subStr;
    }

    public static void main(String[] args){
        String s = "Hello World";

        int si = 3;
        int ei = 6;
        //call fun here
        System.out.println(print(s,si,ei));
    }
}
