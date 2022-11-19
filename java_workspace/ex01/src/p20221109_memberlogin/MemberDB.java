package p20221109_memberlogin;

import java.util.ArrayList;

public class MemberDB {
    ArrayList<MemberVO> mList;

    public MemberDB() {
        mList = new ArrayList<>();
    }

    public int idCheck(String id) {

        for(int i = 0; i < mList.size(); i++) {
            if(mList.get(i).getId().equals(id)) {
                return 0;
            }
        }
        return 1;
    }

    public void insertMember(MemberVO member) {
        mList.add(member);
    }

    public ArrayList<MemberVO> selectAll(){
        return mList;
    }

    public MemberVO select(String id) {
        MemberVO member = null;
        for(int i = 0; i < mList.size(); i++) {
            if(mList.get(i).getId().equals(id)) {
                member = mList.get(i);
            }
        }
        return member;
    }

    public void delete(String id) {
        for(int i = 0; i < mList.size(); i++) {
            if(mList.get(i).getId().equals(id)) {
                mList.remove(i);
                break;
            }
        }
    }

    public void update(MemberVO member) {
        //int idx = -1;
        MemberVO m = null;
        for(int i = 0; i < mList.size(); i++) {
            if(mList.get(i).getId().equals(member.getId())) {
                //idx = i;
                m = mList.get(i);
                break;
            }
        }
        if(member.getPw().trim().length() != 0) {
            m.setPw(member.getPw());
        }
        if(member.getName().trim().length() != 0) {
            m.setName(member.getName());
        }
        if(member.getTel().trim().length() != 0) {
            m.setTel(member.getTel());
        }
    }
}
