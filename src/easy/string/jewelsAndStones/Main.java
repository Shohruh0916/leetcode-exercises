package easy.string.jewelsAndStones;

public class Main {
    public static void main(String[] args) {
        String jewels="aA";
        String stones="aAAbbbb";
        Solution solution=new Solution();
        System.out.println(solution.numJewelsInStones(jewels,stones));
    }
}
