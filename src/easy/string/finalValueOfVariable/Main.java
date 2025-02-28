package easy.string.finalValueOfVariable;

public class Main {
    public static void main(String[] args) {
        String[] operations;
        operations=new String[]{"--x","x++","x++"};
        Soluiton soluiton=new Soluiton();
        System.out.println(soluiton.finalValueAfterOperations(operations));
    }
}
