package member;

import java.util.ArrayList;

public class MemberService implements IMemberService {

    MemberDB db = new MemberDB();

    @Override
    public int checkId(String id) {
        return db.checkId(id);
    }

    // Create
    @Override
    public void regMember(MemberVO member) {
        db.insertMember(member);
    }
    // Read
    @Override
    public MemberVO getMember(String id) {
        return db.selectMember(id);
    }
    // getList
    @Override
    public ArrayList<MemberVO> getMemberList() {
        return db.getList();
    }

    // Update
    @Override
    public void updateMember(MemberVO member) {
        db.update(member);
    }

    // Delete
    @Override
    public void removeMember(String id) {
        db.delete(id);
    }

    public int login(String id, String pw){
        return db.login(id, pw);
    }
}