package easy.math.uglyNumber;

public class Solution {
    public boolean isUgly(int n) {
        int[] n1 = {2, 3, 5};
        if(n<=0) return false;
        for (int factor : n1) {
            while (n % factor == 0) {
                n /= factor;
            }
        }
        return n == 1;
    }
}
