package easy.math.waterBottles;

public class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int a=numBottles;
        int b=numBottles;
        while(a>=numExchange){
            int x=a/numExchange;
            b+=x;
            a=a%numExchange+x;
        }
        return b;
    }
}
