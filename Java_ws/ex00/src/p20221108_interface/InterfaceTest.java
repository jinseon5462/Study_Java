package p20221108_interface;
/*
추상클래스는 멤버를 가질수 있다.

 */
public class InterfaceTest {
    public static void main(String[] args) {
        //RemoteControl rc = new RemoteControl();  // 객체생성 불가
        Television tv = new Television();
        tv.turnOn();
        tv.turnOff();
        System.out.println(tv.n);
        //tv.n = 20;

        Radio r = new Radio();
        System.out.println(r.n);
        //p.n = 30;

        RemoteControl r2 = new Radio();
        System.out.println(r2.n);
        r2.printBrand();
        r.printBrand();
    }
}
