package p20221103_inheritance02;

public class SquareTest {
    public static void main(String[] args) {
        Square[] s = new Square[3];

        for(int i = 0; i < s.length; i++){
            if(i == 0){
                s[i] = new JSquare(10, 5);
            }else if(i == 1){
                s[i] = new Rectangle(3, 2);
            }else{
                s[i] = new Trapezoid(6, 4, 3);
            }
        }

        Trapezoid t = (Trapezoid) s[2];

        for(int i = 0; i < s.length; i++){
            if(s[i] instanceof Trapezoid) {
                System.out.println("넓이 : " + t.getArea());
                System.out.println("밑변 : " + t.width);
                System.out.println("높이 : " + t.height);
                System.out.println("윗변 : " + t.upperSide);
            }else{
                System.out.println("넓이 : " + s[i].getArea());
                System.out.println("밑변 : " + s[i].width);
                System.out.println("높이 : " + s[i].height);
                System.out.println();
            }
        }
    }
}