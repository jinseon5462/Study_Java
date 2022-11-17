package p20221109_member;

import java.util.ArrayList;

public class MemberService implements IMemberService {
    MemberDB db = new MemberDB();
    @Override
    public void regMember(MemberVO member) {
        db.insert(member);
    }

    public boolean checkId(String checkId){
        boolean tf = false;
        for(int i = 0; i < db.mList.size(); i++){
            if(db.mList.get(i).getId().equals(checkId)){
                tf = true;
            }else{
                tf = false;
            }
        }
        return tf;
    }

    public MemberVO getMember(String id){
        MemberVO info = db.select(id);
        return info;
    }

    public void changeMember(String checkId, int select, String changeInfo){
        db.update(checkId, select, changeInfo);
    }

    public void deleteMember(String id){
        db.delete(id);
    }
    public ArrayList<MemberVO> getMemberList(){
        return db.selectAll();
    }

    /*
    public boolean loginCheck(){
        boolean tf = true;
        for(int i = 0; i < db.mList.size(); i++){
            if()
        }
        return tf;
    }

     */
}
