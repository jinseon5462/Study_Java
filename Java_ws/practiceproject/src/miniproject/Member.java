package miniproject;

public class Member {
    private String name;
    private String id;
    private String pw;
    private int score;

    public Member(String name, String id, String pw){
        this.name = name;
        this.id = id;
        this.pw = pw;
        this.score = 0;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    @Override
    public String toString(){
        return "[닉네임 : " + name + ", 점수 : " + score + "]";
    }
}
