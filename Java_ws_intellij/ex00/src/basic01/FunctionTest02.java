package basic01;

public class FunctionTest02 {
    public static int add(int n1, int n2){
        int result = n1 + n2;
        return result;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int result = add(a, b);
        System.out.println(result);
    }
}