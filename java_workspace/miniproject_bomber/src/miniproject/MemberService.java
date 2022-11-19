package miniproject;

import java.util.ArrayList;

public class MemberService implements IMemberService{
    MemberDB db = new MemberDB();

    @Override
    public void regMemeber(Member member) {
        db.insert(member);
    }

    @Override
    public int checkId(String id) {
        return db.checkId(id);
    }

    @Override
    public Member getScore(String name) {
        return db.getScore(name);
    }

    @Override
    public ArrayList<Member> getAllScore() {
        return db.selectAll();
    }

    @Override
    public int loginCheck(String id, String pw) {
        return db.loginCheck(id, pw);
    }

}
