package p20221115_collection;

    //기본생성자 X
    //오버로딩 생성자...x,y를 매개변수로 받아 생성
    //toString()메소드 오버라이딩

import java.util.Vector;

class Point{
    private int x, y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return "(" + x + ", " + y + ")";
    }
}

public class PointVectorEx {
    public static void main(String[] args) {
        //Point 타입의 벡터를 생성하시오
        Vector<Point> v = new Vector<>();

        //3개의 Point객체를 삽입하시오. (2, 3), (-5, 20), (30, -8)
        v.add(new Point(2, 3));
        v.add(new Point(-5, 20));
        v.add(new Point(30, -8));


        //인덱스 1의 Point 객체를 삭제하시오.
        v.remove(1);

        //벡터에 있는 Point 객체를 모두 출력, 반복문 사용.

        /*
        for(int i = 0; i < v.size(); i++){
            System.out.println(v.get(i));
        }
         */

        for(Point point : v){
            System.out.println(point);
        }
    }
}
