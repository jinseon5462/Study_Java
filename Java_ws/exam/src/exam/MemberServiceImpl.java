package exam;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

public class MemberServiceImpl implements IMemberService{
    MemberDB dao = new MemberDB();

    @Override
    public void regist(MemberVO member) {
        dao.insert(member);
    }

    @Override
    public MemberVO getMember(String id) {
        return dao.selectOne(id);
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

    @Override
    public void modify(MemberVO member) {
        dao.update(member);
    }

    @Override
    public void remove(String id) {
        dao.delete(id);
    }

    public void saveDB(){
        dao.saveDB();
    }

    public void loadDB(){
        dao.loadDB();
    }
}
