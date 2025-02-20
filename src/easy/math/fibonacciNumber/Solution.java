package easy.math.fibonacciNumber;

public class Solution {
    public int fib(int n) {
        if(n<=1){
            return n;
        }
        int fib0=0,fib1=1,f=0;
        for(int i=2;i<=n;i++){
            f=fib0+fib1;
            fib0=fib1;
            fib1=f;
        }
        return f;
    }
}
