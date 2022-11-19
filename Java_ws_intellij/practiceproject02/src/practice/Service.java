package practice;

import java.io.IOException;
import java.util.ArrayList;

public class Service implements IService{
    MemberDAO dao = new MemberDAO();

    @Override
    public void regist(MemberVO member) {
        dao.insert(member);
    }

    @Override
    public int checkId(String id) {
        return dao.checkId(id);
    }

    @Override
    public int loginCheck(String id, String pw) {
        return dao.loginCheck(id, pw);
    }

    public String getMemberName(String id){
       return dao.getName(id);
    }

    @Override
    public ArrayList<MemberVO> getList() {
        return dao.getList();
    }

    @Override
    public MemberVO getMember(String id) {
        return dao.getMember(id);
    }

    public void saveDB(){
        dao.saveDB();
    }

    /*
    public void loadDB(){
        dao.loadDB();
    }
     */

    @Override
    public void setScore(String id, int score){
        dao.setScore(id, score);
    }
}
