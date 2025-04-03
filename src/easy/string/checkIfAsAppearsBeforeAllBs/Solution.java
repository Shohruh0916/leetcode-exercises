package easy.string.checkIfAsAppearsBeforeAllBs;

public class Solution {
    public boolean checkString(String s) {
        char a = 'a';
        char b = 'b';
        for (int i=0; i<s.length(); i++) {
            int indexi=0;
            if(s.charAt(i)==b){
                indexi=i;
                for(int j=indexi; j<s.length(); j++){
                    if(s.charAt(j)==a){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
