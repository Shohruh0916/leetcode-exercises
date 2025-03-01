package easy.math.ConvertTheTemperature;

public class Solution {
    public double[] convertTemperature(double celsius) {
        double t1=celsius+273.15;
        double t2=celsius*1.80+32.00;
        double [] array=new double[2];
        array[0]=t1; array[1]=t2;
        return array;
    }
}
