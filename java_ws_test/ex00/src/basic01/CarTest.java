package basic01;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("15머 2034", "Yello", 140);
        car1.speedUp();

        Car car2 = new Car("11머 2234", "Red", 120);
        car2.speedUp();

        car1.showInfo();
        car2.showInfo();
        System.out.println("\n총 "+car2.getCount() + "대 생성");
    }
}