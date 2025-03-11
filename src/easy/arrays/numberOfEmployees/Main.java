package easy.arrays.numberOfEmployees;

public class Main {
    public static void main(String[] args) {
        int target=2;
        int [] hours={0,1,2,3,4};
        Solution solution=new Solution();
        System.out.println(solution.numberOfEmployeesWhoMetTarget(hours,target));
    }
}
