package exam;


import java.util.ArrayList;

public interface IMemberService {
    public void regist(MemberVO member);
    public MemberVO getMember(String id);
    public ArrayList<MemberVO> getList();
    public void modify(MemberVO member);
    public void remove(String id);
}
