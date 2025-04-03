package easy.string.checkIfWordEqualsSummationOfTwoWords;

public class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        String num1="",num2="",num3="";
        for (int i=0; i<firstWord.length(); i++) {
            num1+=(firstWord.charAt(i)-'a');
        }
        for(int i=0; i<secondWord.length(); i++){
            num2+=(secondWord.charAt(i)-'a');
        }
        for(int i=0; i<targetWord.length(); i++){
            num3+=(targetWord.charAt(i)-'a');
        }
        int sum=Integer.parseInt(num1)+Integer.parseInt(num2);
        return sum==Integer.parseInt(num3);
    }
}
