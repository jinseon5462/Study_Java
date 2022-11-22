package practice;

import java.io.Serializable;

public class MemberVO implements Serializable {
    private String id;
    private String pw;
    private String name;
    private int score;

    public MemberVO(String id, String pw, String name) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.score = 0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score += score;
    }

    @Override
    public String toString() {
        return "\n[ 닉네임 : " + name + ", 아이디 : " + id + ", 점수 : " + score +  " ]";
    }
}
