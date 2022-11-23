package chapter04_classEx03;
class Car {
    String color;
    int speed;
    int gear;

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", speed=" + speed +
                ", gear=" + gear +
                '}';
    }

    void changeGear(int gear){
        this.gear = gear;
    }

    void speedUp(){
        speed += 10;
    }

    void speedDown(){
        speed -= 10;
    }
}

public class CarTest {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.changeGear(1);
        myCar.speedUp();
        System.out.println(myCar);
    }
}
