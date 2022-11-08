package p20221030_class05;

public class ManToMan {
    public static void main(String[] args) {
        Man m1 = new Man("철수", 20000);

        Man m2 = new Man("영희", 30000);

        Product p1 = new Product("반지", 5000);

        m1.buyProduct(p1);
        m1.giveProduct(m2);

        System.out.println(m1.name + "가 가진돈은 " + m1.money + "원이고, ");
        System.out.println(m1.name + "가 가지고 있는 물건은 " + m1.present + "입니다.");
        System.out.println(m2.name + "가 가진돈은 " + m2.money + "원이고");
        System.out.println(m2.name + "가 받은 선물은 " + m2.present.name + "입니다.");
    }
}