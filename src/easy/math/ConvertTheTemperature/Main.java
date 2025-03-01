package easy.math.ConvertTheTemperature;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double celsius=36.50;
        Solution solution=new Solution();
        System.out.println(Arrays.toString(solution.convertTemperature(celsius)));
    }
}
