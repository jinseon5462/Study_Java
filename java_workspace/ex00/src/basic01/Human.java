package basic01;

public class Human {
    String name;    // 이름
    String nationality; // 국적
    char gender;    // 성
    static int count;

    public Human(String name, String nationality, char gender){
        this.name = name;
        this.nationality = nationality;
        this.gender = gender;
        count++;
    }

    public Human(){}

    public Human(String name){
        this.name = name;
    }

    public void showInfo(){
        System.out.println("이름 : " + name);
        System.out.println("국적 : " + nationality);
        System.out.println("성별 : " + gender);
        System.out.println();
    }
    public int getCount(){
        return count;
    }
}