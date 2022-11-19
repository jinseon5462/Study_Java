package p20221103_inheritance02;

public class Trapezoid extends Square {
    int upperSide;

    public Trapezoid(int width, int upperSide,int height){
        this.width = width;
        this.height = height;
        this.upperSide = upperSide;
    }

    @Override
    int getArea(){
        return ((width + upperSide) * height / 2);
    }
}