package basic01;

public class CircleTest {
    public static void main(String[] args){
        /*
        Circle c1 = new Circle();
        c1.radius = 6;

        System.out.printf("%.2f", c1.getArea());
         */

        Circle[] circles = new Circle[3];

        for(int i = 0; i < circles.length; i++){
            circles[i] = new Circle(i + 5);
            circles[i].getArea();
        }

        for(int i = 0; i < circles.length; i++){
            circles[i].showInfo();
        }
    }
}