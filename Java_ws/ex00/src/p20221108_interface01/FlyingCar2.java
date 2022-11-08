package p20221108_interface01;

class Car {
    int speed;
    String color;

    void setSpeed(int speed) {
        this.speed = speed;
    }

    void setColor(String color) {
        this.color = color;
    }
}

public class FlyingCar2 extends Car implements Flyable{

    public static void main(String[] args) {
        FlyingCar2 c = new FlyingCar2();
        c.setSpeed(300);

        c.fly();
    }

    @Override
    public void fly(){
        System.out.println("I'm flying " + speed);
    }
}
