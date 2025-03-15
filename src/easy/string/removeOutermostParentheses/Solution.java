package easy.string.removeOutermostParentheses;

public class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str = new StringBuilder();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if (x == '(') {
                if (count > 0) {
                    str.append(x);
                }
                count++;
            }else{
                count--;
                if(count>0){
                    str.append(x);
                }
            }
        }
        return  str.toString();
    }
}
