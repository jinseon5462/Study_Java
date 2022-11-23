package miniproject;

import java.util.ArrayList;

public interface IService {
    public void regist(MemberVO member);
    public int checkId(String id);

    public int loginCheck(String id, String pw);

    public ArrayList<MemberVO> getList();

    public MemberVO getMember(String id);

    public void setScore(String id, int score);

}