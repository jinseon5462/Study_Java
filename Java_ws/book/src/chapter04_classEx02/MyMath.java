package chapter04_classEx02;
/*
날짜 : 2022/11/19 토요일
이름 : 이진선
내용 : 클래스와 객체 I, p.154
 */
public class MyMath {
    int add(int x, int y){
        return x + y;
    }

    int add(int x, int y, int z){
        return x + y + z;
    }

    int add(int x, int y, int z, int w){
        return x + y + z + w;
    }

    public static void main(String[] args) {
        MyMath obj = new MyMath();

        System.out.println(obj.add(10, 20) + " ");
        System.out.println(obj.add(10, 20, 30) + " ");
        System.out.println(obj.add(10, 20, 30, 40) + " ");
    }
}
