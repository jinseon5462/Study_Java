package p20221103_inheritance01;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.cry();

        Human h = new Human();
        h.cry();


        Animal x = new Human();

        x.cry();

        System.out.println(x.n);

        Animal[] list = new Animal[3];

        list[0] = new Animal();
        list[1] = new Human();
        list[2] = new Dog();
    }
}