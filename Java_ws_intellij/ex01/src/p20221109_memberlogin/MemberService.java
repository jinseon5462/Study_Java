package p20221109_memberlogin;

import java.util.ArrayList;

public class MemberService implements IMemberService{

    MemberDB db = new MemberDB();

    @Override
    public void regMember(MemberVO member) {
        db.insertMember(member);
    }

    @Override
    public ArrayList<MemberVO> getMemberList() {
        return db.selectAll();
    }

    @Override
    public MemberVO getMember(String id) {
        MemberVO member = null;
        member = db.select(id);
        return member;
    }

    @Override
    public void removeMember(String id) {
        db.delete(id);
    }

    @Override
    public int checkId(String id) {
        return db.idCheck(id);
    }

    @Override
    public void modify(MemberVO member) {
        db.update(member);
    }
}