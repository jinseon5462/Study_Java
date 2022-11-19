package p20221030_class03;


public class Test {
    public static void main(String[] args){

        Subject java1 = new Subject("Java", 90);
        Subject c1 = new Subject("C", 80);
        Subject sql1 = new Subject("SQL", 70);

        Student student1 = new Student("홍길동", "1", java1, c1, sql1);

        Subject java2 = new Subject("Java", 94);
        Subject c2 = new Subject("C", 72);
        Subject sql2 = new Subject("SQL", 70);

        Student student2 = new Student("임꺽정", "2", java2, c2, sql2);

        Subject java3 = new Subject("Java", 95);
        Subject c3 = new Subject("C", 82);
        Subject sql3 = new Subject("SQL", 88);

        Student student3 = new Student("이순신", "3", java3, c3, sql3);

        student1.showInfo();
        student2.showInfo();
        student3.showInfo();

    }
}