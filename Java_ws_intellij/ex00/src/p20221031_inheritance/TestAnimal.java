package p20221031_inheritance;

public class TestAnimal {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Tiger tiger = new Tiger();

        System.out.println(cat instanceof Animal);

        /*
        Animal[] animals = new Animal[3];
        animals[0] = cat;
        animals[1] = dog;
        animals[2] = tiger;

        for(int i = 0; i < animals.length; i++){
            animals[i].eat();
        }
         */
    }
}