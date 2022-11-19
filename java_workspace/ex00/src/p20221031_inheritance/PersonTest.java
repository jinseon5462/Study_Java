package p20221031_inheritance;

public class PersonTest {
    public static void main(String[] args) {
        Student s1 = new Student("홍길동", 18);
        s1.schoolName = "동천고등학교";
        s1.clas = "3학년 1반";
        s1.showInfo();

        Teacher t1 = new Teacher("목련고등학교", "6학년 4반", "역사");
        t1.name = "임꺽정";
        t1.age = 60;
        t1.showInfo();

        Employee emp = new Employee("카카오", "02-633-9549");
        emp.name = "이춘식";
        emp.age = 25;
        emp.place = "판교";
        emp.showInfo();
    }
}