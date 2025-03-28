package easy.string.determineIfStringHalvesAreAilke;

public class Solution {
    public boolean halvesAreAlike(String s) {
        int count1=0,count2=0;
        for(int i=0; i<s.length()/2; i++){
            char a1=s.charAt(i);
            if(a1=='a'|| a1=='i'|| a1=='e' || a1=='o' || a1=='u' || a1=='A'|| a1=='I'|| a1=='E' || a1=='O' || a1=='U'){
                count1++;
            }
        }
        for(int i=s.length()/2; i<s.length(); i++){
            char a2=s.charAt(i);
            if(a2=='a'|| a2=='i'|| a2=='e' || a2=='o' || a2=='u' || a2=='A'|| a2=='I'|| a2=='E' || a2=='O' || a2=='U'){
                count2++;
            }
        }
        return count1==count2;
    }
}
