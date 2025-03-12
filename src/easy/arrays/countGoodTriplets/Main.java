package easy.arrays.countGoodTriplets;

public class Main {
    public static void main(String[] args) {
        int a=7,b=2,c=3;
        int [] arr={3,0,1,1,9,7};
        Solution solution=new Solution();
        System.out.println(solution.countGoodTriplets(arr,a,b,c));
    }
}
