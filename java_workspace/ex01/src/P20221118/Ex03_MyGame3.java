package P20221118;


class Npc3{
    public String toString(){
        return "This is a Npc3";
    }
}

class Tank3{
    public String toString(){
        return "This is a Tank3";
    }
}

class Camp3{
    private Object unit;

    public Object get() {
        return unit;
    }

    public void set(Object unit) {
        this.unit = unit;
    }

}

public class Ex03_MyGame3 {
    public static void main(String[] args) {
        Camp3 human = new Camp3();
        Camp3 machine = new Camp3();

        human.set("홍길동");
        //"This is a Npc3"이 출력이 되어야하는데 그렇지 않음. -> 문자열 자체를 넣었기 때문
        //유닛이 아닌 문자열 자체를 넣었으나, 에러나지 않음.
        // 그러나 개발자의 의도대로 실제 기능하지 않는다. object의 단점
        machine.set("사이보그");

        System.out.println(human.get());
        System.out.println(machine.get());
    }

}
