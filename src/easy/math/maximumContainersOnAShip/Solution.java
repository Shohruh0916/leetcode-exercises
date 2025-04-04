package easy.math.maximumContainersOnAShip;

public class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int a=n*n;
        int max=maxWeight/w;
        return Math.min(a,max);
    }
}
