package chapter04_classEx03;

class A {
    private int a;
    int b;
    public int c;
}

public class Test {
    public static void main(String[] args) {

        A obj = new A();
        //obj.a = 10;   private으로 지정된 멤버는 다른클래스에서 접근불가
        obj.b = 20; //디폴트 멤버는 접근할 수 있음
        obj.c = 30; //공용 멤버는 접근할 수 있음
    }
}
