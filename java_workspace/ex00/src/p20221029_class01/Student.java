package p20221029_class01;

public class Student {
    String name;
    int korScore;
    int engScore;
    int mathScore;
    int total;

    //기본 생성자
    public Student(){}

    //학생의 이름, 국어점수, 영어점수, 수학점수를 초기화 하는 생성자
    public Student(String name, int korScore, int engScore, int mathScore){
        this.name = name;
        this.korScore = korScore;
        this.engScore = engScore;
        this.mathScore = mathScore;
    }

    // 총점을 계산해주는 메서드
    public int getTotal(){
        total = korScore + engScore + mathScore;
        return total;
    }

    // 학생의 이름과 총점을 화면에 출력해주는 멤버 메서드
    public void showInfo(){
        System.out.println("\n이름 : " + name + "\n총점 : " + total);
    }
}