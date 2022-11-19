package p20221030_class05;

public class MemberTest {
    public static void main(String[] args) {
        Member m = new Member();
        m.id = "admin";
        m.pw = "1234";
        m.name = "홍길동";

        System.out.println(m);
    }
}