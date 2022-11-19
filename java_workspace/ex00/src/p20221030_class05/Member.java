package p20221030_class05;

public class Member {
    String id;
    String pw;
    String name;

    @Override   // 재정의
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
    /*

    public String toString(){
        return "id : " + id +",pw : " + pw + ",name : " + name;
    }
     */
}