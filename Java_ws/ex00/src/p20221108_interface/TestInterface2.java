package p20221108_interface;

class Shape {
    protected int x, y;
}

interface Drawable {
    void draw();
}

class Circle extends Shape implements Drawable {
    int radius;

    @Override
    public void draw() {
        x = 1; y = 2;
        System.out.println("Circle Draw at (" + x + "," + y + ")");
    }
}
public class TestInterface2 {
    public static void main(String[] args) {
        Drawable obj = new Circle();
        obj.draw();

    }
}
