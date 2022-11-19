package basic01;

public class Person {
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void showInfo(){
        System.out.println(name);
        System.out.println(age + "\n");

    }

}