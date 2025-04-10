package easy.math.countLargestGroup;

public class Solution {
    public int countLargestGroup(int n) {
        int [] result=new int[37];
        for(int i=1; i<=n; i++){
            int x=i;
            int sum=0;
            while(x!=0){
                int a=x%10;
                sum+=a;
                x=x/10;
            }
            result[sum]++;
        }
        int max=0;
        for(int c: result){
            if(c>max){
                max=c;
            }
        }
        int count=0;
        for(int c: result){
            if(c==max){
                count++;
            }
        }
        return count;
    }
}
