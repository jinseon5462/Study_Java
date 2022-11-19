package basic01;

public class SquareTest {
    public static void main(String[] args){
        Square[] squares = new Square[3];

        for(int i = 0; i < 3; i++){
            squares[i] = new Square(i + 2, i + 6);
            squares[i].getArea();
        }
        for(int j = 0; j < 3; j++){
            squares[j].showInfo();
        }
    }
}