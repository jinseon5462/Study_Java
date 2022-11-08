package p20221108_interface;

public interface RemoteControl {
    int n = 10; // 인터페이스의 멤버는 상수이다.
    public void turnOn();   // 가전제품의 전원을 켠다.
    public void turnOff();  // 가전제품의 전원을 끈다.



    // 인터페이스에도 완성된 메서드가 들어갈수있다.
    public default void printBrand(){
        System.out.println("리모트 컨트롤 가능한 제품입니다.");
    }
}