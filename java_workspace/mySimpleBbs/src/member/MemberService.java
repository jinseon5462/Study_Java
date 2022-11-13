package member;

import java.util.ArrayList;

public class MemberService implements IMemberService {

    MemberDB db = new MemberDB();

    public int checkId(String id) {
        return db.checkId(id);
    }

    // Create
    public void regMember(MemberVO member) {
        db.insertMember(member);
    }
    // Read
    public MemberVO getMember(String id) {
        return db.selectMember(id);
    }
    // getList
    public ArrayList<MemberVO> getMemberList() {
        return db.getList();
    }

    // Update
    public void updateMember(MemberVO member) {
        db.update(member);
    }

    // Delete
    public void removeMember(String id) {
        db.delete(id);
    }

    public int login(String id, String pw){
        return db.login(id, pw);
    }
}