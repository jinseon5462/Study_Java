package p20221108_interface;

public class Television implements AdvancedRemoteControl{
    boolean on;

    @Override
    public void turnOn() {
        on = true;
        System.out.println("TV가 켜졌습니다.");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("TV가 꺼졌습니다.");
    }

    @Override
    public void volumeUp() {

    }

    @Override
    public void volumeDown() {

    }
}
