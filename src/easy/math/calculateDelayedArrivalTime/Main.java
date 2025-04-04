package easy.math.calculateDelayedArrivalTime;

public class Main {
    public static void main(String[] args) {
        int arrivalTime = 15;
        int delayedTime = 5;
        Solution solution=new Solution();
        System.out.println(solution.findDelayedArrivalTime(arrivalTime,delayedTime));
    }
}
