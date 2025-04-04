package easy.math.countSquareSumTriples;

public class Solution {
    public int countTriples(int n) {
        int count=0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                for(int k=1; k<=n; k++){
                    if(k==Math.sqrt(Math.pow(i,2)+Math.pow(j,2))){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
