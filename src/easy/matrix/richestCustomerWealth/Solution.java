package easy.matrix.richestCustomerWealth;

public class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<accounts.length; i++){
            for(int j=0; j<accounts[i].length; j++){
                sum+=accounts[i][j];
            }
           if(max<sum){
               max=sum;
           }
           sum=0;
        }
        return  max;
    }
}
