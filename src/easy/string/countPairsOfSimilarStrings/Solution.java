package easy.string.countPairsOfSimilarStrings;

public class Solution {
    public int similarPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                boolean[] letters1=new boolean[26];
                boolean[] letters2=new boolean[26];
                for(char c:words[i].toCharArray()){
                    letters1[c-'a']=true;
                }
                for(char c:words[j].toCharArray()){
                    letters2[c-'a']=true;
                }
                boolean similar=true;
                for(int k=0;k<26;k++){
                    if(letters1[k]!=letters2[k]){
                        similar=false;
                        break;
                    }
                }
                if(similar){
                    count++;
                }
            }
        }
        return count;
    }
}
