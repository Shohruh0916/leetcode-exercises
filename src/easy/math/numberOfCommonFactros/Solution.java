package easy.math.numberOfCommonFactros;

public class Solution {
    public int commonFactors(int a, int b) {
        int s1=0;
        int max=a;
        if(max<b){
            max=b;
        }
        for(int i=1; i<=max; i++){
            if(a%i==0 && b%i==0){
                s1++;
            }
        }
        return  s1;
    }
}
