package member;

import java.util.ArrayList;

public class MemberDB {

    ArrayList<MemberVO> mList = new ArrayList<>();

    // 아이디 중복체크
    public int checkId(String id) {
        for(int i = 0; i < mList.size(); i++) {
            if(mList.get(i).getId().equals(id)) {
                return 0;   // 아이디 중복일때
            }
        }
        return 1;
    }

    // Create
    public void insertMember(MemberVO member) {
        mList.add(member);
    }

    // Read
    public MemberVO selectMember(String id) {
        MemberVO member = null;
        for(int i = 0; i < mList.size(); i++) {
            if(mList.get(i).getId().equals(id)) {
                member = mList.get(i);
            }
        }
        return member;
    }

    // 리스트 가져오기
    public ArrayList<MemberVO> getList() {
        return mList;
    }

    // Update
    public void update(MemberVO member) {
        MemberVO memb = null;
        for(int i = 0; i < mList.size(); i++) {
            if(mList.get(i).getId().equals(member.getId())) {
                memb = mList.get(i);
                break;
            }
        }
        if(member.getPw().trim().length() != 0) {
            memb.setPw(member.getPw());
        }
        if(member.getName().trim().length() != 0) {
            memb.setName(member.getName());
        }
        if(member.getTel().trim().length() != 0) {
            memb.setTel(member.getTel());
        }
    }

    // Delete
    public void delete(String id) {
        for(int i = 0; i < mList.size(); i++) {
            if(mList.get(i).getId().equals(id)) {
                mList.remove(i);
                break;
            }
        }

    }

    public int login(String id, String pw) {
        int result = 0;
        for(int i = 0; i < mList.size(); i++) {
            // 아이디와 비밀번호가
            if(mList.get(i).getId().equals(id) && mList.get(i).getPw().equals(pw)){
                result = 1;
            }
        }
        return result;
    }
}