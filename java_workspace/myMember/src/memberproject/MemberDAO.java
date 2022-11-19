package memberproject;

import java.util.HashMap;
import java.util.Map;

public class MemberDAO {
    Map<String, MemberVO> db = new HashMap<>();

    public void insert(MemberVO member){
        db.put(member.getId(), member);
    }

    public MemberVO selectMember(String id){
        MemberVO member = null;
        for(int i = 0; i < db.size(); i++){
            member = db.get(id);
        }
        return member;
    }
    public Map<String, MemberVO> selectAll(){
        return db;
    }

    public void saveDB(){
        // 파일 쓰기

    }

    public void loadDB(){

    }
}
