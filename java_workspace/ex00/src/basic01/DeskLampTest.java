package basic01;

public class DeskLampTest {
    public static void main(String[] args) {
        DeskLamp myLamp = new DeskLamp(true);

        // 실행 결과 : 현재 상태는 켜짐
        myLamp.turnOn();
        System.out.println(myLamp.getStatus());

        // 실행 결과 : 현재 상태는 꺼짐
        myLamp.turnOff();
        System.out.println(myLamp.getStatus());


    }
}