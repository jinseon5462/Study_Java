package p20221108_interface;

// 인터페이스 다중상속
public class FlyingCar1 implements Drivable, Flyable{
    @Override
    public void drive() {
        System.out.println("I'm driving");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }

    public static void main(String[] args) {
        FlyingCar1 obj = new FlyingCar1();
        obj.drive();
        obj.fly();
    }
}
