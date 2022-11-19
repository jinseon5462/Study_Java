package p20221031_inheritance;

/**
 * Person(부모 클래스)
 * 이름
 * 나이
 */
public class Person {
    String name;
    int age;

    Person(){
        System.out.println("\nPerson() 생성자");
    }
}

/**
 * Student(자식 클래스)
 * 다니는 학교
 * 학년, 반
 */
class Student extends Person {
    String schoolName;
    String clas;

    Student(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Student() 생성자");
    }

    void showInfo(){
        System.out.println("이름 : " + name + "\n나이 : " + age);
        System.out.println("학교 : " + schoolName + "\n학년, 반 : " + clas);
    }
}

/**
 * Teacher(자식 클래스)
 * 근무 학교
 * 전담반
 * 담당과목
 */
class Teacher extends Person {
    String school;
    String clas;
    String subject;

    Teacher(String school, String clas, String subject){
        this.school = school;
        this.clas = clas;
        this.subject = subject;
        System.out.println("Teacher() 생성자");
    }

    void showInfo(){
        System.out.println("이름 : " + name + "\n나이 : " + age);
        System.out.println("학교 : " + school + "\n학년,반 : " + clas + "\n과목 : " + subject);
    }
}

/**
 * Employee(자식 클래스)
 * 회사이름
 * 전화번호
 * 근무지
 */
class Employee extends Person {
    String company;
    String tel;
    String place;
    Employee(String company, String tel){
        this.company = company;
        this.tel = tel;
        System.out.println("Employee() 생성");
    }

    void showInfo(){
        System.out.println("이름 : " + name + "\n나이 : " + age);
        System.out.println("회사 : " + company + "\n부서 전화번호 : " + tel + "\n근무지 : " + place);
    }
}