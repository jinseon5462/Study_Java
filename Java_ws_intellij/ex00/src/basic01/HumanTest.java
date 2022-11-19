package basic01;

public class HumanTest {
    public static void main(String[] args){
        Human h1 = new Human("James", "미국", 'M');
        System.out.println(h1.getCount());
        Human h2 = new Human("이진선", "대한민국", 'M');
        System.out.println(h2.getCount());
        Human h3 = new Human("황정민", "수리남", 'M');
        System.out.println(h3.getCount());
        Human h4 = new Human("이순신", "대한민국", 'M');
        System.out.println(h4.getCount());
        Human h5 = new Human("하정우", "대한민국", 'M');
        System.out.println(h5.getCount());

        h1.showInfo();
        h2.showInfo();
        h3.showInfo();
        h4.showInfo();
        h5.showInfo();
    }
}