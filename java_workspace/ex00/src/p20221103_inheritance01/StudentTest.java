package p20221103_inheritance01;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("홍길동");
        s1.age = 25;
        s1.gender = "Male";

        System.out.println(s1.getName());
    }
}