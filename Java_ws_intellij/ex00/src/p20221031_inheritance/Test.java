package p20221031_inheritance;

public class Test {
    public static void main(String[] args) {
        B b = new B();
        b.s = "Hello Mom!";
        b.n = 10;
        System.out.println(b.n);
        System.out.println(b.s);
        //System.out.println(b);
    }
}