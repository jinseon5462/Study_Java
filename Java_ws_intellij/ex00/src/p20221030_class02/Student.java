package p20221030_class02;

public class Student {
    private String name;
    private String number;
    private int age;
    private String national;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setNumber(String number){
        this.number = number;
    }

    public String getNumber(){
        return number;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

}