package p20221030_class04;

import java.util.ArrayList;

public class Student {
    static int num = 1; // 학생객체가 생성될때마다 증가
    String studentNumber;   // 학번
    String name;    // 이름
    ArrayList<Subject> subjects;    // Subject타입의 ArrayList

    public Student(String name){
        this.name = name;
        this.studentNumber = "Student-" + num;  // 학번부여
        subjects = new ArrayList<>();   // 학생인스턴스가 생성될때마다 그 학생의 Subject ArrayList생성
        num++;
    }

    public void addSubject(String sName, int score){
        Subject sub = new Subject(sName, score);
        subjects.add(sub);
    }

    public void showInfo(){
        System.out.println("학생 이름 : " + name);
        System.out.println("학번 : " + studentNumber);
        System.out.println(subjects.get(0).sName + "의 점수는 " + subjects.get(0).score + "점");
        System.out.println(subjects.get(1).sName + "의 점수는 " + subjects.get(1).score + "점");
        System.out.println(subjects.get(2).sName + "의 점수는 " + subjects.get(2).score + "점");
        System.out.println();

    }
}