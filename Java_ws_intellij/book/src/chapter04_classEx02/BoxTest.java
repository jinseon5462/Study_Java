package chapter04_classEx02;
/*
날짜 : 2022/11/19 토요일
이름 : 이진선
내용 : 기본 생성자, p.154
 */
class Box {
    int width, height, depth;
}

public class BoxTest {
    public static void main(String[] args) {
        Box b = new Box();
        System.out.println("상자의 크기 : (" + b.width + ", " + b.height + ", " + b.depth + ")");
    }
}
