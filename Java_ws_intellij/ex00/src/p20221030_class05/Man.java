package p20221030_class05;

public class Man {
    String name;
    int money;
    Product present;

    public Man(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void buyProduct(Product p) {
        money = money - p.price;
        present = p;
    }

    public void giveProduct(Man who) {
        who.takeProduct(present);
        present = null;
    }

    private void takeProduct(Product present) {
        this.present = present;
    }

    public void showInfo() {
        System.out.println("이름 : " + name);
    }
}