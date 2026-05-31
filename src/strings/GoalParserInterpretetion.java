package strings;

public class GoalParserInterpretetion {
    public static String parse(String command){
        StringBuilder ans = new StringBuilder();

        for(int i=0; i<command.length(); i++){
            if(command.charAt(i)=='G'){
                ans.append('G');
            }else if(command.charAt(i)=='(') {
                if (command.charAt(i + 1) == ')') {
                    ans.append('o');
                    i++;
                }else{
                    ans.append("al");
                    i += 3;
                }
            }
        }
        return ans.toString();
    }

    public static void main(String[] args){
        String command = "G()()()(al)";

        //call funtion here
        System.out.println(parse(command));
    }
}
