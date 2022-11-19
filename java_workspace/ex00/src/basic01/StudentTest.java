package basic01;

public class StudentTest {
    public static void main(String[] args) {

        //1.기본생성자 이용
        Student studentLee = new Student();
        studentLee.name = "이순신";
        studentLee.grade = 6;
        studentLee.clas = 1;
        studentLee.studentNum = 20;
        studentLee.showInfo();

        //2. 번호, 이름만 가지고 객체생성
        Student studentKim = new Student("김유신", 21);
        studentKim.grade = 6;
        studentKim.clas = 1;
        studentKim.showInfo();

        //3. 번호, 이름, 학년, 반 전부가진 객체 생성
        Student studentHong = new Student(22, "홍길동", 6, 1);
        studentHong.showInfo();

        Student student1 = new Student();
        student1.showInfo();
    }
}