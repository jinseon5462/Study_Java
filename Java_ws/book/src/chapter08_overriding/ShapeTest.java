package chapter08_overriding;

class Shape {
    public void draw(){
        System.out.println("Shape");
    }

}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle을 그립니다.");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle을 그립니다.");
    }
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Triangle을 그립니다.");
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Rectangle s = new Rectangle();
        s.draw();
    }
}

