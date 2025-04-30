package easy.arrays.widestVerticalAreaBetween;

import java.util.Arrays;

public class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int [] x=new int[points.length];
        for(int i=0; i<points.length; i++){
            x[i]=points[i][0];
        }
        Arrays.sort(x);
        int max1=0;
        for(int i=1; i<x.length; i++){
            int x1=x[i]-x[i-1];
            max1=Math.max(max1,x1);
        }
        return max1;
    }
}
