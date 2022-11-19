package p20221029_class01;

public class StudentTest {
    public static void main(String[] args){
        Student student1 = new Student();
        student1.name = "이순신";
        student1.korScore = 90;
        student1.engScore = 80;
        student1.mathScore = 80;
        student1.getTotal();
        student1.showInfo();

        Student student2 = new Student("이성계", 90, 80, 70);
        student2.getTotal();
        student2.showInfo();

        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        int studentTotal = 0;

        for(int i = 0; i < students.length; i++){
            studentTotal = studentTotal + students[i].total;

        }

        System.out.println("학생들의 총점은 : " + studentTotal);
    }
}