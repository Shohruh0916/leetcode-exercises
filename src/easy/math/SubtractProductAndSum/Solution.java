package easy.math.SubtractProductAndSum;

public class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0, k = 1;
        while (n != 0) {
            k *= n % 10;
            sum += n % 10;
            n = n / 10;
        }
        return k-sum;
    }
}
