package basic01;

public class PersonTest {
    public static void main(String[] args){
        Person p1 = new Person();
        p1.setName("이진선");
        p1.setAge(25);
        p1.showInfo();

        Person p2 = new Person();
        p2.setName("이진순");
        p2.setAge(25);
        p2.showInfo();

    }
}