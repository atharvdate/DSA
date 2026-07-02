package recursion;

public class RemoveDuplicates {
    public static void remove(String s, int idx, StringBuilder newStr, boolean[] map){
        //base case
        if(idx == s.length()){
            System.out.println(newStr);
            return;
        }
        //work
        char currChar = s.charAt(idx);
        if(map[currChar-'a']) {
            remove(s, idx+1, newStr, map);
        }else {
            map[currChar-'a']=true;
            remove(s, idx+1, newStr.append(currChar), map);
        }
    }


    public static void main(String[] args){
        String s = "datastructures";
        remove(s, 0, new StringBuilder(), new boolean[26]);
    }
}
