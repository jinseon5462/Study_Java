package chapter04_classEx02;
/*
날짜 : 2022/11/19 토요일
이름 : 이진선
내용 : 생성자와 메소드 오버로딩, p.156
 */
class Pizza {

    String color;
    int size;
    String type;

    public Pizza(){

        size = 12;
        type = "슈퍼슈프림";
    }

    public Pizza(int size, String type){
        color = "blue";
        this.size = size;
        this.type = type;
    }
}

public class PizzaTest {
    public static void main(String[] args) {
        Pizza obj1 = new Pizza();
        System.out.println("(" + obj1.type + ", " + obj1.size + ")");

        Pizza obj2 = new Pizza(24, "포테이토");
        System.out.println("(" + obj2.type + ", " + obj2.size + ")");
    }
}
