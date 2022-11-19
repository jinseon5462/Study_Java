package p20221031_inheritance;

public class UnitTest {
    public static void main(String[] args) {
        Enermy com = new Enermy(100);
        MyUnit me = new MyUnit(100);
        MyUnit you = new MyUnit(100);

        me.attack(com);
        System.out.println("Com의 체력 : " + com.energy);

        me.attack(you);
        System.out.println("You의 체력 : " + you.energy);

        me.attack(com);
        System.out.println("Com의 체력 : " + com.energy);

        me.attack(you);
        System.out.println("You의 체력 : " + you.energy);

        me.attack(com);
        System.out.println("Com의 체력 : " + com.energy);

        me.attack(com);
        System.out.println("Com의 체력 : " + com.energy);
    }
}