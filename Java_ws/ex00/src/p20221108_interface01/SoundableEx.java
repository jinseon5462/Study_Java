package p20221108_interface01;

interface Soundable {
    String sound();
}
class Cat implements Soundable {
    @Override
    public String sound() {
        return "냐옹";
    }
}

class Dog implements Soundable {
    @Override
    public String sound() {
        return "멍멍";
    }
}

public class SoundableEx {
    private static void printSound(Soundable soundable){
        System.out.println(soundable.sound());
    }

    public static void main(String[] args) {
        printSound(new Cat());
        printSound(new Dog());
    }
}
