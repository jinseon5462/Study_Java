package basic01;

public class Circle {
    int radius;
    public Circle(int radius){
        this.radius = radius;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }
    public void showInfo(){
        System.out.println("넓이 : " + getArea());
    }
}