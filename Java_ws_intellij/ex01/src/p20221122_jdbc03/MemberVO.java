package p20221122_jdbc03;

public class MemberVO {
    String id;
    String pw;
    String name;
    String tel;

    public MemberVO(String id, String pw, String name, String tel) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.tel = tel;
    }

    public String toString(){
        return "[아이디 : " + id + ", 비밀번호 : " + pw + ", 이름 : " + name
                + ", 전화번호 : " + tel + "]";
    }
}
