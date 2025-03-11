package easy.arrays.truncateSentence;

public class Solution {
    public String truncateSentence(String s, int k) {
        String [] a=s.split(" ");
        StringBuilder str=new StringBuilder();
        for(int i=0; i<k; i++){
            str.append(a[i]);
            if(i<k-1){
                str.append(" ");
            }
        }
        return str.toString();
    }
}
