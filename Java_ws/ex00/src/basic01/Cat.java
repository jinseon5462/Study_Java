package basic01;

public class Cat {
    private String name;
    private int age;
    String result;


    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public Cat(){}  //디폴트생성자

    public Cat(String name, int age){   //생성자 오버로드
        this.name = name;
        this.age = age;
    }
    public Cat(String name){
        this.name = name;
    }

    public void showCatInfo(){
        System.out.println("이름 : " + name + "나이 : " + age);
    }
}