package easy.arrays.kidsWithTheGreatestNumberOfCandies;

public class Main {
    public static void main(String[] args) {
        int [] candies=new int[]{2,3,5,1,3};
        int extraCandies=3;
        Solution solution=new Solution();
        System.out.println(solution.kidsWithCandies(candies,extraCandies));
    }
}
