package memberproject;

import java.util.ArrayList;

public interface IService {
    public void regist(MemberVO m);
    public MemberVO getMember(String id);

    public ArrayList<MemberVO> getList();
}
