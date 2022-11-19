package basic01;

public class Square {
    int width;
    int height;

    public Square(int width, int height){
        this.width = width;
        this.height = height;
    }

    public int getArea(){
        return width * height;
    }
    public void showInfo(){
        System.out.println("넓이 : " + getArea());
    }
}