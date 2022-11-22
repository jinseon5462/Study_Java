package P20221118;

public class Ex02_MyGame2 {
    public static void main(String[] args) {
        Camp2 human = new Camp2();
        Camp2 machine = new Camp2();

        human.set(new Npc1());
        //human.set("홍길동"); //실행하면 에러가 나지만,
        // object 타입은 아무 타입이나 다 받을 수 있으므로 티는 안남(밑줄 알림 x)
        machine.set(new Tank1());

        Npc1 hUnit = (Npc1) human.get();
        Tank1 mUnit = (Tank1) machine.get();

        System.out.println(hUnit);
        System.out.println(mUnit);

    }
}
