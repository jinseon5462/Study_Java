package p20221109_memberlogin;

import java.util.ArrayList;

public interface IMemberService {
    public int checkId(String id);
    public void regMember(MemberVO member);
    public void modify(MemberVO member);
    public ArrayList<MemberVO> getMemberList();
    public MemberVO	getMember(String id);
    public void removeMember(String id);
}
