package chapter04_classEx03;

public class Student {
    private int age;

    public void setAge(int age){
        if(age < 0) {
            this.age = 0;
        }else {
            this.age = age;
        }
    }
}
