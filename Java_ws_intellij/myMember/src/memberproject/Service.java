package memberproject;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/*
서비스가 DAO한테 DB관련 일을 시킨다.
서비스에서 DAO의 메소드를 사용한다.
그래서 서비스 클래스에는 DAO 객체가 있어야 한다.(일을 시켜야 한다.)
 */
public class Service implements IService{

    MemberDAO dao = new MemberDAO();

    @Override
    public void regist(MemberVO member) {
        dao.insert(member);
    }

    @Override
    public MemberVO getMember(String id) {
        return dao.selectMember(id);
    }

    @Override
    public ArrayList<MemberVO> getList() {
        ArrayList<MemberVO> list = new ArrayList<>();
        Map<String, MemberVO> db = dao.selectAll();
        Set<String> keys = db.keySet();

        for(String key : keys){
            MemberVO member = db.get(key);
            list.add(member);
        }
        return list;
    }
    public void saveDB(){
        dao.saveDB();
    }
}
