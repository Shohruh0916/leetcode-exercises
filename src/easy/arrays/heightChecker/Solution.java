package easy.arrays.heightChecker;

import java.util.Arrays;

public class Solution {
    public int heightChecker(int[] heights) {
        int count=0;
        int[] a = new int[heights.length];
        int[] b = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            b[i] = heights[i];
        }
        Arrays.sort(heights);
        for (int i = 0; i < heights.length; i++) {
            a[i] = heights[i];
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                count++;
            }
        }
        return count;
    }
}
