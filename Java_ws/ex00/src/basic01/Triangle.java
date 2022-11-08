package basic01;

public class Triangle {
    int width;
    int height;

    public Triangle(int width, int vertical){
        this.width = width;
        this.height = vertical;
    }

    public double getArea(){
        return (width * height) / 2;
    }

    public void showInfo(){
        System.out.println("넓이 : " + getArea());
    }
}