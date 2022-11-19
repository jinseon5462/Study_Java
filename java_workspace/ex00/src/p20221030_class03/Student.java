package p20221030_class03;

/*
1반에 10명 -> 1개반의 각 과목 총점
 */
public class Student {
    String studentName;
    String studentNum;
    Subject[] subjects = new Subject[3];

    public Student(String studentName, String studentNum, Subject java, Subject c, Subject sql){
        this.studentName = studentName;
        this.studentNum = studentNum;
        subjects[0] = java;
        subjects[1] = c;
        subjects[2] = sql;
    }

    public void showInfo(){
        System.out.println(studentName);
        System.out.println(subjects[0].subjectName + " 점수 : " + subjects[0].score);
        System.out.println(subjects[1].subjectName + " 점수 : " + subjects[1].score);
        System.out.println(subjects[2].subjectName + " 점수 : " + subjects[2].score + "\n");
    }
}