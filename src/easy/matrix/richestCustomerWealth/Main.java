package easy.matrix.richestCustomerWealth;

public class Main {
    public static void main(String[] args) {
        int [][] accounts={{1,2,3},{3,2,1}};
        Solution solution=new Solution();
        System.out.println(solution.maximumWealth(accounts));
    }
}
