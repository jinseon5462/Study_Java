package miniproject;

import java.util.ArrayList;

public class MemberDB {
    ArrayList<MemberVO> list = new ArrayList<>();


    public void insert(MemberVO member){
        list.add(member);
    }

    public int checkId(String id){
        int result = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getId().equals(id)){
                result = 1; // 아이디가 중복이면 1을 반환.
                break;
            }
        }
        return result;
    }
    // 단일점수 조회
    public MemberVO getScore(String name){
        MemberVO member = null;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getName().equals(name)){
                member = list.get(i);
                break;
            }
        }
        return member;
    }

    // 전체점수 조회
    public ArrayList<MemberVO> selectAll(){
        return list;
    }

    public int loginCheck(String id, String pw){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getId().equals(id) && list.get(i).getPw().equals(pw)){
                return 1;   // 로그인 성공이면 1을 반환
            }
        }
        return 0;
    }
}
