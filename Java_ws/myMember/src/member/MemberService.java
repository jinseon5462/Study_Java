package member;

public class MemberService implements IService{

    MemberDAO db = new MemberDAO();

    @Override
    public void regist(MemberVO m) {
        db.insert(m);
    }

    @Override
    public MemberVO getMember(String id) {
        return db.selectMember(id);
    }
}
