package p20221108_interface;

public class Radio implements RemoteControl{
    boolean on;

    @Override
    public void turnOn() {
        on = true;
        System.out.println("라디오가 켜졌습니다.");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("라디오가 꺼졌습니다.");
    }

    @Override
    public void printBrand() {
        System.out.println("리모트컨트롤이 가능한 라디오입니다.");
    }
}