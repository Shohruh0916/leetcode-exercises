package easy.math.maximumContainersOnAShip;

public class Main {
    public static void main(String[] args) {
        int n=1000,w=507,maxWeight=702858216;
        Solution solution=new Solution();
        System.out.println(solution.maxContainers(n,w,maxWeight));
    }
}
