package basic01;

public class Student {
    int studentNum;
    String name;
    int grade;
    int clas;

    public Student(){
        this("이름없음", 1);
    }

    public Student(String name, int studentNum){
        this.name = name;
        this.studentNum = studentNum;
    }

    public Student(int studentNum, String name, int grade, int clas){
        this.studentNum = studentNum;
        this.name = name;
        this.grade = grade;
        this.clas = clas;
    }

    public void showInfo(){
        System.out.println("이름 : " + name);
        System.out.println("학년 : " + grade + "학년");
        System.out.println("  반 : " + clas + "반");
        System.out.println("번호 : " + studentNum + "번");
        System.out.println();
    }
}