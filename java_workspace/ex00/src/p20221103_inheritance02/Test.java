package p20221103_inheritance02;

public class Test {
    public static void main(String[] args) {
        A[] a = new A[2];
        a[0] = new B();
        a[1] = new C();

        B b = (B)a[0];
        System.out.println(a[0].n);
        System.out.println(a[1].n);
        System.out.println(b.n);
    }
}