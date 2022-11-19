package p20221030_class05;

import java.util.ArrayList;

public class Student {
    String name;
    String studentNum;
    static int num;
    ArrayList<Subject> subjects;

    public Student(String name){
        num++;
        this.name = name;
        studentNum = "s-" + num;
        subjects = new ArrayList<Subject>();
    }

    public void addSubject(String subName, int score){
        Subject sub = new Subject(subName, score);
        subjects.add(sub);
    }

    public void showTotalScore(){ // 총점
        int totalScore = subjects.get(0).score + subjects.get(1).score + subjects.get(2).score;
        System.out.println(name + "의 총점은 " + totalScore + "점 입니다.");
    }

    public void showAvgScore(){ // 평균
        double avgScore = (subjects.get(0).score + subjects.get(1).score + subjects.get(2).score) / 3;
        System.out.println(name + "의 평균점수는 " + avgScore + "점 입니다.");
    }

    public void showInfo(){
        System.out.println("\n학생 이름 : " + name);
        System.out.println("학번 : " + studentNum);
        System.out.println(subjects.get(0).subName + "의 점수는" + subjects.get(0).score + "점 입니다.");
        System.out.println(subjects.get(1).subName + "의 점수는" + subjects.get(1).score + "점 입니다.");
        System.out.println(subjects.get(2).subName + "의 점수는" + subjects.get(2).score + "점 입니다.");
        System.out.println();
    }
}