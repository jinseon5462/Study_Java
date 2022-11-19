package p20221031_inheritance;

public class Cat extends Animal {

    int speed;

    @Override
    public void eat(){
        System.out.println("고양이 사료를 먹는다.");
    }

}