package chapter04_classEx01;
/*
날짜 : 2022/11/19 토요일
이름 : 이진선
내용 : 클래스와 객체 I, p.147
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle obj;
        obj = new Circle();
        obj.radius = 100;
        obj.color = "blue";
        double area = obj.getArea();
        System.out.println("원의 면적 : " + area);
    }
}
