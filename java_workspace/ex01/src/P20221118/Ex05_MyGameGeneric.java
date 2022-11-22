package P20221118;

//Camp5
public class Ex05_MyGameGeneric {
    public static void main(String[] args) {
        Camp5<Npc1> human = new Camp5<>();
        Camp5<Tank1> machine = new Camp5<>();
        Camp5<Student> stu = new Camp5<>();

        human.set(new Npc1());
        //human.set("홍길동"); //error 타입제한이 걸려있다 <Npc1>
        machine.set(new Tank1());
        stu.set(new Student());

        Npc1 hUnit = human.get();
        Tank1 mUnit = machine.get();
        Student s = stu.get();

        System.out.println(hUnit);
        System.out.println(mUnit);

        System.out.println(s);
        //or System.out.println(stu.get());

    }
}
