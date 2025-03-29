package easy.string.minimumNumberOfChairs;

public class Solution {
    public int minimumChairs(String s) {
        int count=0,maxChair=0;
        for(int i=0; i<s.length(); i++){
            char s1=s.charAt(i);
            maxChair=Math.max(count,maxChair);
            if(s1=='E'){
                count++;
            }else if(s1=='L'){
                count--;
            }
        }
        return  maxChair;
    }
}
