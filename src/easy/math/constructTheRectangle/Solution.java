package easy.math.constructTheRectangle;

public class Solution {
    public int[] constructRectangle(int area) {
        int [] result=new int[2];
        int s1=(int)Math.sqrt(area);
        while(area%s1!=0){
            s1--;

        }

        int s2=area/s1;
        result[0]=s2;
        result[1]=s1;
        return result;
    }
}
