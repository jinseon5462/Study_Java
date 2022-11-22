package miniproject;

import java.util.ArrayList;

public interface IMemberService {
    public void regMember(MemberVO member);
    public int checkId(String id);
    public MemberVO getScore(String name);
    public ArrayList<MemberVO> getAllScore();

    public int loginCheck(String id, String pw);
}
