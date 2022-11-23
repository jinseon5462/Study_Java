package chapter04_classEx01;
/*
날짜 : 2022/11/19 토요일
이름 : 이진선
내용 : 클래스와 객체 I, p.150
 */
public class DeskLampTest {
    public static void main(String[] args) {
        DeskLamp myLamp = new DeskLamp();

        myLamp.turnOn();
        System.out.println(myLamp);

        myLamp.turnOff();
        System.out.println(myLamp);
    }
}
