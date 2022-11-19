package memberproject;
import java.util.ArrayList;

public interface IMemberService {

    // 중복체크
    public int checkId(String id);
    // Create
    public void regMember(MemberVO member);
    // Read
    public MemberVO getMember(String id);
    // List
    public ArrayList<MemberVO> getMemberList();
    // Update
    public void updateMember(MemberVO member);
    // Delete
    public void removeMember(String id);
    // Login
    public int login(String id, String pw);
}