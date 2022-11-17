package member;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class MemberDAO implements Serializable {

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
}
