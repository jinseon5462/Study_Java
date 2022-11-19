package p20221030_class05;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args){

        ArrayList<Student> list  = new ArrayList<Student>();

        Student s1 = new Student("James");
        s1.addSubject("국어", 100);
        s1.addSubject("영어", 80);
        s1.addSubject("수학", 80);
        s1.showInfo();
        s1.showTotalScore();
        s1.showAvgScore();

        Student s2 = new Student("Jake");
        s2.addSubject("국어", 80);
        s2.addSubject("영어", 90);
        s2.addSubject("수학", 70);

        s2.showInfo();
        s2.showTotalScore();
        s2.showAvgScore();

        Student s3 = new Student("Luis");
        s3.addSubject("국어", 100);
        s3.addSubject("영어", 80);
        s3.addSubject("수학", 70);
/*
        int total = 0;
        int[] scores = new int[3];

        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < list.get(i).subjects.size(); j++){
                total = total + list.get(i).subjects.get(j).score;
            }
            scores[i] = total;
            total = 0;
        }

        int allTotal = 0;
        for(int i = 0; i < scores.length; i++){
            allTotal = 0;
        }
 */

        // 국어 총점
        int korScore = s1.subjects.get(0).score + s2.subjects.get(0).score + s3.subjects.get(0).score;
        System.out.println("세 학생의 국어 총점은 : " + korScore);
    }
}