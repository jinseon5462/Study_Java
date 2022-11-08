package p20221108_interface01;

public class Bicycle {
    boolean on;

    public void turnOn() {
        on = true;
        System.out.println("라이트가 켜졌습니다.");
    }

    public void turnOff() {
        on = false;
        System.out.println("라이트가 꺼졌습니다.");
    }
}
