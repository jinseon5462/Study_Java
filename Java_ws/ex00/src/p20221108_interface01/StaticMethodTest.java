package p20221108_interface01;

interface MyInterface {

    static void print(String msg) {
        System.out.println(msg + " : 인터페이스의 정적 메소드 호출");
    }
}

class MyClass {
    static void print(String msg) {
        System.out.println(msg + " : 클래스의 정적 메소드 호출");
    }
}

public class StaticMethodTest {

    public static void main(String[] args) {
        MyInterface.print("Java 8");
        MyClass.print("Java 8");
    }
}
