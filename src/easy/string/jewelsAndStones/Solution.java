package easy.string.jewelsAndStones;

public class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int s=0;
        for(int i=0; i<stones.length(); i++){
            char s1=stones.charAt(i);
            for(int j=0; j<jewels.length(); j++){
                char s2=jewels.charAt(j);
                if(s1==s2){
                    s++;
                }
            }
        }
        return s;
    }
}
