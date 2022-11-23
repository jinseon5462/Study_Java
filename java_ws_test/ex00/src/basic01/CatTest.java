package basic01;

public class CatTest {
    public static void main(String[] args){


        Cat cat1 = new Cat();
        cat1.setName("야옹이");
        cat1.setAge(24);
        System.out.println("이름 : " + cat1.getName());
        System.out.println("나이 : " + cat1.getAge());

        Cat cat2 = new Cat();
        cat2.setName("떼껄룩");
        cat2.setAge(26);
        System.out.println("\n이름 : " + cat2.getName());
        System.out.println("나이 : " + cat2.getAge());

        Cat cat3 = new Cat("나비", 24);
        System.out.println("\n이름 : " + cat3.getName());
        System.out.println("나이 : " + cat3.getAge());

        Cat cat4 = new Cat("코코");
        cat4.setAge(21);
        System.out.println("\n이름 : " + cat4.getName());
        System.out.println("나이 : " + cat4.getAge());

    }
}