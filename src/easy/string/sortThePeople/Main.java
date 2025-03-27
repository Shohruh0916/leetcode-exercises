package easy.string.sortThePeople;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String [] names=new String[]{"Mary","John","Emma"};
        int [] heights=new int[]{180,165,170};
        Solution solution=new Solution();
        System.out.println(Arrays.toString(solution.sortPeople(names, heights)));
    }
}
