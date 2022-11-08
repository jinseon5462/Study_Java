package p20221103_inheritance01;

public class ATest {
    public static void main(String[] args) {
        ThisEx a = new ThisEx(10);
        ThisEx a2 = new ThisEx(13);

        System.out.println(a.N);
        System.out.println(a2.N);
    }
}