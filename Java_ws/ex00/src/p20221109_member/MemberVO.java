package p20221109_member;

public class MemberVO {
    private String id;
    private String pw;
    private String name;
    private String tel;

    public MemberVO(String id, String pw, String name, String tel){
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.tel = tel;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }


    public String getId() {
        return id;
    }

    public String getPw() {
        return pw;
    }

    public String getName() {
        return name;
    }

    public String getTel() {
        return tel;
    }
    public String toString(){
        String s = "[아이디 : " + id + ", 비밀번호 : " + pw + ", 이름 : " + name + ", 전화번호 : " + tel + "]";
        return s;
    }
}
