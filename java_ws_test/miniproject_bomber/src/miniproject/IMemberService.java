package miniproject;

import java.util.ArrayList;

public interface IMemberService {
    public void regMemeber(Member member);
    public int checkId(String id);
    public Member getScore(String name);
    public ArrayList<Member> getAllScore();

    public int loginCheck(String id, String pw);
}
