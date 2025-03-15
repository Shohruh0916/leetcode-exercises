package easy.string.goalParserInterpretation;

public class Main {
    public static void main(String[] args) {
        String command="G()(al)";
        Solution solution=new Solution();
        System.out.println(solution.interpret(command));
    }
}
