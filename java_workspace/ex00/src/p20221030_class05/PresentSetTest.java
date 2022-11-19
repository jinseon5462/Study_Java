package p20221030_class05;

public class PresentSetTest {
    public static void main(String[] args){
        Product p1 = new Product("밤양갱", 3000);
        Product p2 = new Product("팥양갱", 2500);
        Product p3 = new Product("백양갱", 3200);

        PresentSet g1 = new PresentSet(p1, p2, p3);

        System.out.println("선물박스1 총금액 : " + g1.getPrice());

        Product p4 = new Product("반지", 5000);
        Product p5 = new Product("목걸이", 10000);
        Product p6 = new Product("귀걸이", 7000);

        PresentSet g2 = new PresentSet(p4, p5, p6);

        System.out.println("선물박스2 총금액 : " + g2.getPrice());
    }
}