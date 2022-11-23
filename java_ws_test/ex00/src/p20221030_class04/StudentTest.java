package p20221030_class04;

public class StudentTest {
    public static void main(String[] args){
        Student s1= new Student("홍길동");
        s1.addSubject("국어", 90);
        s1.addSubject("수학", 80);
        s1.addSubject("영어", 70);
        s1.showInfo();


        Student s2 = new Student("임꺽정");
        s2.addSubject("국어", 80);
        s2.addSubject("영어", 80);
        s2.addSubject("수학", 80);
        s2.showInfo();
    }
}